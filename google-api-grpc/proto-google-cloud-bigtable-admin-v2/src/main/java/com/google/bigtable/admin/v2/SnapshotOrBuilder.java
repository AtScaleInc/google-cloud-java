// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/bigtable/admin/v2/table.proto

package com.google.bigtable.admin.v2;

public interface SnapshotOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.bigtable.admin.v2.Snapshot)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * (`OutputOnly`)
   * The unique name of the snapshot.
   * Values are of the form
   * `projects/&lt;project&gt;/instances/&lt;instance&gt;/clusters/&lt;cluster&gt;/snapshots/&lt;snapshot&gt;`.
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * (`OutputOnly`)
   * The unique name of the snapshot.
   * Values are of the form
   * `projects/&lt;project&gt;/instances/&lt;instance&gt;/clusters/&lt;cluster&gt;/snapshots/&lt;snapshot&gt;`.
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * (`OutputOnly`)
   * The source table at the time the snapshot was taken.
   * </pre>
   *
   * <code>.google.bigtable.admin.v2.Table source_table = 2;</code>
   */
  boolean hasSourceTable();
  /**
   *
   *
   * <pre>
   * (`OutputOnly`)
   * The source table at the time the snapshot was taken.
   * </pre>
   *
   * <code>.google.bigtable.admin.v2.Table source_table = 2;</code>
   */
  com.google.bigtable.admin.v2.Table getSourceTable();
  /**
   *
   *
   * <pre>
   * (`OutputOnly`)
   * The source table at the time the snapshot was taken.
   * </pre>
   *
   * <code>.google.bigtable.admin.v2.Table source_table = 2;</code>
   */
  com.google.bigtable.admin.v2.TableOrBuilder getSourceTableOrBuilder();

  /**
   *
   *
   * <pre>
   * (`OutputOnly`)
   * The size of the data in the source table at the time the snapshot was
   * taken. In some cases, this value may be computed asynchronously via a
   * background process and a placeholder of 0 will be used in the meantime.
   * </pre>
   *
   * <code>int64 data_size_bytes = 3;</code>
   */
  long getDataSizeBytes();

  /**
   *
   *
   * <pre>
   * (`OutputOnly`)
   * The time when the snapshot is created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 4;</code>
   */
  boolean hasCreateTime();
  /**
   *
   *
   * <pre>
   * (`OutputOnly`)
   * The time when the snapshot is created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 4;</code>
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   *
   *
   * <pre>
   * (`OutputOnly`)
   * The time when the snapshot is created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 4;</code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * (`OutputOnly`)
   * The time when the snapshot will be deleted. The maximum amount of time a
   * snapshot can stay active is 365 days. If 'ttl' is not specified,
   * the default maximum of 365 days will be used.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp delete_time = 5;</code>
   */
  boolean hasDeleteTime();
  /**
   *
   *
   * <pre>
   * (`OutputOnly`)
   * The time when the snapshot will be deleted. The maximum amount of time a
   * snapshot can stay active is 365 days. If 'ttl' is not specified,
   * the default maximum of 365 days will be used.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp delete_time = 5;</code>
   */
  com.google.protobuf.Timestamp getDeleteTime();
  /**
   *
   *
   * <pre>
   * (`OutputOnly`)
   * The time when the snapshot will be deleted. The maximum amount of time a
   * snapshot can stay active is 365 days. If 'ttl' is not specified,
   * the default maximum of 365 days will be used.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp delete_time = 5;</code>
   */
  com.google.protobuf.TimestampOrBuilder getDeleteTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * (`OutputOnly`)
   * The current state of the snapshot.
   * </pre>
   *
   * <code>.google.bigtable.admin.v2.Snapshot.State state = 6;</code>
   */
  int getStateValue();
  /**
   *
   *
   * <pre>
   * (`OutputOnly`)
   * The current state of the snapshot.
   * </pre>
   *
   * <code>.google.bigtable.admin.v2.Snapshot.State state = 6;</code>
   */
  com.google.bigtable.admin.v2.Snapshot.State getState();

  /**
   *
   *
   * <pre>
   * (`OutputOnly`)
   * Description of the snapshot.
   * </pre>
   *
   * <code>string description = 7;</code>
   */
  java.lang.String getDescription();
  /**
   *
   *
   * <pre>
   * (`OutputOnly`)
   * Description of the snapshot.
   * </pre>
   *
   * <code>string description = 7;</code>
   */
  com.google.protobuf.ByteString getDescriptionBytes();
}
