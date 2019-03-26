// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/talent/v4beta1/filters.proto

package com.google.cloud.talent.v4beta1;

public interface EducationFilterOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.talent.v4beta1.EducationFilter)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Optional.
   * The school name. For example "MIT", "University of California, Berkeley".
   * </pre>
   *
   * <code>string school = 1;</code>
   */
  java.lang.String getSchool();
  /**
   *
   *
   * <pre>
   * Optional.
   * The school name. For example "MIT", "University of California, Berkeley".
   * </pre>
   *
   * <code>string school = 1;</code>
   */
  com.google.protobuf.ByteString getSchoolBytes();

  /**
   *
   *
   * <pre>
   * Optional.
   * The field of study. This is to search against value provided in
   * [Degree.fields_of_study][google.cloud.talent.v4beta1.Degree.fields_of_study].
   * For example "Computer Science", "Mathematics".
   * </pre>
   *
   * <code>string field_of_study = 2;</code>
   */
  java.lang.String getFieldOfStudy();
  /**
   *
   *
   * <pre>
   * Optional.
   * The field of study. This is to search against value provided in
   * [Degree.fields_of_study][google.cloud.talent.v4beta1.Degree.fields_of_study].
   * For example "Computer Science", "Mathematics".
   * </pre>
   *
   * <code>string field_of_study = 2;</code>
   */
  com.google.protobuf.ByteString getFieldOfStudyBytes();

  /**
   *
   *
   * <pre>
   * Optional.
   * Education degree in ISCED code. Each value in degree covers a specific
   * level of education, without any expansion to upper nor lower levels of
   * education degree.
   * </pre>
   *
   * <code>.google.cloud.talent.v4beta1.DegreeType degree_type = 3;</code>
   */
  int getDegreeTypeValue();
  /**
   *
   *
   * <pre>
   * Optional.
   * Education degree in ISCED code. Each value in degree covers a specific
   * level of education, without any expansion to upper nor lower levels of
   * education degree.
   * </pre>
   *
   * <code>.google.cloud.talent.v4beta1.DegreeType degree_type = 3;</code>
   */
  com.google.cloud.talent.v4beta1.DegreeType getDegreeType();

  /**
   *
   *
   * <pre>
   * Optional.
   * Whether to apply negation to the filter so profiles matching the filter
   * is excluded.
   * </pre>
   *
   * <code>bool negated = 6;</code>
   */
  boolean getNegated();
}
