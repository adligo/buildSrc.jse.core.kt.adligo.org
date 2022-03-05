package org.adligo.kt.jse.core.build

import org.gradle.api.artifacts.Dependency
import org.gradle.api.Project

/**
 * This helps to wrap the gradle_Build class that is the this
 * in projects like jse8_core.adligo.org's build.gradle.kts
 * file, as I couldn't find the actual class that that represents.
 *
 * @author scott
 * <pre><code>
 * ---------------- Apache ICENSE-2.0 --------------------------
 *
 * Copyright 2022 Adligo Inc
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *    http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * </code><pre>
 */
 
interface I_GradleCallback {
  fun implementation(dependencyNotation: String)
  fun implementation(dependency: Dependency)
  fun implementation(project: Project)
  fun projectFun(projectName: String): Project
}
