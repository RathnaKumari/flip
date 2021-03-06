/*
 * Copyright 2012 Tacit Knowledge.
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
package com.tacitknowledge.flip.spring.config;

import com.tacitknowledge.flip.FeatureService;
import com.tacitknowledge.flip.spring.FlipSpringAspect;
import org.springframework.beans.factory.xml.NamespaceHandlerSupport;

/**
 * The Spring context namespace handler which contains the tags used to declare
 * {@link FeatureService} and {@link FlipSpringAspect} beans.
 * 
 * @author Serghei Soloviov <ssoloviov@tacitknowledge.com>
 */
public class FlipNamespaceHandler extends NamespaceHandlerSupport {

    public void init() {
        registerBeanDefinitionParser("intercept-handlers", new InterceptHandlerParser());
        registerBeanDefinitionParser("feature-service", new FeatureServiceHandlerParser());
    }
    
}
