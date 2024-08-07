/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.hadoop.fs.azurebfs.services;

/**
 * Class to hold extra configurations for AbfsClient and further classes
 * inside AbfsClient.
 */
public class AbfsClientContext {

  private final ExponentialRetryPolicy exponentialRetryPolicy;
  private final StaticRetryPolicy staticRetryPolicy;
  private final AbfsPerfTracker abfsPerfTracker;
  private final AbfsCounters abfsCounters;

  AbfsClientContext(
      ExponentialRetryPolicy exponentialRetryPolicy,
      StaticRetryPolicy staticRetryPolicy,
      AbfsPerfTracker abfsPerfTracker,
      AbfsCounters abfsCounters) {
    this.exponentialRetryPolicy = exponentialRetryPolicy;

    this.staticRetryPolicy = staticRetryPolicy;
    this.abfsPerfTracker = abfsPerfTracker;
    this.abfsCounters = abfsCounters;
  }

  public ExponentialRetryPolicy getExponentialRetryPolicy() {
    return exponentialRetryPolicy;
  }

  public StaticRetryPolicy getStaticRetryPolicy() {
    return staticRetryPolicy;
  }

  public AbfsPerfTracker getAbfsPerfTracker() {
    return abfsPerfTracker;
  }

  AbfsCounters getAbfsCounters() {
    return abfsCounters;
  }
}
