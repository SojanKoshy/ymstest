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

package org.onosproject.yang.gen.v1.urn.ip.topo.rev20140101;

import com.google.common.base.MoreObjects;
import java.util.Objects;

/**
 * Represents the implementation of ipTopology.
 */
public class IpTopologyOpParam implements IpTopology {

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
        if (obj instanceof IpTopologyOpParam) {
            IpTopologyOpParam other = (IpTopologyOpParam) obj;
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
     * Creates an instance of ipTopology.
     *
     * @param builderObject builder object of ipTopology
     */
    protected IpTopologyOpParam(IpTopologyBuilder builderObject) {
        this.onosYangNodeOperationType = builderObject.onosYangNodeOperationType();
    }

    @Override
    public IpTopology processSubtreeFiltering(IpTopology appInstance, boolean isSelectAllSchemaChild) {
        IpTopologyBuilder subTreeFilteringResultBuilder = new IpTopologyBuilder();
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
    private boolean processChildNodesSubTreeFiltering(IpTopology appInstance, IpTopologyBuilder
            subTreeFilteringResultBuilder,
            Boolean isAnySelectOrContainmentNode, boolean isSelectAllSchemaChild) {
        return true;
    }


    /**
     * Creates an instance of ipTopologyOpParam.
     */
    protected IpTopologyOpParam() {
    }

    /**
     * Returns the attribute IpTopologyBuilder.
     *
     * @return value of IpTopologyBuilder
     */
    public static IpTopologyBuilder builder() {
        return new IpTopologyBuilder();
    }


    /**
     * Represents the builder implementation of ipTopology.
     */
    public static class IpTopologyBuilder {

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
        public IpTopologyBuilder onosYangNodeOperationType(OnosYangNodeOperationType onosYangNodeOperationType) {
            this.onosYangNodeOperationType = onosYangNodeOperationType;
            return this;
        }

        public IpTopology build() {
            return new IpTopologyOpParam(this);
        }

        /**
         * Creates an instance of ipTopologyBuilder.
         */
        public IpTopologyBuilder() {
        }
    }
}
