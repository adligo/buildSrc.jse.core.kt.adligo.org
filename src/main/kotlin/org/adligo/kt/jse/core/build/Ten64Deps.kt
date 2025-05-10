package org.adligo.kt.jse.core.build

import org.gradle.api.Project
import org.gradle.kotlin.dsl.DependencyHandlerScope

/**
 * This provides the dependencies for the
 * {@link <a href="https://github.com/adligo/ten64.adligo.org">ten/a>
 * project and also exports the ability to depend on bytes with the function;<br/>
 * dependsOnTen
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

object Ten64Deps {

    /**
     * provides a way for other projects to depend on i_ctx
     */
    fun dependsOnTen(gradleCallback : I_GradleCallback) {
        has(gradleCallback)
        gradleCallback.implementation(gradleCallback.projectFun("ten64.adligo.org"))
    }

    fun gwtExamplesHave(gradleCallback : I_GradleCallback) {
        dependsOnTen(gradleCallback)
        GwtDeps.dependsOnGwt(gradleCallback)
    }

    fun has(gradleCallback : I_GradleCallback) {
        BytesDeps.dependsOnBytes(gradleCallback)
    }

    fun testsHave(gradleCallback : I_GradleCallback) {
        dependsOnTen(gradleCallback)
        Tests4j4jjDeps.dependsOnTests4j4jj(gradleCallback)
    }
}
