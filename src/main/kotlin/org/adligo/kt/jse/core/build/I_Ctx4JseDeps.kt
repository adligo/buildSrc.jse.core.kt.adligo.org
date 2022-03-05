package org.adligo.kt.jse.core.build

import org.gradle.api.Project
import org.gradle.api.artifacts.Dependency
import org.gradle.kotlin.dsl.DependencyHandlerScope

/**
 * This provides the dependencies for the 
 * {@link <a href="https://github.com/adligo/i_ctx.adligo.org">i_ctx</a>
 * project and also exports the ability to depend on i_ctx with the function;<br/>
 * dependsOnI_Ctx
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
 
object I_Ctx4JseDeps {

  fun dependsOnI_Ctx4Jse(gcb: I_GradleCallback) {
    println("gcp is " + gcb)
    println("entry is \n" + gcb.toString())
    println("${gcb::class.qualifiedName}")
    I_CtxDeps.dependsOnI_Ctx(gcb)
    gcb.implementation(gcb.projectFun("i_ctx4jse.adligo.org"))
  }
}
