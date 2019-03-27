// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/videointelligence/v1/video_intelligence.proto

package com.google.cloud.videointelligence.v1;

public interface VideoContextOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.videointelligence.v1.VideoContext)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Video segments to annotate. The segments may overlap and are not required
   * to be contiguous or span the whole video. If unspecified, each video is
   * treated as a single segment.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1.VideoSegment segments = 1;</code>
   */
  java.util.List<com.google.cloud.videointelligence.v1.VideoSegment> getSegmentsList();
  /**
   *
   *
   * <pre>
   * Video segments to annotate. The segments may overlap and are not required
   * to be contiguous or span the whole video. If unspecified, each video is
   * treated as a single segment.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1.VideoSegment segments = 1;</code>
   */
  com.google.cloud.videointelligence.v1.VideoSegment getSegments(int index);
  /**
   *
   *
   * <pre>
   * Video segments to annotate. The segments may overlap and are not required
   * to be contiguous or span the whole video. If unspecified, each video is
   * treated as a single segment.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1.VideoSegment segments = 1;</code>
   */
  int getSegmentsCount();
  /**
   *
   *
   * <pre>
   * Video segments to annotate. The segments may overlap and are not required
   * to be contiguous or span the whole video. If unspecified, each video is
   * treated as a single segment.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1.VideoSegment segments = 1;</code>
   */
  java.util.List<? extends com.google.cloud.videointelligence.v1.VideoSegmentOrBuilder>
      getSegmentsOrBuilderList();
  /**
   *
   *
   * <pre>
   * Video segments to annotate. The segments may overlap and are not required
   * to be contiguous or span the whole video. If unspecified, each video is
   * treated as a single segment.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1.VideoSegment segments = 1;</code>
   */
  com.google.cloud.videointelligence.v1.VideoSegmentOrBuilder getSegmentsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Config for LABEL_DETECTION.
   * </pre>
   *
   * <code>.google.cloud.videointelligence.v1.LabelDetectionConfig label_detection_config = 2;
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
   * <code>.google.cloud.videointelligence.v1.LabelDetectionConfig label_detection_config = 2;
   * </code>
   */
  com.google.cloud.videointelligence.v1.LabelDetectionConfig getLabelDetectionConfig();
  /**
   *
   *
   * <pre>
   * Config for LABEL_DETECTION.
   * </pre>
   *
   * <code>.google.cloud.videointelligence.v1.LabelDetectionConfig label_detection_config = 2;
   * </code>
   */
  com.google.cloud.videointelligence.v1.LabelDetectionConfigOrBuilder
      getLabelDetectionConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * Config for SHOT_CHANGE_DETECTION.
   * </pre>
   *
   * <code>
   * .google.cloud.videointelligence.v1.ShotChangeDetectionConfig shot_change_detection_config = 3;
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
   * .google.cloud.videointelligence.v1.ShotChangeDetectionConfig shot_change_detection_config = 3;
   * </code>
   */
  com.google.cloud.videointelligence.v1.ShotChangeDetectionConfig getShotChangeDetectionConfig();
  /**
   *
   *
   * <pre>
   * Config for SHOT_CHANGE_DETECTION.
   * </pre>
   *
   * <code>
   * .google.cloud.videointelligence.v1.ShotChangeDetectionConfig shot_change_detection_config = 3;
   * </code>
   */
  com.google.cloud.videointelligence.v1.ShotChangeDetectionConfigOrBuilder
      getShotChangeDetectionConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * Config for EXPLICIT_CONTENT_DETECTION.
   * </pre>
   *
   * <code>
   * .google.cloud.videointelligence.v1.ExplicitContentDetectionConfig explicit_content_detection_config = 4;
   * </code>
   */
  boolean hasExplicitContentDetectionConfig();
  /**
   *
   *
   * <pre>
   * Config for EXPLICIT_CONTENT_DETECTION.
   * </pre>
   *
   * <code>
   * .google.cloud.videointelligence.v1.ExplicitContentDetectionConfig explicit_content_detection_config = 4;
   * </code>
   */
  com.google.cloud.videointelligence.v1.ExplicitContentDetectionConfig
      getExplicitContentDetectionConfig();
  /**
   *
   *
   * <pre>
   * Config for EXPLICIT_CONTENT_DETECTION.
   * </pre>
   *
   * <code>
   * .google.cloud.videointelligence.v1.ExplicitContentDetectionConfig explicit_content_detection_config = 4;
   * </code>
   */
  com.google.cloud.videointelligence.v1.ExplicitContentDetectionConfigOrBuilder
      getExplicitContentDetectionConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * Config for FACE_DETECTION.
   * </pre>
   *
   * <code>.google.cloud.videointelligence.v1.FaceDetectionConfig face_detection_config = 5;</code>
   */
  boolean hasFaceDetectionConfig();
  /**
   *
   *
   * <pre>
   * Config for FACE_DETECTION.
   * </pre>
   *
   * <code>.google.cloud.videointelligence.v1.FaceDetectionConfig face_detection_config = 5;</code>
   */
  com.google.cloud.videointelligence.v1.FaceDetectionConfig getFaceDetectionConfig();
  /**
   *
   *
   * <pre>
   * Config for FACE_DETECTION.
   * </pre>
   *
   * <code>.google.cloud.videointelligence.v1.FaceDetectionConfig face_detection_config = 5;</code>
   */
  com.google.cloud.videointelligence.v1.FaceDetectionConfigOrBuilder
      getFaceDetectionConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * Config for SPEECH_TRANSCRIPTION.
   * </pre>
   *
   * <code>
   * .google.cloud.videointelligence.v1.SpeechTranscriptionConfig speech_transcription_config = 6;
   * </code>
   */
  boolean hasSpeechTranscriptionConfig();
  /**
   *
   *
   * <pre>
   * Config for SPEECH_TRANSCRIPTION.
   * </pre>
   *
   * <code>
   * .google.cloud.videointelligence.v1.SpeechTranscriptionConfig speech_transcription_config = 6;
   * </code>
   */
  com.google.cloud.videointelligence.v1.SpeechTranscriptionConfig getSpeechTranscriptionConfig();
  /**
   *
   *
   * <pre>
   * Config for SPEECH_TRANSCRIPTION.
   * </pre>
   *
   * <code>
   * .google.cloud.videointelligence.v1.SpeechTranscriptionConfig speech_transcription_config = 6;
   * </code>
   */
  com.google.cloud.videointelligence.v1.SpeechTranscriptionConfigOrBuilder
      getSpeechTranscriptionConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * Config for TEXT_DETECTION.
   * </pre>
   *
   * <code>.google.cloud.videointelligence.v1.TextDetectionConfig text_detection_config = 8;</code>
   */
  boolean hasTextDetectionConfig();
  /**
   *
   *
   * <pre>
   * Config for TEXT_DETECTION.
   * </pre>
   *
   * <code>.google.cloud.videointelligence.v1.TextDetectionConfig text_detection_config = 8;</code>
   */
  com.google.cloud.videointelligence.v1.TextDetectionConfig getTextDetectionConfig();
  /**
   *
   *
   * <pre>
   * Config for TEXT_DETECTION.
   * </pre>
   *
   * <code>.google.cloud.videointelligence.v1.TextDetectionConfig text_detection_config = 8;</code>
   */
  com.google.cloud.videointelligence.v1.TextDetectionConfigOrBuilder
      getTextDetectionConfigOrBuilder();
}