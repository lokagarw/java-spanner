/*
 * Copyright 2024 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/spanner/v1/spanner.proto

// Protobuf Java Version: 3.25.3
package com.google.spanner.v1;

public interface RollbackRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.spanner.v1.RollbackRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The session in which the transaction to roll back is running.
   * </pre>
   *
   * <code>
   * string session = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The session.
   */
  java.lang.String getSession();
  /**
   *
   *
   * <pre>
   * Required. The session in which the transaction to roll back is running.
   * </pre>
   *
   * <code>
   * string session = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for session.
   */
  com.google.protobuf.ByteString getSessionBytes();

  /**
   *
   *
   * <pre>
   * Required. The transaction to roll back.
   * </pre>
   *
   * <code>bytes transaction_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The transactionId.
   */
  com.google.protobuf.ByteString getTransactionId();
}
