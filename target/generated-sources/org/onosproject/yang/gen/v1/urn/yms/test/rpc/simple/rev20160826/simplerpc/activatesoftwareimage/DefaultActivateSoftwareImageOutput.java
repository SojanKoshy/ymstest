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

package org.onosproject.yang.gen.v1.urn.yms.test.rpc.simple.rev20160826.simplerpc.activatesoftwareimage;

import com.google.common.base.MoreObjects;
import java.lang.reflect.InvocationTargetException;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Represents the implementation of activateSoftwareImageOutput.
 */
public class DefaultActivateSoftwareImageOutput implements ActivateSoftwareImageOutput {

    protected Map<Class<?>, Object> yangAugmentedInfoMap = new HashMap<>();
    protected String status;
    protected OnosYangNodeOperationType onosYangNodeOperationType;
    /**
     * Identify the leafs whose value are explicitly set
     * Applicable in protocol edit and query operation
     */
    private BitSet valueLeafFlags = new BitSet();

    /**
     * Identify the leafs to be selected, in a query operation
     */
    private BitSet selectLeafFlags = new BitSet();

    @Override
    public String status() {
        return status;
    }

    @Override
    public OnosYangNodeOperationType onosYangNodeOperationType() {
        return onosYangNodeOperationType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(status, onosYangNodeOperationType);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DefaultActivateSoftwareImageOutput) {
            DefaultActivateSoftwareImageOutput other = (DefaultActivateSoftwareImageOutput) obj;
            return
                 Objects.equals(status, other.status) &&
                 Objects.equals(onosYangNodeOperationType, other.onosYangNodeOperationType);
        }
        return false;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(getClass())
            .add("status", status)
            .add("onosYangNodeOperationType", onosYangNodeOperationType)
            .toString();
    }

    @Override
    public Object yangAugmentedInfo(Class classObject) {
        return yangAugmentedInfoMap.get(classObject);
    }

    @Override
    public Map<Class<?>, Object> yangAugmentedInfoMap() {
        return yangAugmentedInfoMap;
    }

    /**
     * Creates an instance of activateSoftwareImageOutput.
     *
     * @param builderObject builder object of activateSoftwareImageOutput
     */
    protected DefaultActivateSoftwareImageOutput(ActivateSoftwareImageOutputBuilder builderObject) {
        this.status = builderObject.status();
        this.onosYangNodeOperationType = builderObject.onosYangNodeOperationType();
        this.valueLeafFlags = builderObject.getValueLeafFlags();
        this.selectLeafFlags = builderObject.getSelectLeafFlags();
        this.yangAugmentedInfoMap = builderObject.yangAugmentedInfoMap();
    }

    @Override
    public ActivateSoftwareImageOutput processSubtreeFiltering(ActivateSoftwareImageOutput appInstance, boolean
            isSelectAllSchemaChild) {
        ActivateSoftwareImageOutputBuilder subTreeFilteringResultBuilder = new ActivateSoftwareImageOutputBuilder();
        Boolean isAnySelectOrContainmentNode = false;
        if (!processLeafSubtreeFiltering(appInstance, subTreeFilteringResultBuilder,
            isAnySelectOrContainmentNode, isSelectAllSchemaChild)) {
            return null;
        }
        for (Object yangAugmentedInfo : this.yangAugmentedInfoMap().values()) {
            Object yangAugmentedOpParamInfo = appInstance.yangAugmentedInfo(yangAugmentedInfo.getClass());
            Object processSubtreeFiltering;
            try {
                Class<?>[] interfaces = yangAugmentedInfo.getClass().getInterfaces();
                processSubtreeFiltering = yangAugmentedInfo.getClass()
                    .getMethod("processSubtreeFiltering", interfaces[0]).invoke(yangAugmentedInfo,
                        yangAugmentedOpParamInfo);
                if (processSubtreeFiltering != null) {
                    subTreeFilteringResultBuilder
            .addYangAugmentedInfo(processSubtreeFiltering, processSubtreeFiltering.getClass());
                }
            } catch (NoSuchMethodException | InvocationTargetException | IllegalAccessException e) {
                continue;
            }
        }
        if (!isSelectAllSchemaChild && !isAnySelectOrContainmentNode) {
            return processSubtreeFiltering(appInstance, true);
        }
        return subTreeFilteringResultBuilder.build();
    }
    private boolean processLeafSubtreeFiltering(ActivateSoftwareImageOutput appInstance,
            ActivateSoftwareImageOutputBuilder subTreeFilteringResultBuilder,
            Boolean isAnySelectOrContainmentNode, boolean isSelectAllSchemaChild) {
        if (getValueLeafFlags().get(LeafIdentifier.STATUS.getLeafIndex())) {
            if (appInstance.status() == null || !(status().equals(appInstance.status()))) {
                return false;
            } else {
                subTreeFilteringResultBuilder.status(appInstance.status());
            }
        } else if (getSelectLeafFlags().get(LeafIdentifier.STATUS.getLeafIndex()) || isSelectAllSchemaChild) {
            isAnySelectOrContainmentNode = true;
            subTreeFilteringResultBuilder.status(appInstance.status());
        }

        return true;
    }


    /**
     * Creates an instance of defaultActivateSoftwareImageOutput.
     */
    protected DefaultActivateSoftwareImageOutput() {
    }

    /**
     * Returns the attribute ActivateSoftwareImageOutputBuilder.
     *
     * @return value of ActivateSoftwareImageOutputBuilder
     */
    public static ActivateSoftwareImageOutputBuilder builder() {
        return new ActivateSoftwareImageOutputBuilder();
    }

    /**
     * Returns the valueLeafFlags.
     *
     * @return value of valueLeafFlags
     */
    public BitSet getValueLeafFlags() {
        return valueLeafFlags;
    }

    /**
     * Returns the selectLeafFlags.
     *
     * @return value of selectLeafFlags
     */
    public BitSet getSelectLeafFlags() {
        return selectLeafFlags;
    }


    @Override
    public boolean isLeafValueSet(LeafIdentifier leaf) {
        return getValueLeafFlags().get(leaf.getLeafIndex());
    }

    @Override
    public boolean isSelectLeaf(LeafIdentifier leaf) {
        return getSelectLeafFlags().get(leaf.getLeafIndex());
    }


    /**
     * Represents the builder implementation of activateSoftwareImageOutput.
     */
    public static class ActivateSoftwareImageOutputBuilder implements ActivateSoftwareImageOutput
            .ActivateSoftwareImageOutputBuilder {

        protected Map<Class<?>, Object> yangAugmentedInfoMap = new HashMap<>();
        protected String status;
        protected OnosYangNodeOperationType onosYangNodeOperationType;
        /**
         * Identify the leafs whose value are explicitly set
         * Applicable in protocol edit and query operation
         */
        private BitSet valueLeafFlags = new BitSet();

        /**
         * Identify the leafs to be selected, in a query operation
         */
        private BitSet selectLeafFlags = new BitSet();


        @Override
        public String status() {
            return status;
        }

        @Override
        public OnosYangNodeOperationType onosYangNodeOperationType() {
            return onosYangNodeOperationType;
        }

        @Override
        public ActivateSoftwareImageOutputBuilder status(String status) {
            getValueLeafFlags().set(LeafIdentifier.STATUS.getLeafIndex());
            this.status = status;
            return this;
        }

        @Override
        public ActivateSoftwareImageOutputBuilder onosYangNodeOperationType(OnosYangNodeOperationType
            onosYangNodeOperationType) {
            this.onosYangNodeOperationType = onosYangNodeOperationType;
            return this;
        }

        /**
         * Returns the valueLeafFlags.
         *
         * @return value of valueLeafFlags
         */
        public BitSet getValueLeafFlags() {
            return valueLeafFlags;
        }

        /**
         * Returns the selectLeafFlags.
         *
         * @return value of selectLeafFlags
         */
        public BitSet getSelectLeafFlags() {
            return selectLeafFlags;
        }



        @Override
        public ActivateSoftwareImageOutputBuilder selectLeaf(LeafIdentifier leaf) {
            getSelectLeafFlags().set(leaf.getLeafIndex());
            return this;
        }

        @Override
        public void addYangAugmentedInfo(Object value, Class classObject) {
            yangAugmentedInfoMap.put(classObject, value);
        }

        @Override
        public Object yangAugmentedInfo(Class classObject) {
            return yangAugmentedInfoMap.get(classObject);
        }

        @Override
        public Map<Class<?>, Object> yangAugmentedInfoMap() {
            return yangAugmentedInfoMap;
        }
        @Override
        public ActivateSoftwareImageOutput build() {
            return new DefaultActivateSoftwareImageOutput(this);
        }

        /**
         * Creates an instance of activateSoftwareImageOutputBuilder.
         */
        public ActivateSoftwareImageOutputBuilder() {
        }
    }
}
