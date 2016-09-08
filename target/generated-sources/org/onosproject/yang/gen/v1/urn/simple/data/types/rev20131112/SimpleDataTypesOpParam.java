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

package org.onosproject.yang.gen.v1.urn.simple.data.types.rev20131112;

import com.google.common.base.MoreObjects;
import java.util.Objects;
import org.onosproject.yang.gen.v1.urn.simple.data.types.rev20131112.simpledatatypes.Cont;

/**
 * Represents the implementation of simpleDataTypes.
 */
public class SimpleDataTypesOpParam implements SimpleDataTypes {

    protected OnosYangNodeOperationType onosYangNodeOperationType;
    protected Cont cont;
    public OnosYangNodeOperationType onosYangNodeOperationType() {
        return onosYangNodeOperationType;
    }
    public Cont cont() {
        return cont;
    }

    @Override
    public int hashCode() {
        return Objects.hash(onosYangNodeOperationType, cont);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SimpleDataTypesOpParam) {
            SimpleDataTypesOpParam other = (SimpleDataTypesOpParam) obj;
            return
                 Objects.equals(onosYangNodeOperationType, other.onosYangNodeOperationType) &&
                 Objects.equals(cont, other.cont);
        }
        return false;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(getClass())
            .add("onosYangNodeOperationType", onosYangNodeOperationType)
            .add("cont", cont)
            .toString();
    }

    /**
     * Creates an instance of simpleDataTypes.
     *
     * @param builderObject builder object of simpleDataTypes
     */
    protected SimpleDataTypesOpParam(SimpleDataTypesBuilder builderObject) {
        this.onosYangNodeOperationType = builderObject.onosYangNodeOperationType();
        this.cont = builderObject.cont();
    }

    @Override
    public SimpleDataTypes processSubtreeFiltering(SimpleDataTypes appInstance, boolean isSelectAllSchemaChild) {
        SimpleDataTypesBuilder subTreeFilteringResultBuilder = new SimpleDataTypesBuilder();
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
    private boolean processChildNodesSubTreeFiltering(SimpleDataTypes appInstance, SimpleDataTypesBuilder
            subTreeFilteringResultBuilder,
            Boolean isAnySelectOrContainmentNode, boolean isSelectAllSchemaChild) {
        if (cont()  != null) {
            isAnySelectOrContainmentNode = true;
            if (appInstance.cont() != null) {
                Cont result = cont.processSubtreeFiltering(appInstance.cont(), false);
                if (result != null) {
                    subTreeFilteringResultBuilder.cont(result);
                }
            }
        }

        return true;
    }


    /**
     * Creates an instance of simpleDataTypesOpParam.
     */
    protected SimpleDataTypesOpParam() {
    }

    /**
     * Returns the attribute SimpleDataTypesBuilder.
     *
     * @return value of SimpleDataTypesBuilder
     */
    public static SimpleDataTypesBuilder builder() {
        return new SimpleDataTypesBuilder();
    }


    /**
     * Represents the builder implementation of simpleDataTypes.
     */
    public static class SimpleDataTypesBuilder {

        protected OnosYangNodeOperationType onosYangNodeOperationType;
        protected Cont cont;

        public OnosYangNodeOperationType onosYangNodeOperationType() {
            return onosYangNodeOperationType;
        }
        public Cont cont() {
            return cont;
        }

        /**
         * Returns the builder object of onosYangNodeOperationType.
         *
         * @param onosYangNodeOperationType value of onosYangNodeOperationType
         * @return builder object of onosYangNodeOperationType
         */
        public SimpleDataTypesBuilder onosYangNodeOperationType(OnosYangNodeOperationType onosYangNodeOperationType) {
            this.onosYangNodeOperationType = onosYangNodeOperationType;
            return this;
        }

        /**
         * Returns the builder object of cont.
         *
         * @param cont value of cont
         * @return builder object of cont
         */
        public SimpleDataTypesBuilder cont(Cont cont) {
            this.cont = cont;
            return this;
        }

        public SimpleDataTypes build() {
            return new SimpleDataTypesOpParam(this);
        }

        /**
         * Creates an instance of simpleDataTypesBuilder.
         */
        public SimpleDataTypesBuilder() {
        }
    }
}
