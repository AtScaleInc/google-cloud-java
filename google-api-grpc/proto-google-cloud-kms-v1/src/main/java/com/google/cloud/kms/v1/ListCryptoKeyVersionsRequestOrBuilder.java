// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/kms/v1/service.proto

package com.google.cloud.kms.v1;

public interface ListCryptoKeyVersionsRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.kms.v1.ListCryptoKeyVersionsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The resource name of the
   * [CryptoKey][google.cloud.kms.v1.CryptoKey] to list, in the format
   * `projects/&#42;&#47;locations/&#42;&#47;keyRings/&#42;&#47;cryptoKeys/&#42;`.
   * </pre>
   *
   * <code>string parent = 1;</code>
   */
  java.lang.String getParent();
  /**
   *
   *
   * <pre>
   * Required. The resource name of the
   * [CryptoKey][google.cloud.kms.v1.CryptoKey] to list, in the format
   * `projects/&#42;&#47;locations/&#42;&#47;keyRings/&#42;&#47;cryptoKeys/&#42;`.
   * </pre>
   *
   * <code>string parent = 1;</code>
   */
  com.google.protobuf.ByteString getParentBytes();

  /**
   *
   *
   * <pre>
   * Optional limit on the number of
   * [CryptoKeyVersions][google.cloud.kms.v1.CryptoKeyVersion] to include in the
   * response. Further [CryptoKeyVersions][google.cloud.kms.v1.CryptoKeyVersion]
   * can subsequently be obtained by including the
   * [ListCryptoKeyVersionsResponse.next_page_token][google.cloud.kms.v1.ListCryptoKeyVersionsResponse.next_page_token]
   * in a subsequent request. If unspecified, the server will pick an
   * appropriate default.
   * </pre>
   *
   * <code>int32 page_size = 2;</code>
   */
  int getPageSize();

  /**
   *
   *
   * <pre>
   * Optional pagination token, returned earlier via
   * [ListCryptoKeyVersionsResponse.next_page_token][google.cloud.kms.v1.ListCryptoKeyVersionsResponse.next_page_token].
   * </pre>
   *
   * <code>string page_token = 3;</code>
   */
  java.lang.String getPageToken();
  /**
   *
   *
   * <pre>
   * Optional pagination token, returned earlier via
   * [ListCryptoKeyVersionsResponse.next_page_token][google.cloud.kms.v1.ListCryptoKeyVersionsResponse.next_page_token].
   * </pre>
   *
   * <code>string page_token = 3;</code>
   */
  com.google.protobuf.ByteString getPageTokenBytes();

  /**
   *
   *
   * <pre>
   * The fields to include in the response.
   * </pre>
   *
   * <code>.google.cloud.kms.v1.CryptoKeyVersion.CryptoKeyVersionView view = 4;</code>
   */
  int getViewValue();
  /**
   *
   *
   * <pre>
   * The fields to include in the response.
   * </pre>
   *
   * <code>.google.cloud.kms.v1.CryptoKeyVersion.CryptoKeyVersionView view = 4;</code>
   */
  com.google.cloud.kms.v1.CryptoKeyVersion.CryptoKeyVersionView getView();
}
