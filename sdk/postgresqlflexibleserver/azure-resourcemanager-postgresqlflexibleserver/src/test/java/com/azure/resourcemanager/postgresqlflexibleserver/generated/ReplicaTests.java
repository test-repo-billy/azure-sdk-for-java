// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.postgresqlflexibleserver.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.postgresqlflexibleserver.models.ReadReplicaPromoteMode;
import com.azure.resourcemanager.postgresqlflexibleserver.models.Replica;
import com.azure.resourcemanager.postgresqlflexibleserver.models.ReplicationPromoteOption;
import com.azure.resourcemanager.postgresqlflexibleserver.models.ReplicationRole;
import org.junit.jupiter.api.Assertions;

public final class ReplicaTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        Replica model = BinaryData.fromString(
            "{\"role\":\"AsyncReplica\",\"capacity\":1026391011,\"replicationState\":\"Updating\",\"promoteMode\":\"switchover\",\"promoteOption\":\"planned\"}")
            .toObject(Replica.class);
        Assertions.assertEquals(ReplicationRole.ASYNC_REPLICA, model.role());
        Assertions.assertEquals(ReadReplicaPromoteMode.SWITCHOVER, model.promoteMode());
        Assertions.assertEquals(ReplicationPromoteOption.PLANNED, model.promoteOption());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        Replica model = new Replica().withRole(ReplicationRole.ASYNC_REPLICA)
            .withPromoteMode(ReadReplicaPromoteMode.SWITCHOVER)
            .withPromoteOption(ReplicationPromoteOption.PLANNED);
        model = BinaryData.fromObject(model).toObject(Replica.class);
        Assertions.assertEquals(ReplicationRole.ASYNC_REPLICA, model.role());
        Assertions.assertEquals(ReadReplicaPromoteMode.SWITCHOVER, model.promoteMode());
        Assertions.assertEquals(ReplicationPromoteOption.PLANNED, model.promoteOption());
    }
}
