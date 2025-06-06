package org.adligo.kt.jse.core.build

import org.gradle.api.Project
import org.gradle.api.artifacts.Dependency
import org.gradle.kotlin.dsl.DependencyHandlerScope

/**
 * This provides the dependencies for the 
 * {@link <a href="https://github.com/adligo/i_log2.adligo.org">i_log2</a>
 * project and also exports the ability to depend on i_log2 with the function;<br/>
 * dependsOnI_Log2
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
 
object I_Log2Deps {

  fun dependsOnI_Log2(gradleCallback: I_GradleCallback) {
    gradleCallback.implementation(gradleCallback.projectFun("i_log2.adligo.org"))
  }

  fun testsHave(gradleCallback : I_GradleCallback) {
    dependsOnI_Log2(gradleCallback)
    Tests4j4jjDeps.dependsOnTests4j4jj(gradleCallback)
  }
}
