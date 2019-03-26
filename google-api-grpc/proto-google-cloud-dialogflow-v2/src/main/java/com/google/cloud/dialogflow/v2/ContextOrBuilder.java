// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dialogflow/v2/context.proto

package com.google.cloud.dialogflow.v2;

public interface ContextOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.v2.Context)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The unique identifier of the context. Format:
   * `projects/&lt;Project ID&gt;/agent/sessions/&lt;Session ID&gt;/contexts/&lt;Context ID&gt;`.
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Required. The unique identifier of the context. Format:
   * `projects/&lt;Project ID&gt;/agent/sessions/&lt;Session ID&gt;/contexts/&lt;Context ID&gt;`.
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Optional. The number of conversational query requests after which the
   * context expires. If set to `0` (the default) the context expires
   * immediately. Contexts expire automatically after 10 minutes even if there
   * are no matching queries.
   * </pre>
   *
   * <code>int32 lifespan_count = 2;</code>
   */
  int getLifespanCount();

  /**
   *
   *
   * <pre>
   * Optional. The collection of parameters associated with this context.
   * Refer to [this doc](https://dialogflow.com/docs/actions-and-parameters) for
   * syntax.
   * </pre>
   *
   * <code>.google.protobuf.Struct parameters = 3;</code>
   */
  boolean hasParameters();
  /**
   *
   *
   * <pre>
   * Optional. The collection of parameters associated with this context.
   * Refer to [this doc](https://dialogflow.com/docs/actions-and-parameters) for
   * syntax.
   * </pre>
   *
   * <code>.google.protobuf.Struct parameters = 3;</code>
   */
  com.google.protobuf.Struct getParameters();
  /**
   *
   *
   * <pre>
   * Optional. The collection of parameters associated with this context.
   * Refer to [this doc](https://dialogflow.com/docs/actions-and-parameters) for
   * syntax.
   * </pre>
   *
   * <code>.google.protobuf.Struct parameters = 3;</code>
   */
  com.google.protobuf.StructOrBuilder getParametersOrBuilder();
}
