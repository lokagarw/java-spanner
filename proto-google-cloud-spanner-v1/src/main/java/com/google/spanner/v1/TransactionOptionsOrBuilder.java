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
// source: google/spanner/v1/transaction.proto

// Protobuf Java Version: 3.25.3
package com.google.spanner.v1;

public interface TransactionOptionsOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.spanner.v1.TransactionOptions)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Transaction may write.
   *
   * Authorization to begin a read-write transaction requires
   * `spanner.databases.beginOrRollbackReadWriteTransaction` permission
   * on the `session` resource.
   * </pre>
   *
   * <code>.google.spanner.v1.TransactionOptions.ReadWrite read_write = 1;</code>
   *
   * @return Whether the readWrite field is set.
   */
  boolean hasReadWrite();
  /**
   *
   *
   * <pre>
   * Transaction may write.
   *
   * Authorization to begin a read-write transaction requires
   * `spanner.databases.beginOrRollbackReadWriteTransaction` permission
   * on the `session` resource.
   * </pre>
   *
   * <code>.google.spanner.v1.TransactionOptions.ReadWrite read_write = 1;</code>
   *
   * @return The readWrite.
   */
  com.google.spanner.v1.TransactionOptions.ReadWrite getReadWrite();
  /**
   *
   *
   * <pre>
   * Transaction may write.
   *
   * Authorization to begin a read-write transaction requires
   * `spanner.databases.beginOrRollbackReadWriteTransaction` permission
   * on the `session` resource.
   * </pre>
   *
   * <code>.google.spanner.v1.TransactionOptions.ReadWrite read_write = 1;</code>
   */
  com.google.spanner.v1.TransactionOptions.ReadWriteOrBuilder getReadWriteOrBuilder();

  /**
   *
   *
   * <pre>
   * Partitioned DML transaction.
   *
   * Authorization to begin a Partitioned DML transaction requires
   * `spanner.databases.beginPartitionedDmlTransaction` permission
   * on the `session` resource.
   * </pre>
   *
   * <code>.google.spanner.v1.TransactionOptions.PartitionedDml partitioned_dml = 3;</code>
   *
   * @return Whether the partitionedDml field is set.
   */
  boolean hasPartitionedDml();
  /**
   *
   *
   * <pre>
   * Partitioned DML transaction.
   *
   * Authorization to begin a Partitioned DML transaction requires
   * `spanner.databases.beginPartitionedDmlTransaction` permission
   * on the `session` resource.
   * </pre>
   *
   * <code>.google.spanner.v1.TransactionOptions.PartitionedDml partitioned_dml = 3;</code>
   *
   * @return The partitionedDml.
   */
  com.google.spanner.v1.TransactionOptions.PartitionedDml getPartitionedDml();
  /**
   *
   *
   * <pre>
   * Partitioned DML transaction.
   *
   * Authorization to begin a Partitioned DML transaction requires
   * `spanner.databases.beginPartitionedDmlTransaction` permission
   * on the `session` resource.
   * </pre>
   *
   * <code>.google.spanner.v1.TransactionOptions.PartitionedDml partitioned_dml = 3;</code>
   */
  com.google.spanner.v1.TransactionOptions.PartitionedDmlOrBuilder getPartitionedDmlOrBuilder();

  /**
   *
   *
   * <pre>
   * Transaction will not write.
   *
   * Authorization to begin a read-only transaction requires
   * `spanner.databases.beginReadOnlyTransaction` permission
   * on the `session` resource.
   * </pre>
   *
   * <code>.google.spanner.v1.TransactionOptions.ReadOnly read_only = 2;</code>
   *
   * @return Whether the readOnly field is set.
   */
  boolean hasReadOnly();
  /**
   *
   *
   * <pre>
   * Transaction will not write.
   *
   * Authorization to begin a read-only transaction requires
   * `spanner.databases.beginReadOnlyTransaction` permission
   * on the `session` resource.
   * </pre>
   *
   * <code>.google.spanner.v1.TransactionOptions.ReadOnly read_only = 2;</code>
   *
   * @return The readOnly.
   */
  com.google.spanner.v1.TransactionOptions.ReadOnly getReadOnly();
  /**
   *
   *
   * <pre>
   * Transaction will not write.
   *
   * Authorization to begin a read-only transaction requires
   * `spanner.databases.beginReadOnlyTransaction` permission
   * on the `session` resource.
   * </pre>
   *
   * <code>.google.spanner.v1.TransactionOptions.ReadOnly read_only = 2;</code>
   */
  com.google.spanner.v1.TransactionOptions.ReadOnlyOrBuilder getReadOnlyOrBuilder();

  /**
   *
   *
   * <pre>
   * When `exclude_txn_from_change_streams` is set to `true`:
   *  * Mutations from this transaction will not be recorded in change streams
   *  with DDL option `allow_txn_exclusion=true` that are tracking columns
   *  modified by these transactions.
   *  * Mutations from this transaction will be recorded in change streams with
   *  DDL option `allow_txn_exclusion=false or not set` that are tracking
   *  columns modified by these transactions.
   *
   * When `exclude_txn_from_change_streams` is set to `false` or not set,
   * mutations from this transaction will be recorded in all change streams that
   * are tracking columns modified by these transactions.
   * `exclude_txn_from_change_streams` may only be specified for read-write or
   * partitioned-dml transactions, otherwise the API will return an
   * `INVALID_ARGUMENT` error.
   * </pre>
   *
   * <code>bool exclude_txn_from_change_streams = 5;</code>
   *
   * @return The excludeTxnFromChangeStreams.
   */
  boolean getExcludeTxnFromChangeStreams();

  com.google.spanner.v1.TransactionOptions.ModeCase getModeCase();
}
