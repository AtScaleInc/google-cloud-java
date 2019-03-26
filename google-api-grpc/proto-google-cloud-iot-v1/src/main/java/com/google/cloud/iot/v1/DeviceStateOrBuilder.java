// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/iot/v1/resources.proto

package com.google.cloud.iot.v1;

public interface DeviceStateOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.iot.v1.DeviceState)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * [Output only] The time at which this state version was updated in Cloud
   * IoT Core.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 1;</code>
   */
  boolean hasUpdateTime();
  /**
   *
   *
   * <pre>
   * [Output only] The time at which this state version was updated in Cloud
   * IoT Core.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 1;</code>
   */
  com.google.protobuf.Timestamp getUpdateTime();
  /**
   *
   *
   * <pre>
   * [Output only] The time at which this state version was updated in Cloud
   * IoT Core.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 1;</code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * The device state data.
   * </pre>
   *
   * <code>bytes binary_data = 2;</code>
   */
  com.google.protobuf.ByteString getBinaryData();
}
