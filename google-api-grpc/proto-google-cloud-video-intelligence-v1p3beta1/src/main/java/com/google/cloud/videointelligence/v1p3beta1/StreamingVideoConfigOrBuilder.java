// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/videointelligence/v1p3beta1/video_intelligence.proto

package com.google.cloud.videointelligence.v1p3beta1;

public interface StreamingVideoConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.videointelligence.v1p3beta1.StreamingVideoConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Requested annotation feature.
   * </pre>
   *
   * <code>.google.cloud.videointelligence.v1p3beta1.StreamingFeature feature = 1;</code>
   */
  int getFeatureValue();
  /**
   *
   *
   * <pre>
   * Requested annotation feature.
   * </pre>
   *
   * <code>.google.cloud.videointelligence.v1p3beta1.StreamingFeature feature = 1;</code>
   */
  com.google.cloud.videointelligence.v1p3beta1.StreamingFeature getFeature();

  /**
   *
   *
   * <pre>
   * Config for SHOT_CHANGE_DETECTION.
   * </pre>
   *
   * <code>
   * .google.cloud.videointelligence.v1p3beta1.StreamingShotChangeDetectionConfig shot_change_detection_config = 2;
   * </code>
   */
  boolean hasShotChangeDetectionConfig();
  /**
   *
   *
   * <pre>
   * Config for SHOT_CHANGE_DETECTION.
   * </pre>
   *
   * <code>
   * .google.cloud.videointelligence.v1p3beta1.StreamingShotChangeDetectionConfig shot_change_detection_config = 2;
   * </code>
   */
  com.google.cloud.videointelligence.v1p3beta1.StreamingShotChangeDetectionConfig
      getShotChangeDetectionConfig();
  /**
   *
   *
   * <pre>
   * Config for SHOT_CHANGE_DETECTION.
   * </pre>
   *
   * <code>
   * .google.cloud.videointelligence.v1p3beta1.StreamingShotChangeDetectionConfig shot_change_detection_config = 2;
   * </code>
   */
  com.google.cloud.videointelligence.v1p3beta1.StreamingShotChangeDetectionConfigOrBuilder
      getShotChangeDetectionConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * Config for LABEL_DETECTION.
   * </pre>
   *
   * <code>
   * .google.cloud.videointelligence.v1p3beta1.StreamingLabelDetectionConfig label_detection_config = 3;
   * </code>
   */
  boolean hasLabelDetectionConfig();
  /**
   *
   *
   * <pre>
   * Config for LABEL_DETECTION.
   * </pre>
   *
   * <code>
   * .google.cloud.videointelligence.v1p3beta1.StreamingLabelDetectionConfig label_detection_config = 3;
   * </code>
   */
  com.google.cloud.videointelligence.v1p3beta1.StreamingLabelDetectionConfig
      getLabelDetectionConfig();
  /**
   *
   *
   * <pre>
   * Config for LABEL_DETECTION.
   * </pre>
   *
   * <code>
   * .google.cloud.videointelligence.v1p3beta1.StreamingLabelDetectionConfig label_detection_config = 3;
   * </code>
   */
  com.google.cloud.videointelligence.v1p3beta1.StreamingLabelDetectionConfigOrBuilder
      getLabelDetectionConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * Config for STREAMING_EXPLICIT_CONTENT_DETECTION.
   * </pre>
   *
   * <code>
   * .google.cloud.videointelligence.v1p3beta1.StreamingExplicitContentDetectionConfig explicit_content_detection_config = 4;
   * </code>
   */
  boolean hasExplicitContentDetectionConfig();
  /**
   *
   *
   * <pre>
   * Config for STREAMING_EXPLICIT_CONTENT_DETECTION.
   * </pre>
   *
   * <code>
   * .google.cloud.videointelligence.v1p3beta1.StreamingExplicitContentDetectionConfig explicit_content_detection_config = 4;
   * </code>
   */
  com.google.cloud.videointelligence.v1p3beta1.StreamingExplicitContentDetectionConfig
      getExplicitContentDetectionConfig();
  /**
   *
   *
   * <pre>
   * Config for STREAMING_EXPLICIT_CONTENT_DETECTION.
   * </pre>
   *
   * <code>
   * .google.cloud.videointelligence.v1p3beta1.StreamingExplicitContentDetectionConfig explicit_content_detection_config = 4;
   * </code>
   */
  com.google.cloud.videointelligence.v1p3beta1.StreamingExplicitContentDetectionConfigOrBuilder
      getExplicitContentDetectionConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * Config for STREAMING_OBJECT_TRACKING.
   * </pre>
   *
   * <code>
   * .google.cloud.videointelligence.v1p3beta1.StreamingObjectTrackingConfig object_tracking_config = 5;
   * </code>
   */
  boolean hasObjectTrackingConfig();
  /**
   *
   *
   * <pre>
   * Config for STREAMING_OBJECT_TRACKING.
   * </pre>
   *
   * <code>
   * .google.cloud.videointelligence.v1p3beta1.StreamingObjectTrackingConfig object_tracking_config = 5;
   * </code>
   */
  com.google.cloud.videointelligence.v1p3beta1.StreamingObjectTrackingConfig
      getObjectTrackingConfig();
  /**
   *
   *
   * <pre>
   * Config for STREAMING_OBJECT_TRACKING.
   * </pre>
   *
   * <code>
   * .google.cloud.videointelligence.v1p3beta1.StreamingObjectTrackingConfig object_tracking_config = 5;
   * </code>
   */
  com.google.cloud.videointelligence.v1p3beta1.StreamingObjectTrackingConfigOrBuilder
      getObjectTrackingConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * Streaming storage option. By default: storage is disabled.
   * </pre>
   *
   * <code>.google.cloud.videointelligence.v1p3beta1.StreamingStorageConfig storage_config = 30;
   * </code>
   */
  boolean hasStorageConfig();
  /**
   *
   *
   * <pre>
   * Streaming storage option. By default: storage is disabled.
   * </pre>
   *
   * <code>.google.cloud.videointelligence.v1p3beta1.StreamingStorageConfig storage_config = 30;
   * </code>
   */
  com.google.cloud.videointelligence.v1p3beta1.StreamingStorageConfig getStorageConfig();
  /**
   *
   *
   * <pre>
   * Streaming storage option. By default: storage is disabled.
   * </pre>
   *
   * <code>.google.cloud.videointelligence.v1p3beta1.StreamingStorageConfig storage_config = 30;
   * </code>
   */
  com.google.cloud.videointelligence.v1p3beta1.StreamingStorageConfigOrBuilder
      getStorageConfigOrBuilder();

  public com.google.cloud.videointelligence.v1p3beta1.StreamingVideoConfig.StreamingConfigCase
      getStreamingConfigCase();
}
