// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.spring.cloud.autoconfigure.implementation.aad.filter;

import com.azure.spring.cloud.autoconfigure.implementation.aad.configuration.AadAuthenticationFilterAutoConfiguration;
import com.azure.spring.cloud.autoconfigure.implementation.aad.configuration.properties.AadAuthenticationProperties;
import com.azure.spring.cloud.autoconfigure.implementation.aad.configuration.properties.AadCredentialProperties;
import com.azure.spring.cloud.autoconfigure.implementation.aad.configuration.properties.AadProfileProperties;
import com.azure.spring.cloud.autoconfigure.implementation.aad.security.properties.AadAuthorizationServerEndpoints;
import com.azure.spring.cloud.autoconfigure.implementation.context.AzureGlobalPropertiesAutoConfiguration;
import com.nimbusds.jose.JOSEException;
import com.nimbusds.jose.proc.BadJOSEException;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.boot.autoconfigure.AutoConfigurations;
import org.springframework.boot.autoconfigure.http.HttpMessageConvertersAutoConfiguration;
import org.springframework.boot.autoconfigure.web.client.RestTemplateAutoConfiguration;
import org.springframework.boot.test.context.runner.ApplicationContextRunner;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;

import java.io.IOException;
import java.text.ParseException;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

class AadAuthenticationFilterTests {
    private static final String TOKEN = "dummy-token";
    private final ApplicationContextRunner contextRunner = new ApplicationContextRunner()
            .withConfiguration(AutoConfigurations.of(
                    AzureGlobalPropertiesAutoConfiguration.class,
                    AadAuthenticationFilterAutoConfiguration.class,
                    HttpMessageConvertersAutoConfiguration.class,
                    RestTemplateAutoConfiguration.class));
    private final UserPrincipalManager userPrincipalManager;
    private final HttpServletRequest request;
    private final HttpServletResponse response;
    private final AadAuthenticationFilter filter;

    AadAuthenticationFilterTests() {
        userPrincipalManager = mock(UserPrincipalManager.class);
        request = mock(HttpServletRequest.class);
        response = mock(HttpServletResponse.class);
        AadAuthenticationProperties properties = mock(AadAuthenticationProperties.class);
        when(properties.getCredential()).thenReturn(new AadCredentialProperties());
        when(properties.getProfile()).thenReturn(new AadProfileProperties());
        filter = new AadAuthenticationFilter(
            properties,
            mock(AadAuthorizationServerEndpoints.class),
            userPrincipalManager,
            new RestTemplateBuilder()
        );
    }

    //TODO (Zhou Liu): current test case is out of date, a new test case need to cover here, do it later.
    @Test
    @Disabled
    void doFilterInternal() {
        this.contextRunner.withPropertyValues("spring.cloud.azure.active-directory.credential.client-id", TestConstants.CLIENT_ID)
                .withPropertyValues("spring.cloud.azure.active-directory.credential.client-secret", TestConstants.CLIENT_SECRET)
                .withPropertyValues("spring.cloud.azure.active-directory.credential.client-secret",
                        TestConstants.TARGETED_GROUPS.toString()
                                                     .replace("[", "").replace("]", ""));

        this.contextRunner.run(context -> {
            final HttpServletRequest request = mock(HttpServletRequest.class);
            when(request.getHeader(TestConstants.TOKEN_HEADER)).thenReturn(TestConstants.BEARER_TOKEN);

            final HttpServletResponse response = mock(HttpServletResponse.class);
            final FilterChain filterChain = mock(FilterChain.class);


            final AadAuthenticationFilter azureADJwtTokenFilter = context.getBean(AadAuthenticationFilter.class);
            assertThat(azureADJwtTokenFilter).isNotNull();
            assertThat(azureADJwtTokenFilter).isExactlyInstanceOf(AadAuthenticationFilter.class);

            azureADJwtTokenFilter.doFilterInternal(request, response, filterChain);

            final Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
            assertThat(authentication.getPrincipal()).isNotNull();
            assertThat(authentication.getPrincipal()).isExactlyInstanceOf(UserPrincipal.class);
            assertThat(authentication.getAuthorities()).isNotNull();
            assertThat(authentication.getAuthorities().size()).isEqualTo(2);
            assertThat(authentication.getAuthorities().contains(new SimpleGrantedAuthority("ROLE_group1"))
                    && authentication.getAuthorities().contains(new SimpleGrantedAuthority("ROLE_group2"))
            ).isTrue();

            final UserPrincipal principal = (UserPrincipal) authentication.getPrincipal();
            assertThat(principal.getIssuer()).isNotNull().isNotEmpty();
            assertThat(principal.getKeyId()).isNotNull().isNotEmpty();
            assertThat(principal.getSubject()).isNotNull().isNotEmpty();

            assertThat(principal.getClaims()).isNotNull().isNotEmpty();
            final Map<String, Object> claims = principal.getClaims();
            assertThat(claims.get("iss")).isEqualTo(principal.getIssuer());
            assertThat(claims.get("sub")).isEqualTo(principal.getSubject());
        });
    }

    @Test
    void testTokenNotIssuedByAAD() throws ServletException, IOException {
        when(userPrincipalManager.isTokenIssuedByAad(TOKEN)).thenReturn(false);

        final FilterChain filterChain = (request, response) -> {
            final SecurityContext context = SecurityContextHolder.getContext();
            assertNotNull(context);
            final Authentication authentication = context.getAuthentication();
            assertNull(authentication);
        };

        filter.doFilterInternal(request, response, filterChain);
    }

    @Test
    void testAlreadyAuthenticated() throws ServletException, IOException, ParseException, JOSEException,
        BadJOSEException {
        final Authentication authentication = mock(Authentication.class);
        when(authentication.isAuthenticated()).thenReturn(true);
        when(userPrincipalManager.isTokenIssuedByAad(TOKEN)).thenReturn(true);

        SecurityContextHolder.getContext().setAuthentication(authentication);

        final FilterChain filterChain = (request, response) -> {
            final SecurityContext context = SecurityContextHolder.getContext();
            assertNotNull(context);
            assertNotNull(context.getAuthentication());
            SecurityContextHolder.clearContext();
        };

        filter.doFilterInternal(request, response, filterChain);
        verify(userPrincipalManager, times(0)).buildUserPrincipal(TOKEN);
    }

}
