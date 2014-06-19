/*
 * Copyright 2004-2005 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.codehaus.groovy.grails.commons.spring

import groovy.transform.CompileStatic
import org.codehaus.groovy.grails.commons.GrailsApplication
import org.codehaus.groovy.grails.plugins.GrailsPluginManager
import org.springframework.context.ApplicationContext

/**
 * Handles the runtime configuration of the Grails ApplicationContext.
 *
 * @author Graeme Rocher
 * @since 0.3
 * @deprecated Use {@link org.grails.web.servlet.context.support.GrailsRuntimeConfigurator} instead
 */
@CompileStatic
@Deprecated
class GrailsRuntimeConfigurator extends org.grails.web.servlet.context.support.GrailsRuntimeConfigurator{
    GrailsRuntimeConfigurator(GrailsApplication application) {
        super(application)
    }

    GrailsRuntimeConfigurator(GrailsApplication application, ApplicationContext parent) {
        super(application, parent)
    }

    GrailsRuntimeConfigurator(GrailsApplication application, ApplicationContext parent, GrailsPluginManager pluginManager) {
        super(application, parent, pluginManager)
    }
}
