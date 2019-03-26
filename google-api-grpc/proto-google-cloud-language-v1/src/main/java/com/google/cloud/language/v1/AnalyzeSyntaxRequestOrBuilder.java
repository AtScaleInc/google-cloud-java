// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/language/v1/language_service.proto

package com.google.cloud.language.v1;

public interface AnalyzeSyntaxRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.language.v1.AnalyzeSyntaxRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Input document.
   * </pre>
   *
   * <code>.google.cloud.language.v1.Document document = 1;</code>
   */
  boolean hasDocument();
  /**
   *
   *
   * <pre>
   * Input document.
   * </pre>
   *
   * <code>.google.cloud.language.v1.Document document = 1;</code>
   */
  com.google.cloud.language.v1.Document getDocument();
  /**
   *
   *
   * <pre>
   * Input document.
   * </pre>
   *
   * <code>.google.cloud.language.v1.Document document = 1;</code>
   */
  com.google.cloud.language.v1.DocumentOrBuilder getDocumentOrBuilder();

  /**
   *
   *
   * <pre>
   * The encoding type used by the API to calculate offsets.
   * </pre>
   *
   * <code>.google.cloud.language.v1.EncodingType encoding_type = 2;</code>
   */
  int getEncodingTypeValue();
  /**
   *
   *
   * <pre>
   * The encoding type used by the API to calculate offsets.
   * </pre>
   *
   * <code>.google.cloud.language.v1.EncodingType encoding_type = 2;</code>
   */
  com.google.cloud.language.v1.EncodingType getEncodingType();
}
