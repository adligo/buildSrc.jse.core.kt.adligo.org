package org.adligo.kt.jse.core.build

/**
 * This provides the dependencies for the
 * {@link <a href="https://github.com/adligo/threads.adligo.org">threads/a>
 * project and also exports the ability to depend on threads with the function;<br/>
 * dependsOnThreads
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

object ThreadsDeps {

    /**
     * provides a way for other projects to depend on i_ctx
     */
    fun dependsOnTests4j4jj(gradleCallback : I_GradleCallback) {
        has(gradleCallback)
        Tests4j4jjDeps.dependsOnTests4j4jj(gradleCallback)
        gradleCallback.implementation(gradleCallback.projectFun("threads.adligo.org"))
    }

    fun has(gradleCallback : I_GradleCallback) {
        I_ThreadsDeps.dependsOnI_Threads(gradleCallback)
        I_Threads4JseDeps.dependsOnI_Threads4Jse(gradleCallback)
    }

    fun testsHave(gradleCallback : I_GradleCallback) {
        dependsOnTests4j4jj(gradleCallback)
    }
}
