package org.adligo.kt.jse.core.build

/**
 * This provides the dependencies for Jaxb see methods
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
 
object JaxbDeps {

  /**
  * provides a way for other projects to depend on gwt
  */
  fun dependsOnJaxb(gc : I_GradleCallback) {
    gc.implementation("javax.xml.bind:jaxb-api:2.4.0-b180830.0359")
  }

}
