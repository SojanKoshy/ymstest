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

package org.onosproject.yang.gen.v1.urn.tbd.params.xml.ns.yang.nodes.rev20140309;

import com.google.common.base.MoreObjects;
import java.math.BigInteger;
import java.util.BitSet;
import java.util.Objects;

/**
 * Represents the implementation of alldata.
 */
public class AlldataOpParam implements Alldata {

    protected String name;
    protected byte lfint8;
    protected short lfint16;
    protected int lfint32;
    protected long lfint64;
    protected short lfuint8;
    protected int lfuint16;
    protected long lfuint32;
    protected BigInteger lfuint64;
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
    public String name() {
        return name;
    }
    public byte lfint8() {
        return lfint8;
    }
    public short lfint16() {
        return lfint16;
    }
    public int lfint32() {
        return lfint32;
    }
    public long lfint64() {
        return lfint64;
    }
    public short lfuint8() {
        return lfuint8;
    }
    public int lfuint16() {
        return lfuint16;
    }
    public long lfuint32() {
        return lfuint32;
    }
    public BigInteger lfuint64() {
        return lfuint64;
    }
    public OnosYangNodeOperationType onosYangNodeOperationType() {
        return onosYangNodeOperationType;
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(name, lfint8, lfint16, lfint32, lfint64, lfuint8, lfuint16, lfuint32, lfuint64,
            onosYangNodeOperationType);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AlldataOpParam) {
            AlldataOpParam other = (AlldataOpParam) obj;
            return
                 Objects.equals(name, other.name) &&
                 Objects.equals(lfint8, other.lfint8) &&
                 Objects.equals(lfint16, other.lfint16) &&
                 Objects.equals(lfint32, other.lfint32) &&
                 Objects.equals(lfint64, other.lfint64) &&
                 Objects.equals(lfuint8, other.lfuint8) &&
                 Objects.equals(lfuint16, other.lfuint16) &&
                 Objects.equals(lfuint32, other.lfuint32) &&
                 Objects.equals(lfuint64, other.lfuint64) &&
                 Objects.equals(onosYangNodeOperationType, other.onosYangNodeOperationType);
        }
        return false;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(getClass())
            .add("name", name)
            .add("lfint8", lfint8)
            .add("lfint16", lfint16)
            .add("lfint32", lfint32)
            .add("lfint64", lfint64)
            .add("lfuint8", lfuint8)
            .add("lfuint16", lfuint16)
            .add("lfuint32", lfuint32)
            .add("lfuint64", lfuint64)
            .add("onosYangNodeOperationType", onosYangNodeOperationType)
            .toString();
    }

    /**
     * Creates an instance of alldata.
     *
     * @param builderObject builder object of alldata
     */
    protected AlldataOpParam(AlldataBuilder builderObject) {
        this.name = builderObject.name();
        this.lfint8 = builderObject.lfint8();
        this.lfint16 = builderObject.lfint16();
        this.lfint32 = builderObject.lfint32();
        this.lfint64 = builderObject.lfint64();
        this.lfuint8 = builderObject.lfuint8();
        this.lfuint16 = builderObject.lfuint16();
        this.lfuint32 = builderObject.lfuint32();
        this.lfuint64 = builderObject.lfuint64();
        this.onosYangNodeOperationType = builderObject.onosYangNodeOperationType();
        this.valueLeafFlags = builderObject.getValueLeafFlags();
        this.selectLeafFlags = builderObject.getSelectLeafFlags();
    }

    @Override
    public Alldata processSubtreeFiltering(Alldata appInstance, boolean isSelectAllSchemaChild) {
        AlldataBuilder subTreeFilteringResultBuilder = new AlldataBuilder();
        Boolean isAnySelectOrContainmentNode = false;
        if (!processLeafSubtreeFiltering(appInstance, subTreeFilteringResultBuilder,
            isAnySelectOrContainmentNode, isSelectAllSchemaChild)) {
            return null;
        }
        if (!isSelectAllSchemaChild && !isAnySelectOrContainmentNode) {
            return processSubtreeFiltering(appInstance, true);
        }
        return subTreeFilteringResultBuilder.build();
    }
    private boolean processLeafSubtreeFiltering(Alldata appInstance, AlldataBuilder subTreeFilteringResultBuilder,
            Boolean isAnySelectOrContainmentNode, boolean isSelectAllSchemaChild) {
        if (getValueLeafFlags().get(LeafIdentifier.NAME.getLeafIndex())) {
            if (appInstance.name() == null || !(name().equals(appInstance.name()))) {
                return false;
            } else {
                subTreeFilteringResultBuilder.name(appInstance.name());
            }
        } else if (getSelectLeafFlags().get(LeafIdentifier.NAME.getLeafIndex()) || isSelectAllSchemaChild) {
            isAnySelectOrContainmentNode = true;
            subTreeFilteringResultBuilder.name(appInstance.name());
        }

        if (getValueLeafFlags().get(LeafIdentifier.LFINT8.getLeafIndex())) {
            if (appInstance.lfint8() != lfint8()) {
                return false;
            } else {
                subTreeFilteringResultBuilder.lfint8(appInstance.lfint8());
            }
        } else if (getSelectLeafFlags().get(LeafIdentifier.LFINT8.getLeafIndex()) || isSelectAllSchemaChild) {
            isAnySelectOrContainmentNode = true;
            subTreeFilteringResultBuilder.lfint8(appInstance.lfint8());
        }

        if (getValueLeafFlags().get(LeafIdentifier.LFINT16.getLeafIndex())) {
            if (appInstance.lfint16() != lfint16()) {
                return false;
            } else {
                subTreeFilteringResultBuilder.lfint16(appInstance.lfint16());
            }
        } else if (getSelectLeafFlags().get(LeafIdentifier.LFINT16.getLeafIndex()) || isSelectAllSchemaChild) {
            isAnySelectOrContainmentNode = true;
            subTreeFilteringResultBuilder.lfint16(appInstance.lfint16());
        }

        if (getValueLeafFlags().get(LeafIdentifier.LFINT32.getLeafIndex())) {
            if (appInstance.lfint32() != lfint32()) {
                return false;
            } else {
                subTreeFilteringResultBuilder.lfint32(appInstance.lfint32());
            }
        } else if (getSelectLeafFlags().get(LeafIdentifier.LFINT32.getLeafIndex()) || isSelectAllSchemaChild) {
            isAnySelectOrContainmentNode = true;
            subTreeFilteringResultBuilder.lfint32(appInstance.lfint32());
        }

        if (getValueLeafFlags().get(LeafIdentifier.LFINT64.getLeafIndex())) {
            if (appInstance.lfint64() != lfint64()) {
                return false;
            } else {
                subTreeFilteringResultBuilder.lfint64(appInstance.lfint64());
            }
        } else if (getSelectLeafFlags().get(LeafIdentifier.LFINT64.getLeafIndex()) || isSelectAllSchemaChild) {
            isAnySelectOrContainmentNode = true;
            subTreeFilteringResultBuilder.lfint64(appInstance.lfint64());
        }

        if (getValueLeafFlags().get(LeafIdentifier.LFUINT8.getLeafIndex())) {
            if (appInstance.lfuint8() != lfuint8()) {
                return false;
            } else {
                subTreeFilteringResultBuilder.lfuint8(appInstance.lfuint8());
            }
        } else if (getSelectLeafFlags().get(LeafIdentifier.LFUINT8.getLeafIndex()) || isSelectAllSchemaChild) {
            isAnySelectOrContainmentNode = true;
            subTreeFilteringResultBuilder.lfuint8(appInstance.lfuint8());
        }

        if (getValueLeafFlags().get(LeafIdentifier.LFUINT16.getLeafIndex())) {
            if (appInstance.lfuint16() != lfuint16()) {
                return false;
            } else {
                subTreeFilteringResultBuilder.lfuint16(appInstance.lfuint16());
            }
        } else if (getSelectLeafFlags().get(LeafIdentifier.LFUINT16.getLeafIndex()) || isSelectAllSchemaChild) {
            isAnySelectOrContainmentNode = true;
            subTreeFilteringResultBuilder.lfuint16(appInstance.lfuint16());
        }

        if (getValueLeafFlags().get(LeafIdentifier.LFUINT32.getLeafIndex())) {
            if (appInstance.lfuint32() != lfuint32()) {
                return false;
            } else {
                subTreeFilteringResultBuilder.lfuint32(appInstance.lfuint32());
            }
        } else if (getSelectLeafFlags().get(LeafIdentifier.LFUINT32.getLeafIndex()) || isSelectAllSchemaChild) {
            isAnySelectOrContainmentNode = true;
            subTreeFilteringResultBuilder.lfuint32(appInstance.lfuint32());
        }

        if (getValueLeafFlags().get(LeafIdentifier.LFUINT64.getLeafIndex())) {
            if (appInstance.lfuint64() != lfuint64()) {
                return false;
            } else {
                subTreeFilteringResultBuilder.lfuint64(appInstance.lfuint64());
            }
        } else if (getSelectLeafFlags().get(LeafIdentifier.LFUINT64.getLeafIndex()) || isSelectAllSchemaChild) {
            isAnySelectOrContainmentNode = true;
            subTreeFilteringResultBuilder.lfuint64(appInstance.lfuint64());
        }

        return true;
    }


    /**
     * Creates an instance of alldataOpParam.
     */
    protected AlldataOpParam() {
    }

    /**
     * Returns the attribute AlldataBuilder.
     *
     * @return value of AlldataBuilder
     */
    public static AlldataBuilder builder() {
        return new AlldataBuilder();
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
     * Represents the builder implementation of alldata.
     */
    public static class AlldataBuilder {

        protected String name;
        protected byte lfint8;
        protected short lfint16;
        protected int lfint32;
        protected long lfint64;
        protected short lfuint8;
        protected int lfuint16;
        protected long lfuint32;
        protected BigInteger lfuint64;
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

        public String name() {
            return name;
        }
        public byte lfint8() {
            return lfint8;
        }
        public short lfint16() {
            return lfint16;
        }
        public int lfint32() {
            return lfint32;
        }
        public long lfint64() {
            return lfint64;
        }
        public short lfuint8() {
            return lfuint8;
        }
        public int lfuint16() {
            return lfuint16;
        }
        public long lfuint32() {
            return lfuint32;
        }
        public BigInteger lfuint64() {
            return lfuint64;
        }
        public OnosYangNodeOperationType onosYangNodeOperationType() {
            return onosYangNodeOperationType;
        }

        /**
         * Returns the builder object of name.
         *
         * @param name value of name
         * @return builder object of name
         */
        public AlldataBuilder name(String name) {
            getValueLeafFlags().set(LeafIdentifier.NAME.getLeafIndex());
            this.name = name;
            return this;
        }

        /**
         * Returns the builder object of lfint8.
         *
         * @param lfint8 value of lfint8
         * @return builder object of lfint8
         */
        public AlldataBuilder lfint8(byte lfint8) {
            getValueLeafFlags().set(LeafIdentifier.LFINT8.getLeafIndex());
            this.lfint8 = lfint8;
            return this;
        }

        /**
         * Returns the builder object of lfint16.
         *
         * @param lfint16 value of lfint16
         * @return builder object of lfint16
         */
        public AlldataBuilder lfint16(short lfint16) {
            getValueLeafFlags().set(LeafIdentifier.LFINT16.getLeafIndex());
            this.lfint16 = lfint16;
            return this;
        }

        /**
         * Returns the builder object of lfint32.
         *
         * @param lfint32 value of lfint32
         * @return builder object of lfint32
         */
        public AlldataBuilder lfint32(int lfint32) {
            getValueLeafFlags().set(LeafIdentifier.LFINT32.getLeafIndex());
            this.lfint32 = lfint32;
            return this;
        }

        /**
         * Returns the builder object of lfint64.
         *
         * @param lfint64 value of lfint64
         * @return builder object of lfint64
         */
        public AlldataBuilder lfint64(long lfint64) {
            getValueLeafFlags().set(LeafIdentifier.LFINT64.getLeafIndex());
            this.lfint64 = lfint64;
            return this;
        }

        /**
         * Returns the builder object of lfuint8.
         *
         * @param lfuint8 value of lfuint8
         * @return builder object of lfuint8
         */
        public AlldataBuilder lfuint8(short lfuint8) {
            getValueLeafFlags().set(LeafIdentifier.LFUINT8.getLeafIndex());
            this.lfuint8 = lfuint8;
            return this;
        }

        /**
         * Returns the builder object of lfuint16.
         *
         * @param lfuint16 value of lfuint16
         * @return builder object of lfuint16
         */
        public AlldataBuilder lfuint16(int lfuint16) {
            getValueLeafFlags().set(LeafIdentifier.LFUINT16.getLeafIndex());
            this.lfuint16 = lfuint16;
            return this;
        }

        /**
         * Returns the builder object of lfuint32.
         *
         * @param lfuint32 value of lfuint32
         * @return builder object of lfuint32
         */
        public AlldataBuilder lfuint32(long lfuint32) {
            getValueLeafFlags().set(LeafIdentifier.LFUINT32.getLeafIndex());
            this.lfuint32 = lfuint32;
            return this;
        }

        /**
         * Returns the builder object of lfuint64.
         *
         * @param lfuint64 value of lfuint64
         * @return builder object of lfuint64
         */
        public AlldataBuilder lfuint64(BigInteger lfuint64) {
            getValueLeafFlags().set(LeafIdentifier.LFUINT64.getLeafIndex());
            this.lfuint64 = lfuint64;
            return this;
        }

        /**
         * Returns the builder object of onosYangNodeOperationType.
         *
         * @param onosYangNodeOperationType value of onosYangNodeOperationType
         * @return builder object of onosYangNodeOperationType
         */
        public AlldataBuilder onosYangNodeOperationType(OnosYangNodeOperationType onosYangNodeOperationType) {
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



        public AlldataBuilder selectLeaf(LeafIdentifier leaf) {
            getSelectLeafFlags().set(leaf.getLeafIndex());
            return this;
        }

        public Alldata build() {
            return new AlldataOpParam(this);
        }

        /**
         * Creates an instance of alldataBuilder.
         */
        public AlldataBuilder() {
        }
    }
}
