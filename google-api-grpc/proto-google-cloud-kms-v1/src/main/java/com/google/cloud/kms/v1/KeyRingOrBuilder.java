// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/kms/v1/resources.proto

package com.google.cloud.kms.v1;

public interface KeyRingOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.kms.v1.KeyRing)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. The resource name for the
   * [KeyRing][google.cloud.kms.v1.KeyRing] in the format
   * `projects/&#42;&#47;locations/&#42;&#47;keyRings/&#42;`.
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Output only. The resource name for the
   * [KeyRing][google.cloud.kms.v1.KeyRing] in the format
   * `projects/&#42;&#47;locations/&#42;&#47;keyRings/&#42;`.
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Output only. The time at which this [KeyRing][google.cloud.kms.v1.KeyRing]
   * was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 2;</code>
   */
  boolean hasCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. The time at which this [KeyRing][google.cloud.kms.v1.KeyRing]
   * was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 2;</code>
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. The time at which this [KeyRing][google.cloud.kms.v1.KeyRing]
   * was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 2;</code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();
}