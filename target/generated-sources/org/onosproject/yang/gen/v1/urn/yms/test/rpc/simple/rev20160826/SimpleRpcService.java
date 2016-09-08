/*
 * Copyright 2016-present Open Networking Laboratory
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.onosproject.yang.gen.v1.urn.yms.test.rpc.simple.rev20160826;

import org.onosproject.yang.gen.v1.urn.yms.test.rpc.simple.rev20160826.simplerpc.activatesoftwareimage
            .ActivateSoftwareImageInput;
import org.onosproject.yang.gen.v1.urn.yms.test.rpc.simple.rev20160826.simplerpc.activatesoftwareimage
            .ActivateSoftwareImageOutput;

/**
 * Abstraction of an entity which represents the functionality of simpleRpcService.
 */
public interface SimpleRpcService {

    /**
     * Returns the attribute SimpleRpc.
     *
     * @param simpleRpc value of SimpleRpc
     * @return value of SimpleRpc
     */
    SimpleRpc getSimpleRpc(SimpleRpcOpParam simpleRpc);

    /**
     * Sets the value to attribute simpleRpc.
     *
     * @param simpleRpc value of simpleRpc
     */
    void setSimpleRpc(SimpleRpcOpParam simpleRpc);


    /**
     * Service interface of activateSoftwareImage.
     *
     * @param inputVar input of service interface activateSoftwareImage
     * @return ActivateSoftwareImageOutput output of service interface activateSoftwareImage
     */
    ActivateSoftwareImageOutput activateSoftwareImage(ActivateSoftwareImageInput inputVar);
}
