/*
 * Copyright 2016 Google Inc. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/**
 * Java 7 nio FileSystem client library for Google Cloud Storage.
 *
 * <p>This client library allows you to easily interact with Google Cloud Storage, using Java's
 * standard file system API, introduced in Java 7.
 *
 * <h3>How It Works</h3>
 *
 * The simplest way to get started is with {@code Paths} and {@code Files}:<pre>   {@code
 *
 *   Path path = Paths.get(URI.create("gs://bucket/lolcat.csv"));
 *   List<String> lines = Files.readAllLines(path, StandardCharsets.UTF_8);}</pre>
 *
 * <p>If you want to configure the bucket per-environment, it might make more sense to use the
 * {@code FileSystem} API:
 * <pre>
 *   class Foo {
 *     static String bucket = System.getProperty(...);
 *     static FileSystem fs = FileSystems.getFileSystem(URI.create("gs://" + bucket));
 *     void bar() {
 *       byte[] data = "hello world".getBytes(StandardCharsets.UTF_8);
 *       Path path = fs.getPath("/object");
 *       Files.write(path, data);
 *       data = Files.readBytes(path);
 *     }
 *     void doodle() {
 *       Path path = fs.getPath("/path/to/doodle.csv");
 *       List&lt;String&gt; lines = Files.readAllLines(path, StandardCharsets.UTF_8);
 *     }
 *   }</pre>
 *
 * <p>You can also use InputStream and OutputStream for streaming:
 * <pre>
 *   Path path = Paths.get(URI.create("gs://bucket/lolcat.csv"));
 *   try (InputStream input = Files.openInputStream(path)) {
 *     // ...
 *   }</pre>
 *
 * <p>You can set various attributes using
 * {@link com.google.cloud.storage.contrib.nio.CloudStorageOptions CloudStorageOptions} static
 * helpers:
 * <pre>
 *   Files.write(csvPath, csvLines, StandardCharsets.UTF_8,
 *       withMimeType(MediaType.CSV_UTF8),
 *       withoutCaching());</pre>
 *
 * <p><b>NOTE:</b> Cloud Storage uses a flat namespace and therefore doesn't support real
 * directories. So this library supports what's known as "pseudo-directories". Any path that
 * includes a trailing slash, will be considered a directory. It will always be assumed to exist,
 * without performing any I/O. This allows you to do path manipulation in the same manner as you
 * would with the normal UNIX file system implementation. You can disable this feature with
 * {@link com.google.cloud.storage.contrib.nio.CloudStorageConfiguration#usePseudoDirectories()}.
 *
 * <h3>Unit Testing</h3>
 *
 * <p>Here's a simple unit test:<pre>
 *
 *   class MyTest {
 *     {@literal @}Rule
 *     public final AppEngineRule appEngine = AppEngineRule.builder().build();
 *
 *     {@literal @}Test
 *     public test_fileWrite() throws Exception {
 *       Path path = Paths.get(URI.create("gs://bucket/traditional"));
 *       Files.write(path, "eyebrow".getBytes(StandardCharsets.US_ASCII));
 *       assertEquals("eyebrow", new String(Files.readBytes(path), StandardCharsets.US_ASCII));
 *     }
 *   }</pre>
 *
 * <h3>Non-SPI Interface</h3>
 *
 * <p>If you don't want to rely on Java SPI, which requires a META-INF file in your jar generated by
 * Google Auto, you can instantiate this file system directly as follows:<pre>   {@code
 *
 *   CloudStorageFileSystem fs = CloudStorageFileSystemProvider.forBucket("bucket");
 *   byte[] data = "hello world".getBytes(StandardCharsets.UTF_8);
 *   Path path = fs.getPath("/object");
 *   Files.write(path, data);
 *   data = Files.readBytes(path);}</pre>
 */
@javax.annotation.ParametersAreNonnullByDefault
package com.google.cloud.storage.contrib.nio;
