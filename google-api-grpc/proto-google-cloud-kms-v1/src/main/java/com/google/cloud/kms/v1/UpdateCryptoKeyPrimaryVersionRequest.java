// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/kms/v1/service.proto

package com.google.cloud.kms.v1;

/**
 *
 *
 * <pre>
 * Request message for
 * [KeyManagementService.UpdateCryptoKeyPrimaryVersion][google.cloud.kms.v1.KeyManagementService.UpdateCryptoKeyPrimaryVersion].
 * </pre>
 *
 * Protobuf type {@code google.cloud.kms.v1.UpdateCryptoKeyPrimaryVersionRequest}
 */
public final class UpdateCryptoKeyPrimaryVersionRequest
    extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.kms.v1.UpdateCryptoKeyPrimaryVersionRequest)
    UpdateCryptoKeyPrimaryVersionRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use UpdateCryptoKeyPrimaryVersionRequest.newBuilder() to construct.
  private UpdateCryptoKeyPrimaryVersionRequest(
      com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private UpdateCryptoKeyPrimaryVersionRequest() {
    name_ = "";
    cryptoKeyVersionId_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private UpdateCryptoKeyPrimaryVersionRequest(
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
              java.lang.String s = input.readStringRequireUtf8();

              name_ = s;
              break;
            }
          case 18:
            {
              java.lang.String s = input.readStringRequireUtf8();

              cryptoKeyVersionId_ = s;
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
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.kms.v1.KmsProto
        .internal_static_google_cloud_kms_v1_UpdateCryptoKeyPrimaryVersionRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.kms.v1.KmsProto
        .internal_static_google_cloud_kms_v1_UpdateCryptoKeyPrimaryVersionRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.kms.v1.UpdateCryptoKeyPrimaryVersionRequest.class,
            com.google.cloud.kms.v1.UpdateCryptoKeyPrimaryVersionRequest.Builder.class);
  }

  public static final int NAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object name_;
  /**
   *
   *
   * <pre>
   * The resource name of the [CryptoKey][google.cloud.kms.v1.CryptoKey] to
   * update.
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * The resource name of the [CryptoKey][google.cloud.kms.v1.CryptoKey] to
   * update.
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  public com.google.protobuf.ByteString getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CRYPTO_KEY_VERSION_ID_FIELD_NUMBER = 2;
  private volatile java.lang.Object cryptoKeyVersionId_;
  /**
   *
   *
   * <pre>
   * The id of the child
   * [CryptoKeyVersion][google.cloud.kms.v1.CryptoKeyVersion] to use as primary.
   * </pre>
   *
   * <code>string crypto_key_version_id = 2;</code>
   */
  public java.lang.String getCryptoKeyVersionId() {
    java.lang.Object ref = cryptoKeyVersionId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      cryptoKeyVersionId_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * The id of the child
   * [CryptoKeyVersion][google.cloud.kms.v1.CryptoKeyVersion] to use as primary.
   * </pre>
   *
   * <code>string crypto_key_version_id = 2;</code>
   */
  public com.google.protobuf.ByteString getCryptoKeyVersionIdBytes() {
    java.lang.Object ref = cryptoKeyVersionId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      cryptoKeyVersionId_ = b;
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
    if (!getNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
    }
    if (!getCryptoKeyVersionIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, cryptoKeyVersionId_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, name_);
    }
    if (!getCryptoKeyVersionIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, cryptoKeyVersionId_);
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
    if (!(obj instanceof com.google.cloud.kms.v1.UpdateCryptoKeyPrimaryVersionRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.kms.v1.UpdateCryptoKeyPrimaryVersionRequest other =
        (com.google.cloud.kms.v1.UpdateCryptoKeyPrimaryVersionRequest) obj;

    boolean result = true;
    result = result && getName().equals(other.getName());
    result = result && getCryptoKeyVersionId().equals(other.getCryptoKeyVersionId());
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
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    hash = (37 * hash) + CRYPTO_KEY_VERSION_ID_FIELD_NUMBER;
    hash = (53 * hash) + getCryptoKeyVersionId().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.kms.v1.UpdateCryptoKeyPrimaryVersionRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.kms.v1.UpdateCryptoKeyPrimaryVersionRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.kms.v1.UpdateCryptoKeyPrimaryVersionRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.kms.v1.UpdateCryptoKeyPrimaryVersionRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.kms.v1.UpdateCryptoKeyPrimaryVersionRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.kms.v1.UpdateCryptoKeyPrimaryVersionRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.kms.v1.UpdateCryptoKeyPrimaryVersionRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.kms.v1.UpdateCryptoKeyPrimaryVersionRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.kms.v1.UpdateCryptoKeyPrimaryVersionRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.kms.v1.UpdateCryptoKeyPrimaryVersionRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.kms.v1.UpdateCryptoKeyPrimaryVersionRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.kms.v1.UpdateCryptoKeyPrimaryVersionRequest parseFrom(
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

  public static Builder newBuilder(
      com.google.cloud.kms.v1.UpdateCryptoKeyPrimaryVersionRequest prototype) {
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
   * Request message for
   * [KeyManagementService.UpdateCryptoKeyPrimaryVersion][google.cloud.kms.v1.KeyManagementService.UpdateCryptoKeyPrimaryVersion].
   * </pre>
   *
   * Protobuf type {@code google.cloud.kms.v1.UpdateCryptoKeyPrimaryVersionRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.kms.v1.UpdateCryptoKeyPrimaryVersionRequest)
      com.google.cloud.kms.v1.UpdateCryptoKeyPrimaryVersionRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.kms.v1.KmsProto
          .internal_static_google_cloud_kms_v1_UpdateCryptoKeyPrimaryVersionRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.kms.v1.KmsProto
          .internal_static_google_cloud_kms_v1_UpdateCryptoKeyPrimaryVersionRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.kms.v1.UpdateCryptoKeyPrimaryVersionRequest.class,
              com.google.cloud.kms.v1.UpdateCryptoKeyPrimaryVersionRequest.Builder.class);
    }

    // Construct using com.google.cloud.kms.v1.UpdateCryptoKeyPrimaryVersionRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {}
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      name_ = "";

      cryptoKeyVersionId_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.kms.v1.KmsProto
          .internal_static_google_cloud_kms_v1_UpdateCryptoKeyPrimaryVersionRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.kms.v1.UpdateCryptoKeyPrimaryVersionRequest
        getDefaultInstanceForType() {
      return com.google.cloud.kms.v1.UpdateCryptoKeyPrimaryVersionRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.kms.v1.UpdateCryptoKeyPrimaryVersionRequest build() {
      com.google.cloud.kms.v1.UpdateCryptoKeyPrimaryVersionRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.kms.v1.UpdateCryptoKeyPrimaryVersionRequest buildPartial() {
      com.google.cloud.kms.v1.UpdateCryptoKeyPrimaryVersionRequest result =
          new com.google.cloud.kms.v1.UpdateCryptoKeyPrimaryVersionRequest(this);
      result.name_ = name_;
      result.cryptoKeyVersionId_ = cryptoKeyVersionId_;
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
      if (other instanceof com.google.cloud.kms.v1.UpdateCryptoKeyPrimaryVersionRequest) {
        return mergeFrom((com.google.cloud.kms.v1.UpdateCryptoKeyPrimaryVersionRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.kms.v1.UpdateCryptoKeyPrimaryVersionRequest other) {
      if (other
          == com.google.cloud.kms.v1.UpdateCryptoKeyPrimaryVersionRequest.getDefaultInstance())
        return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        onChanged();
      }
      if (!other.getCryptoKeyVersionId().isEmpty()) {
        cryptoKeyVersionId_ = other.cryptoKeyVersionId_;
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
      com.google.cloud.kms.v1.UpdateCryptoKeyPrimaryVersionRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.cloud.kms.v1.UpdateCryptoKeyPrimaryVersionRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object name_ = "";
    /**
     *
     *
     * <pre>
     * The resource name of the [CryptoKey][google.cloud.kms.v1.CryptoKey] to
     * update.
     * </pre>
     *
     * <code>string name = 1;</code>
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The resource name of the [CryptoKey][google.cloud.kms.v1.CryptoKey] to
     * update.
     * </pre>
     *
     * <code>string name = 1;</code>
     */
    public com.google.protobuf.ByteString getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The resource name of the [CryptoKey][google.cloud.kms.v1.CryptoKey] to
     * update.
     * </pre>
     *
     * <code>string name = 1;</code>
     */
    public Builder setName(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      name_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The resource name of the [CryptoKey][google.cloud.kms.v1.CryptoKey] to
     * update.
     * </pre>
     *
     * <code>string name = 1;</code>
     */
    public Builder clearName() {

      name_ = getDefaultInstance().getName();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The resource name of the [CryptoKey][google.cloud.kms.v1.CryptoKey] to
     * update.
     * </pre>
     *
     * <code>string name = 1;</code>
     */
    public Builder setNameBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      name_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object cryptoKeyVersionId_ = "";
    /**
     *
     *
     * <pre>
     * The id of the child
     * [CryptoKeyVersion][google.cloud.kms.v1.CryptoKeyVersion] to use as primary.
     * </pre>
     *
     * <code>string crypto_key_version_id = 2;</code>
     */
    public java.lang.String getCryptoKeyVersionId() {
      java.lang.Object ref = cryptoKeyVersionId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        cryptoKeyVersionId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The id of the child
     * [CryptoKeyVersion][google.cloud.kms.v1.CryptoKeyVersion] to use as primary.
     * </pre>
     *
     * <code>string crypto_key_version_id = 2;</code>
     */
    public com.google.protobuf.ByteString getCryptoKeyVersionIdBytes() {
      java.lang.Object ref = cryptoKeyVersionId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        cryptoKeyVersionId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The id of the child
     * [CryptoKeyVersion][google.cloud.kms.v1.CryptoKeyVersion] to use as primary.
     * </pre>
     *
     * <code>string crypto_key_version_id = 2;</code>
     */
    public Builder setCryptoKeyVersionId(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      cryptoKeyVersionId_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The id of the child
     * [CryptoKeyVersion][google.cloud.kms.v1.CryptoKeyVersion] to use as primary.
     * </pre>
     *
     * <code>string crypto_key_version_id = 2;</code>
     */
    public Builder clearCryptoKeyVersionId() {

      cryptoKeyVersionId_ = getDefaultInstance().getCryptoKeyVersionId();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The id of the child
     * [CryptoKeyVersion][google.cloud.kms.v1.CryptoKeyVersion] to use as primary.
     * </pre>
     *
     * <code>string crypto_key_version_id = 2;</code>
     */
    public Builder setCryptoKeyVersionIdBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      cryptoKeyVersionId_ = value;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.kms.v1.UpdateCryptoKeyPrimaryVersionRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.kms.v1.UpdateCryptoKeyPrimaryVersionRequest)
  private static final com.google.cloud.kms.v1.UpdateCryptoKeyPrimaryVersionRequest
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.kms.v1.UpdateCryptoKeyPrimaryVersionRequest();
  }

  public static com.google.cloud.kms.v1.UpdateCryptoKeyPrimaryVersionRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateCryptoKeyPrimaryVersionRequest> PARSER =
      new com.google.protobuf.AbstractParser<UpdateCryptoKeyPrimaryVersionRequest>() {
        @java.lang.Override
        public UpdateCryptoKeyPrimaryVersionRequest parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new UpdateCryptoKeyPrimaryVersionRequest(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<UpdateCryptoKeyPrimaryVersionRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateCryptoKeyPrimaryVersionRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.kms.v1.UpdateCryptoKeyPrimaryVersionRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
