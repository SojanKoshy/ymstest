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

package org.onosproject.yang.gen.v1.urn.yms.test.ytb.multi.notification.with.container.rev20160826.multinotification;

import java.util.Map;
import org.onosproject.yang.gen.v1.urn.yms.test.ytb.multi.notification.with.container.rev20160826.multinotification
            .linkdown.Router;

/**
 * Abstraction of an entity which represents the functionality of linkDown.
 */
public interface LinkDown {

    /**
     * Specify the node specific operation in protocols like NETCONF.
     * Applicable in protocol edit operation, not applicable in query operation
     */
    public enum OnosYangNodeOperationType {
        MERGE,
        REPLACE,
        CREATE,
        DELETE,
        REMOVE,
        NONE
    }

    /**
     * Returns the attribute onosYangNodeOperationType.
     *
     * @return value of onosYangNodeOperationType
     */
    OnosYangNodeOperationType onosYangNodeOperationType();

    /**
     * Returns the attribute router.
     *
     * @return value of router
     */
    Router router();

    /**
     * Returns the attribute yangAugmentedInfo.
     *
     * @param classObject value of Augmentedclass
     * @return value of YangAugmentedInfo
     */
    Object yangAugmentedInfo(Class classObject);

    /**
     * Returns the attribute yangAugmentedInfoMap.
     *
     * @return value of yangAugmentedInfoMap
     */
    Map<Class<?>, Object> yangAugmentedInfoMap();

    /**
     * Checks if the passed LinkDown maps the content match query condition.
     *
     * @param linkDown linkDown being passed to check for content match
     * @param isSelectAllSchemaChild is select all schema child
     * @return match result
     */
    LinkDown processSubtreeFiltering(LinkDown linkDown, boolean isSelectAllSchemaChild);

    /**
     * Builder for linkDown.
     */
    interface LinkDownBuilder {

        /**
         * Returns the attribute onosYangNodeOperationType.
         *
         * @return value of onosYangNodeOperationType
         */
        OnosYangNodeOperationType onosYangNodeOperationType();

        /**
         * Returns the attribute router.
         *
         * @return value of router
         */
        Router router();

        /**
         * Returns the builder object of onosYangNodeOperationType.
         *
         * @param onosYangNodeOperationType value of onosYangNodeOperationType
         * @return builder object of onosYangNodeOperationType
         */
        LinkDownBuilder onosYangNodeOperationType(OnosYangNodeOperationType onosYangNodeOperationType);

        /**
         * Returns the builder object of router.
         *
         * @param router value of router
         * @return builder object of router
         */
        LinkDownBuilder router(Router router);


        /**
         * Sets the value of yangAugmentedInfoMap.
         *
         * @param value value of yangAugmentedInfo
         * @param classObject value of Augmentedclass
         */
        void addYangAugmentedInfo(Object value, Class classObject);

        /**
         * Returns the attribute yangAugmentedInfo.
         *
         * @param classObject value of Augmentedclass
         * @return value of YangAugmentedInfo
         */
        Object yangAugmentedInfo(Class classObject);

        /**
         * Returns the attribute yangAugmentedInfoMap.
         *
         * @return value of yangAugmentedInfoMap
         */
        Map<Class<?>, Object> yangAugmentedInfoMap();

        /**
         * Builds object of linkDown.
         *
         * @return object of linkDown.
         */
        LinkDown build();
    }
}
