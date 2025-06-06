package org.adligo.kt.jse.core.build

import org.gradle.api.Project
import org.gradle.kotlin.dsl.DependencyHandlerScope

/**
 * This provides the dependencies for the
 * {@link <a href="https://github.com/adligo/mockto_ext.adligo.org">mockto_ext/a>
 * project and also exports the ability to depend on mockto_ext with the function;<br/>
 * dependsOnMockitoExt
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

object Tests4j4jjDeps {

    /**
     * provides a way for other projects to depend on i_ctx
     */
    fun dependsOnTests4j4jj(gradleCallback : I_GradleCallback) {
        has(gradleCallback)
        gradleCallback.implementation(gradleCallback.projectFun("i_tests4j.adligo.org"))
        gradleCallback.implementation(gradleCallback.projectFun("tests4j.adligo.org"))
        gradleCallback.implementation(gradleCallback.projectFun("tests4j4jj.adligo.org"))
    }

    fun has(gradleCallback : I_GradleCallback) {
        I_Tests4jDeps.dependsOnI_Tests4j(gradleCallback)
        JUnit5Deps.dependsOnJUnit5(gradleCallback)
        MockitoExtDeps.dependsOnMockitoExt(gradleCallback)
    }

    fun testsHave(gradleCallback : I_GradleCallback) {
        dependsOnTests4j4jj(gradleCallback)
    }
}
