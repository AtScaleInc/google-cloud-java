// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/tasks/v2beta3/cloudtasks.proto

package com.google.cloud.tasks.v2beta3;

/**
 *
 *
 * <pre>
 * Response message for listing tasks using
 * [ListTasks][google.cloud.tasks.v2beta3.CloudTasks.ListTasks].
 * </pre>
 *
 * Protobuf type {@code google.cloud.tasks.v2beta3.ListTasksResponse}
 */
public final class ListTasksResponse extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.tasks.v2beta3.ListTasksResponse)
    ListTasksResponseOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ListTasksResponse.newBuilder() to construct.
  private ListTasksResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ListTasksResponse() {
    tasks_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private ListTasksResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10:
            {
              if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
                tasks_ = new java.util.ArrayList<com.google.cloud.tasks.v2beta3.Task>();
                mutable_bitField0_ |= 0x00000001;
              }
              tasks_.add(
                  input.readMessage(
                      com.google.cloud.tasks.v2beta3.Task.parser(), extensionRegistry));
              break;
            }
          case 18:
            {
              java.lang.String s = input.readStringRequireUtf8();

              nextPageToken_ = s;
              break;
            }
          default:
            {
              if (!parseUnknownFieldProto3(input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
        tasks_ = java.util.Collections.unmodifiableList(tasks_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.tasks.v2beta3.CloudTasksProto
        .internal_static_google_cloud_tasks_v2beta3_ListTasksResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.tasks.v2beta3.CloudTasksProto
        .internal_static_google_cloud_tasks_v2beta3_ListTasksResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.tasks.v2beta3.ListTasksResponse.class,
            com.google.cloud.tasks.v2beta3.ListTasksResponse.Builder.class);
  }

  private int bitField0_;
  public static final int TASKS_FIELD_NUMBER = 1;
  private java.util.List<com.google.cloud.tasks.v2beta3.Task> tasks_;
  /**
   *
   *
   * <pre>
   * The list of tasks.
   * </pre>
   *
   * <code>repeated .google.cloud.tasks.v2beta3.Task tasks = 1;</code>
   */
  public java.util.List<com.google.cloud.tasks.v2beta3.Task> getTasksList() {
    return tasks_;
  }
  /**
   *
   *
   * <pre>
   * The list of tasks.
   * </pre>
   *
   * <code>repeated .google.cloud.tasks.v2beta3.Task tasks = 1;</code>
   */
  public java.util.List<? extends com.google.cloud.tasks.v2beta3.TaskOrBuilder>
      getTasksOrBuilderList() {
    return tasks_;
  }
  /**
   *
   *
   * <pre>
   * The list of tasks.
   * </pre>
   *
   * <code>repeated .google.cloud.tasks.v2beta3.Task tasks = 1;</code>
   */
  public int getTasksCount() {
    return tasks_.size();
  }
  /**
   *
   *
   * <pre>
   * The list of tasks.
   * </pre>
   *
   * <code>repeated .google.cloud.tasks.v2beta3.Task tasks = 1;</code>
   */
  public com.google.cloud.tasks.v2beta3.Task getTasks(int index) {
    return tasks_.get(index);
  }
  /**
   *
   *
   * <pre>
   * The list of tasks.
   * </pre>
   *
   * <code>repeated .google.cloud.tasks.v2beta3.Task tasks = 1;</code>
   */
  public com.google.cloud.tasks.v2beta3.TaskOrBuilder getTasksOrBuilder(int index) {
    return tasks_.get(index);
  }

  public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;
  private volatile java.lang.Object nextPageToken_;
  /**
   *
   *
   * <pre>
   * A token to retrieve next page of results.
   * To return the next page of results, call
   * [ListTasks][google.cloud.tasks.v2beta3.CloudTasks.ListTasks] with this
   * value as the
   * [page_token][google.cloud.tasks.v2beta3.ListTasksRequest.page_token].
   * If the next_page_token is empty, there are no more results.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   */
  public java.lang.String getNextPageToken() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      nextPageToken_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * A token to retrieve next page of results.
   * To return the next page of results, call
   * [ListTasks][google.cloud.tasks.v2beta3.CloudTasks.ListTasks] with this
   * value as the
   * [page_token][google.cloud.tasks.v2beta3.ListTasksRequest.page_token].
   * If the next_page_token is empty, there are no more results.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   */
  public com.google.protobuf.ByteString getNextPageTokenBytes() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      nextPageToken_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;

  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    for (int i = 0; i < tasks_.size(); i++) {
      output.writeMessage(1, tasks_.get(i));
    }
    if (!getNextPageTokenBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, nextPageToken_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < tasks_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, tasks_.get(i));
    }
    if (!getNextPageTokenBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, nextPageToken_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof com.google.cloud.tasks.v2beta3.ListTasksResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.tasks.v2beta3.ListTasksResponse other =
        (com.google.cloud.tasks.v2beta3.ListTasksResponse) obj;

    boolean result = true;
    result = result && getTasksList().equals(other.getTasksList());
    result = result && getNextPageToken().equals(other.getNextPageToken());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (getTasksCount() > 0) {
      hash = (37 * hash) + TASKS_FIELD_NUMBER;
      hash = (53 * hash) + getTasksList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.tasks.v2beta3.ListTasksResponse parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.tasks.v2beta3.ListTasksResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.tasks.v2beta3.ListTasksResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.tasks.v2beta3.ListTasksResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.tasks.v2beta3.ListTasksResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.tasks.v2beta3.ListTasksResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.tasks.v2beta3.ListTasksResponse parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.tasks.v2beta3.ListTasksResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.tasks.v2beta3.ListTasksResponse parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.tasks.v2beta3.ListTasksResponse parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.tasks.v2beta3.ListTasksResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.tasks.v2beta3.ListTasksResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(com.google.cloud.tasks.v2beta3.ListTasksResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   *
   *
   * <pre>
   * Response message for listing tasks using
   * [ListTasks][google.cloud.tasks.v2beta3.CloudTasks.ListTasks].
   * </pre>
   *
   * Protobuf type {@code google.cloud.tasks.v2beta3.ListTasksResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.tasks.v2beta3.ListTasksResponse)
      com.google.cloud.tasks.v2beta3.ListTasksResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.tasks.v2beta3.CloudTasksProto
          .internal_static_google_cloud_tasks_v2beta3_ListTasksResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.tasks.v2beta3.CloudTasksProto
          .internal_static_google_cloud_tasks_v2beta3_ListTasksResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.tasks.v2beta3.ListTasksResponse.class,
              com.google.cloud.tasks.v2beta3.ListTasksResponse.Builder.class);
    }

    // Construct using com.google.cloud.tasks.v2beta3.ListTasksResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getTasksFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (tasksBuilder_ == null) {
        tasks_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        tasksBuilder_.clear();
      }
      nextPageToken_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.tasks.v2beta3.CloudTasksProto
          .internal_static_google_cloud_tasks_v2beta3_ListTasksResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.tasks.v2beta3.ListTasksResponse getDefaultInstanceForType() {
      return com.google.cloud.tasks.v2beta3.ListTasksResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.tasks.v2beta3.ListTasksResponse build() {
      com.google.cloud.tasks.v2beta3.ListTasksResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.tasks.v2beta3.ListTasksResponse buildPartial() {
      com.google.cloud.tasks.v2beta3.ListTasksResponse result =
          new com.google.cloud.tasks.v2beta3.ListTasksResponse(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (tasksBuilder_ == null) {
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
          tasks_ = java.util.Collections.unmodifiableList(tasks_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.tasks_ = tasks_;
      } else {
        result.tasks_ = tasksBuilder_.build();
      }
      result.nextPageToken_ = nextPageToken_;
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return (Builder) super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.tasks.v2beta3.ListTasksResponse) {
        return mergeFrom((com.google.cloud.tasks.v2beta3.ListTasksResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.tasks.v2beta3.ListTasksResponse other) {
      if (other == com.google.cloud.tasks.v2beta3.ListTasksResponse.getDefaultInstance())
        return this;
      if (tasksBuilder_ == null) {
        if (!other.tasks_.isEmpty()) {
          if (tasks_.isEmpty()) {
            tasks_ = other.tasks_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureTasksIsMutable();
            tasks_.addAll(other.tasks_);
          }
          onChanged();
        }
      } else {
        if (!other.tasks_.isEmpty()) {
          if (tasksBuilder_.isEmpty()) {
            tasksBuilder_.dispose();
            tasksBuilder_ = null;
            tasks_ = other.tasks_;
            bitField0_ = (bitField0_ & ~0x00000001);
            tasksBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getTasksFieldBuilder()
                    : null;
          } else {
            tasksBuilder_.addAllMessages(other.tasks_);
          }
        }
      }
      if (!other.getNextPageToken().isEmpty()) {
        nextPageToken_ = other.nextPageToken_;
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.google.cloud.tasks.v2beta3.ListTasksResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.tasks.v2beta3.ListTasksResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int bitField0_;

    private java.util.List<com.google.cloud.tasks.v2beta3.Task> tasks_ =
        java.util.Collections.emptyList();

    private void ensureTasksIsMutable() {
      if (!((bitField0_ & 0x00000001) == 0x00000001)) {
        tasks_ = new java.util.ArrayList<com.google.cloud.tasks.v2beta3.Task>(tasks_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.tasks.v2beta3.Task,
            com.google.cloud.tasks.v2beta3.Task.Builder,
            com.google.cloud.tasks.v2beta3.TaskOrBuilder>
        tasksBuilder_;

    /**
     *
     *
     * <pre>
     * The list of tasks.
     * </pre>
     *
     * <code>repeated .google.cloud.tasks.v2beta3.Task tasks = 1;</code>
     */
    public java.util.List<com.google.cloud.tasks.v2beta3.Task> getTasksList() {
      if (tasksBuilder_ == null) {
        return java.util.Collections.unmodifiableList(tasks_);
      } else {
        return tasksBuilder_.getMessageList();
      }
    }
    /**
     *
     *
     * <pre>
     * The list of tasks.
     * </pre>
     *
     * <code>repeated .google.cloud.tasks.v2beta3.Task tasks = 1;</code>
     */
    public int getTasksCount() {
      if (tasksBuilder_ == null) {
        return tasks_.size();
      } else {
        return tasksBuilder_.getCount();
      }
    }
    /**
     *
     *
     * <pre>
     * The list of tasks.
     * </pre>
     *
     * <code>repeated .google.cloud.tasks.v2beta3.Task tasks = 1;</code>
     */
    public com.google.cloud.tasks.v2beta3.Task getTasks(int index) {
      if (tasksBuilder_ == null) {
        return tasks_.get(index);
      } else {
        return tasksBuilder_.getMessage(index);
      }
    }
    /**
     *
     *
     * <pre>
     * The list of tasks.
     * </pre>
     *
     * <code>repeated .google.cloud.tasks.v2beta3.Task tasks = 1;</code>
     */
    public Builder setTasks(int index, com.google.cloud.tasks.v2beta3.Task value) {
      if (tasksBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTasksIsMutable();
        tasks_.set(index, value);
        onChanged();
      } else {
        tasksBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of tasks.
     * </pre>
     *
     * <code>repeated .google.cloud.tasks.v2beta3.Task tasks = 1;</code>
     */
    public Builder setTasks(
        int index, com.google.cloud.tasks.v2beta3.Task.Builder builderForValue) {
      if (tasksBuilder_ == null) {
        ensureTasksIsMutable();
        tasks_.set(index, builderForValue.build());
        onChanged();
      } else {
        tasksBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of tasks.
     * </pre>
     *
     * <code>repeated .google.cloud.tasks.v2beta3.Task tasks = 1;</code>
     */
    public Builder addTasks(com.google.cloud.tasks.v2beta3.Task value) {
      if (tasksBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTasksIsMutable();
        tasks_.add(value);
        onChanged();
      } else {
        tasksBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of tasks.
     * </pre>
     *
     * <code>repeated .google.cloud.tasks.v2beta3.Task tasks = 1;</code>
     */
    public Builder addTasks(int index, com.google.cloud.tasks.v2beta3.Task value) {
      if (tasksBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTasksIsMutable();
        tasks_.add(index, value);
        onChanged();
      } else {
        tasksBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of tasks.
     * </pre>
     *
     * <code>repeated .google.cloud.tasks.v2beta3.Task tasks = 1;</code>
     */
    public Builder addTasks(com.google.cloud.tasks.v2beta3.Task.Builder builderForValue) {
      if (tasksBuilder_ == null) {
        ensureTasksIsMutable();
        tasks_.add(builderForValue.build());
        onChanged();
      } else {
        tasksBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of tasks.
     * </pre>
     *
     * <code>repeated .google.cloud.tasks.v2beta3.Task tasks = 1;</code>
     */
    public Builder addTasks(
        int index, com.google.cloud.tasks.v2beta3.Task.Builder builderForValue) {
      if (tasksBuilder_ == null) {
        ensureTasksIsMutable();
        tasks_.add(index, builderForValue.build());
        onChanged();
      } else {
        tasksBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of tasks.
     * </pre>
     *
     * <code>repeated .google.cloud.tasks.v2beta3.Task tasks = 1;</code>
     */
    public Builder addAllTasks(
        java.lang.Iterable<? extends com.google.cloud.tasks.v2beta3.Task> values) {
      if (tasksBuilder_ == null) {
        ensureTasksIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, tasks_);
        onChanged();
      } else {
        tasksBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of tasks.
     * </pre>
     *
     * <code>repeated .google.cloud.tasks.v2beta3.Task tasks = 1;</code>
     */
    public Builder clearTasks() {
      if (tasksBuilder_ == null) {
        tasks_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        tasksBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of tasks.
     * </pre>
     *
     * <code>repeated .google.cloud.tasks.v2beta3.Task tasks = 1;</code>
     */
    public Builder removeTasks(int index) {
      if (tasksBuilder_ == null) {
        ensureTasksIsMutable();
        tasks_.remove(index);
        onChanged();
      } else {
        tasksBuilder_.remove(index);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of tasks.
     * </pre>
     *
     * <code>repeated .google.cloud.tasks.v2beta3.Task tasks = 1;</code>
     */
    public com.google.cloud.tasks.v2beta3.Task.Builder getTasksBuilder(int index) {
      return getTasksFieldBuilder().getBuilder(index);
    }
    /**
     *
     *
     * <pre>
     * The list of tasks.
     * </pre>
     *
     * <code>repeated .google.cloud.tasks.v2beta3.Task tasks = 1;</code>
     */
    public com.google.cloud.tasks.v2beta3.TaskOrBuilder getTasksOrBuilder(int index) {
      if (tasksBuilder_ == null) {
        return tasks_.get(index);
      } else {
        return tasksBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     *
     *
     * <pre>
     * The list of tasks.
     * </pre>
     *
     * <code>repeated .google.cloud.tasks.v2beta3.Task tasks = 1;</code>
     */
    public java.util.List<? extends com.google.cloud.tasks.v2beta3.TaskOrBuilder>
        getTasksOrBuilderList() {
      if (tasksBuilder_ != null) {
        return tasksBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(tasks_);
      }
    }
    /**
     *
     *
     * <pre>
     * The list of tasks.
     * </pre>
     *
     * <code>repeated .google.cloud.tasks.v2beta3.Task tasks = 1;</code>
     */
    public com.google.cloud.tasks.v2beta3.Task.Builder addTasksBuilder() {
      return getTasksFieldBuilder()
          .addBuilder(com.google.cloud.tasks.v2beta3.Task.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * The list of tasks.
     * </pre>
     *
     * <code>repeated .google.cloud.tasks.v2beta3.Task tasks = 1;</code>
     */
    public com.google.cloud.tasks.v2beta3.Task.Builder addTasksBuilder(int index) {
      return getTasksFieldBuilder()
          .addBuilder(index, com.google.cloud.tasks.v2beta3.Task.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * The list of tasks.
     * </pre>
     *
     * <code>repeated .google.cloud.tasks.v2beta3.Task tasks = 1;</code>
     */
    public java.util.List<com.google.cloud.tasks.v2beta3.Task.Builder> getTasksBuilderList() {
      return getTasksFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.tasks.v2beta3.Task,
            com.google.cloud.tasks.v2beta3.Task.Builder,
            com.google.cloud.tasks.v2beta3.TaskOrBuilder>
        getTasksFieldBuilder() {
      if (tasksBuilder_ == null) {
        tasksBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.cloud.tasks.v2beta3.Task,
                com.google.cloud.tasks.v2beta3.Task.Builder,
                com.google.cloud.tasks.v2beta3.TaskOrBuilder>(
                tasks_,
                ((bitField0_ & 0x00000001) == 0x00000001),
                getParentForChildren(),
                isClean());
        tasks_ = null;
      }
      return tasksBuilder_;
    }

    private java.lang.Object nextPageToken_ = "";
    /**
     *
     *
     * <pre>
     * A token to retrieve next page of results.
     * To return the next page of results, call
     * [ListTasks][google.cloud.tasks.v2beta3.CloudTasks.ListTasks] with this
     * value as the
     * [page_token][google.cloud.tasks.v2beta3.ListTasksRequest.page_token].
     * If the next_page_token is empty, there are no more results.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     */
    public java.lang.String getNextPageToken() {
      java.lang.Object ref = nextPageToken_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        nextPageToken_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * A token to retrieve next page of results.
     * To return the next page of results, call
     * [ListTasks][google.cloud.tasks.v2beta3.CloudTasks.ListTasks] with this
     * value as the
     * [page_token][google.cloud.tasks.v2beta3.ListTasksRequest.page_token].
     * If the next_page_token is empty, there are no more results.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     */
    public com.google.protobuf.ByteString getNextPageTokenBytes() {
      java.lang.Object ref = nextPageToken_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        nextPageToken_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * A token to retrieve next page of results.
     * To return the next page of results, call
     * [ListTasks][google.cloud.tasks.v2beta3.CloudTasks.ListTasks] with this
     * value as the
     * [page_token][google.cloud.tasks.v2beta3.ListTasksRequest.page_token].
     * If the next_page_token is empty, there are no more results.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     */
    public Builder setNextPageToken(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      nextPageToken_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * A token to retrieve next page of results.
     * To return the next page of results, call
     * [ListTasks][google.cloud.tasks.v2beta3.CloudTasks.ListTasks] with this
     * value as the
     * [page_token][google.cloud.tasks.v2beta3.ListTasksRequest.page_token].
     * If the next_page_token is empty, there are no more results.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     */
    public Builder clearNextPageToken() {

      nextPageToken_ = getDefaultInstance().getNextPageToken();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * A token to retrieve next page of results.
     * To return the next page of results, call
     * [ListTasks][google.cloud.tasks.v2beta3.CloudTasks.ListTasks] with this
     * value as the
     * [page_token][google.cloud.tasks.v2beta3.ListTasksRequest.page_token].
     * If the next_page_token is empty, there are no more results.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     */
    public Builder setNextPageTokenBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      nextPageToken_ = value;
      onChanged();
      return this;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.cloud.tasks.v2beta3.ListTasksResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.tasks.v2beta3.ListTasksResponse)
  private static final com.google.cloud.tasks.v2beta3.ListTasksResponse DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.tasks.v2beta3.ListTasksResponse();
  }

  public static com.google.cloud.tasks.v2beta3.ListTasksResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListTasksResponse> PARSER =
      new com.google.protobuf.AbstractParser<ListTasksResponse>() {
        @java.lang.Override
        public ListTasksResponse parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new ListTasksResponse(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<ListTasksResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListTasksResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.tasks.v2beta3.ListTasksResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
