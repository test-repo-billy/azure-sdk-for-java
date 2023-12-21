# ************************************************************************************************
# ************************ DELETE THIS FILE BEFORE RETURNING TO MAIN REPO ************************
# ************************************************************************************************

#!/bin/bash
set -e

SCOPE_DOWN="--projects com.azure:azure-search-documents,com.azure:azure-client-sdk-parent --also-make"

echo ===========================================================================================================================
echo Build
echo ===========================================================================================================================
mvn -f sdk/search/pom.service.xml -DskipTests -Dmaven.javadoc.skip=true -Dinclude-template package


echo ===========================================================================================================================
echo Test
echo ===========================================================================================================================
mvn -f sdk/search/pom.service.xml -Dmaven.wagon.http.pool=false verify #verify performs test and code coverage reports


echo ===========================================================================================================================
echo Installing Code Quality Tools
echo ===========================================================================================================================
mvn -f eng/code-quality-reports/pom.xml -Dmaven.wagon.http.pool=false install

echo ===========================================================================================================================
echo Install azure-sdk-parent
echo ===========================================================================================================================
mvn -f parent/pom.xml -DskipTests -Dgpg.skip install

echo ===========================================================================================================================
echo Install all client packages
echo ===========================================================================================================================
mvn -f pom.client.xml -DskipTests -Dgpg.skip -Dmaven.javadoc.skip=true -Dcheckstyle.skip=true -Dspotbugs.skip=true $SCOPE_DOWN install

echo ===========================================================================================================================
echo Analyze
echo ===========================================================================================================================
mvn -f pom.client.xml -DskipTests -Dgpg.skip spotbugs:check checkstyle:check $SCOPE_DOWN
