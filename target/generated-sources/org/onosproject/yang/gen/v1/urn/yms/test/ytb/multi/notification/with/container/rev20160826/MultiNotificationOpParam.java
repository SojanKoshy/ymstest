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

package org.onosproject.yang.gen.v1.urn.yms.test.ytb.multi.notification.with.container.rev20160826;

import com.google.common.base.MoreObjects;
import java.util.Objects;

/**
 * Represents the implementation of multiNotification.
 */
public class MultiNotificationOpParam implements MultiNotification {

    protected OnosYangNodeOperationType onosYangNodeOperationType;
    public OnosYangNodeOperationType onosYangNodeOperationType() {
        return onosYangNodeOperationType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(onosYangNodeOperationType);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof MultiNotificationOpParam) {
            MultiNotificationOpParam other = (MultiNotificationOpParam) obj;
            return
                 Objects.equals(onosYangNodeOperationType, other.onosYangNodeOperationType);
        }
        return false;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(getClass())
            .add("onosYangNodeOperationType", onosYangNodeOperationType)
            .toString();
    }

    /**
     * Creates an instance of multiNotification.
     *
     * @param builderObject builder object of multiNotification
     */
    protected MultiNotificationOpParam(MultiNotificationBuilder builderObject) {
        this.onosYangNodeOperationType = builderObject.onosYangNodeOperationType();
    }

    @Override
    public MultiNotification processSubtreeFiltering(MultiNotification appInstance, boolean isSelectAllSchemaChild) {
        MultiNotificationBuilder subTreeFilteringResultBuilder = new MultiNotificationBuilder();
        Boolean isAnySelectOrContainmentNode = false;
        if (!processChildNodesSubTreeFiltering(appInstance, subTreeFilteringResultBuilder,
            isAnySelectOrContainmentNode, isSelectAllSchemaChild)) {
            return null;
        }
        if (!isSelectAllSchemaChild && !isAnySelectOrContainmentNode) {
            return processSubtreeFiltering(appInstance, true);
        }
        return subTreeFilteringResultBuilder.build();
    }
    private boolean processChildNodesSubTreeFiltering(MultiNotification appInstance, MultiNotificationBuilder
            subTreeFilteringResultBuilder,
            Boolean isAnySelectOrContainmentNode, boolean isSelectAllSchemaChild) {
        return true;
    }


    /**
     * Creates an instance of multiNotificationOpParam.
     */
    protected MultiNotificationOpParam() {
    }

    /**
     * Returns the attribute MultiNotificationBuilder.
     *
     * @return value of MultiNotificationBuilder
     */
    public static MultiNotificationBuilder builder() {
        return new MultiNotificationBuilder();
    }


    /**
     * Represents the builder implementation of multiNotification.
     */
    public static class MultiNotificationBuilder {

        protected OnosYangNodeOperationType onosYangNodeOperationType;

        public OnosYangNodeOperationType onosYangNodeOperationType() {
            return onosYangNodeOperationType;
        }

        /**
         * Returns the builder object of onosYangNodeOperationType.
         *
         * @param onosYangNodeOperationType value of onosYangNodeOperationType
         * @return builder object of onosYangNodeOperationType
         */
        public MultiNotificationBuilder onosYangNodeOperationType(OnosYangNodeOperationType
            onosYangNodeOperationType) {
            this.onosYangNodeOperationType = onosYangNodeOperationType;
            return this;
        }

        public MultiNotification build() {
            return new MultiNotificationOpParam(this);
        }

        /**
         * Creates an instance of multiNotificationBuilder.
         */
        public MultiNotificationBuilder() {
        }
    }
}
