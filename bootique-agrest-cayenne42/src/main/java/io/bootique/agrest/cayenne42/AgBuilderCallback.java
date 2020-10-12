/*
 * Licensed to ObjectStyle LLC under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ObjectStyle LLC licenses
 * this file to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package io.bootique.agrest.cayenne42;

import io.agrest.runtime.AgBuilder;

/**
 * A custom extension that allows users to customize Agrest stack during creation. In many cases this may be an easier
 * alternative API compared to injectable {@link io.agrest.AgModuleProvider} and {@link io.agrest.AgFeatureProvider}.
 *
 * @since 1.1
 */
@FunctionalInterface
public interface AgBuilderCallback {

    void configure(AgBuilder builder);
}
