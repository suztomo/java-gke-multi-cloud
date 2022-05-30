/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/gkemulticloud/v1/azure_resources.proto

package com.google.cloud.gkemulticloud.v1;

public interface AzureClusterResourcesOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.gkemulticloud.v1.AzureClusterResources)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. The ARM ID of the cluster network security group.
   * </pre>
   *
   * <code>string network_security_group_id = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The networkSecurityGroupId.
   */
  java.lang.String getNetworkSecurityGroupId();
  /**
   *
   *
   * <pre>
   * Output only. The ARM ID of the cluster network security group.
   * </pre>
   *
   * <code>string network_security_group_id = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for networkSecurityGroupId.
   */
  com.google.protobuf.ByteString getNetworkSecurityGroupIdBytes();

  /**
   *
   *
   * <pre>
   * Output only. The ARM ID of the control plane application security group.
   * </pre>
   *
   * <code>
   * string control_plane_application_security_group_id = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The controlPlaneApplicationSecurityGroupId.
   */
  java.lang.String getControlPlaneApplicationSecurityGroupId();
  /**
   *
   *
   * <pre>
   * Output only. The ARM ID of the control plane application security group.
   * </pre>
   *
   * <code>
   * string control_plane_application_security_group_id = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The bytes for controlPlaneApplicationSecurityGroupId.
   */
  com.google.protobuf.ByteString getControlPlaneApplicationSecurityGroupIdBytes();
}
