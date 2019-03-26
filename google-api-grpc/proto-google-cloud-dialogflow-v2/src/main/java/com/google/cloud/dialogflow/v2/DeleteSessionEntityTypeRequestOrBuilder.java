// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dialogflow/v2/session_entity_type.proto

package com.google.cloud.dialogflow.v2;

public interface DeleteSessionEntityTypeRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.v2.DeleteSessionEntityTypeRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The name of the entity type to delete. Format:
   * `projects/&lt;Project ID&gt;/agent/sessions/&lt;Session ID&gt;/entityTypes/&lt;Entity Type
   * Display Name&gt;`.
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Required. The name of the entity type to delete. Format:
   * `projects/&lt;Project ID&gt;/agent/sessions/&lt;Session ID&gt;/entityTypes/&lt;Entity Type
   * Display Name&gt;`.
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  com.google.protobuf.ByteString getNameBytes();
}
