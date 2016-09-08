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
 * Represents the implementation of activateSoftwareImageInput.
 */
public class DefaultActivateSoftwareImageInput implements ActivateSoftwareImageInput {

    protected Map<Class<?>, Object> yangAugmentedInfoMap = new HashMap<>();
    protected String imageName;
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
    public String imageName() {
        return imageName;
    }

    @Override
    public OnosYangNodeOperationType onosYangNodeOperationType() {
        return onosYangNodeOperationType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(imageName, onosYangNodeOperationType);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DefaultActivateSoftwareImageInput) {
            DefaultActivateSoftwareImageInput other = (DefaultActivateSoftwareImageInput) obj;
            return
                 Objects.equals(imageName, other.imageName) &&
                 Objects.equals(onosYangNodeOperationType, other.onosYangNodeOperationType);
        }
        return false;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(getClass())
            .add("imageName", imageName)
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
     * Creates an instance of activateSoftwareImageInput.
     *
     * @param builderObject builder object of activateSoftwareImageInput
     */
    protected DefaultActivateSoftwareImageInput(ActivateSoftwareImageInputBuilder builderObject) {
        this.imageName = builderObject.imageName();
        this.onosYangNodeOperationType = builderObject.onosYangNodeOperationType();
        this.valueLeafFlags = builderObject.getValueLeafFlags();
        this.selectLeafFlags = builderObject.getSelectLeafFlags();
        this.yangAugmentedInfoMap = builderObject.yangAugmentedInfoMap();
    }

    @Override
    public ActivateSoftwareImageInput processSubtreeFiltering(ActivateSoftwareImageInput appInstance, boolean
            isSelectAllSchemaChild) {
        ActivateSoftwareImageInputBuilder subTreeFilteringResultBuilder = new ActivateSoftwareImageInputBuilder();
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
    private boolean processLeafSubtreeFiltering(ActivateSoftwareImageInput appInstance,
            ActivateSoftwareImageInputBuilder subTreeFilteringResultBuilder,
            Boolean isAnySelectOrContainmentNode, boolean isSelectAllSchemaChild) {
        if (getValueLeafFlags().get(LeafIdentifier.IMAGENAME.getLeafIndex())) {
            if (appInstance.imageName() == null || !(imageName().equals(appInstance.imageName()))) {
                return false;
            } else {
                subTreeFilteringResultBuilder.imageName(appInstance.imageName());
            }
        } else if (getSelectLeafFlags().get(LeafIdentifier.IMAGENAME.getLeafIndex()) || isSelectAllSchemaChild) {
            isAnySelectOrContainmentNode = true;
            subTreeFilteringResultBuilder.imageName(appInstance.imageName());
        }

        return true;
    }


    /**
     * Creates an instance of defaultActivateSoftwareImageInput.
     */
    protected DefaultActivateSoftwareImageInput() {
    }

    /**
     * Returns the attribute ActivateSoftwareImageInputBuilder.
     *
     * @return value of ActivateSoftwareImageInputBuilder
     */
    public static ActivateSoftwareImageInputBuilder builder() {
        return new ActivateSoftwareImageInputBuilder();
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
     * Represents the builder implementation of activateSoftwareImageInput.
     */
    public static class ActivateSoftwareImageInputBuilder implements ActivateSoftwareImageInput
            .ActivateSoftwareImageInputBuilder {

        protected Map<Class<?>, Object> yangAugmentedInfoMap = new HashMap<>();
        protected String imageName;
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
        public String imageName() {
            return imageName;
        }

        @Override
        public OnosYangNodeOperationType onosYangNodeOperationType() {
            return onosYangNodeOperationType;
        }

        @Override
        public ActivateSoftwareImageInputBuilder imageName(String imageName) {
            getValueLeafFlags().set(LeafIdentifier.IMAGENAME.getLeafIndex());
            this.imageName = imageName;
            return this;
        }

        @Override
        public ActivateSoftwareImageInputBuilder onosYangNodeOperationType(OnosYangNodeOperationType
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
        public ActivateSoftwareImageInputBuilder selectLeaf(LeafIdentifier leaf) {
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
        public ActivateSoftwareImageInput build() {
            return new DefaultActivateSoftwareImageInput(this);
        }

        /**
         * Creates an instance of activateSoftwareImageInputBuilder.
         */
        public ActivateSoftwareImageInputBuilder() {
        }
    }
}
