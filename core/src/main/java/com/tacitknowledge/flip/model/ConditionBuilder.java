/* Copyright 2012 Tacit Knowledge
*
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
*
* http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*/
package com.tacitknowledge.flip.model;

/**
 * The interface used to build EL expression to evaluate the condition.
 * 
 * @author Serghei Soloviov <ssoloviov@tacitknowledge.com>
 */
public interface ConditionBuilder {

    /**
     * The method which build the EL expression of the operation. 
     * 
     * @param leftParam the left parameter.
     * @param rightParam the right parameter. 
     * @return string containing the EL expression to evaluate the operation with parameters.
     */
    String buildCondition(String leftParam, String rightParam);
}
