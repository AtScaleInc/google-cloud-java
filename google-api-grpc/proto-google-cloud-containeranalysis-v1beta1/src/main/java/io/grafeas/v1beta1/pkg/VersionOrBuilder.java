// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/devtools/containeranalysis/v1beta1/package/package.proto

package io.grafeas.v1beta1.pkg;

public interface VersionOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:grafeas.v1beta1.package.Version)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Used to correct mistakes in the version numbering scheme.
   * </pre>
   *
   * <code>int32 epoch = 1;</code>
   */
  int getEpoch();

  /**
   *
   *
   * <pre>
   * The main part of the version name.
   * </pre>
   *
   * <code>string name = 2;</code>
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * The main part of the version name.
   * </pre>
   *
   * <code>string name = 2;</code>
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * The iteration of the package build from the above version.
   * </pre>
   *
   * <code>string revision = 3;</code>
   */
  java.lang.String getRevision();
  /**
   *
   *
   * <pre>
   * The iteration of the package build from the above version.
   * </pre>
   *
   * <code>string revision = 3;</code>
   */
  com.google.protobuf.ByteString getRevisionBytes();

  /**
   *
   *
   * <pre>
   * Distinguish between sentinel MIN/MAX versions and normal versions. If
   * kind is not NORMAL, then the other fields are ignored.
   * </pre>
   *
   * <code>.grafeas.v1beta1.package.Version.VersionKind kind = 4;</code>
   */
  int getKindValue();
  /**
   *
   *
   * <pre>
   * Distinguish between sentinel MIN/MAX versions and normal versions. If
   * kind is not NORMAL, then the other fields are ignored.
   * </pre>
   *
   * <code>.grafeas.v1beta1.package.Version.VersionKind kind = 4;</code>
   */
  io.grafeas.v1beta1.pkg.Version.VersionKind getKind();
}
