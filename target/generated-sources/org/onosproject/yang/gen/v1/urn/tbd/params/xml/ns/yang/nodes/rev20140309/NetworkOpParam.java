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
import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;
import java.util.Objects;
import org.onosproject.yang.gen.v1.urn.tbd.params.xml.ns.yang.nodes.rev20140309.network.NetworkPath;
import org.onosproject.yang.gen.v1.urn.tbd.params.xml.ns.yang.nodes.rev20140309.network.Networklist;

/**
 * Represents the implementation of network.
 */
public class NetworkOpParam implements Network {

    protected String name;
    protected String surname;
    protected boolean isHappy;
    protected OnosYangNodeOperationType onosYangNodeOperationType;
    protected List<Networklist> networklist;
    protected NetworkPath networkPath;
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
    public String surname() {
        return surname;
    }
    public boolean isHappy() {
        return isHappy;
    }
    public OnosYangNodeOperationType onosYangNodeOperationType() {
        return onosYangNodeOperationType;
    }
    public List<Networklist> networklist() {
        return networklist;
    }
    public NetworkPath networkPath() {
        return networkPath;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, isHappy, onosYangNodeOperationType, networklist, networkPath);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof NetworkOpParam) {
            NetworkOpParam other = (NetworkOpParam) obj;
            return
                 Objects.equals(name, other.name) &&
                 Objects.equals(surname, other.surname) &&
                 Objects.equals(isHappy, other.isHappy) &&
                 Objects.equals(onosYangNodeOperationType, other.onosYangNodeOperationType) &&
                 Objects.equals(networklist, other.networklist) &&
                 Objects.equals(networkPath, other.networkPath);
        }
        return false;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(getClass())
            .add("name", name)
            .add("surname", surname)
            .add("isHappy", isHappy)
            .add("onosYangNodeOperationType", onosYangNodeOperationType)
            .add("networklist", networklist)
            .add("networkPath", networkPath)
            .toString();
    }

    /**
     * Creates an instance of network.
     *
     * @param builderObject builder object of network
     */
    protected NetworkOpParam(NetworkBuilder builderObject) {
        this.name = builderObject.name();
        this.surname = builderObject.surname();
        this.isHappy = builderObject.isHappy();
        this.onosYangNodeOperationType = builderObject.onosYangNodeOperationType();
        this.networklist = builderObject.networklist();
        this.networkPath = builderObject.networkPath();
        this.valueLeafFlags = builderObject.getValueLeafFlags();
        this.selectLeafFlags = builderObject.getSelectLeafFlags();
    }

    @Override
    public Network processSubtreeFiltering(Network appInstance, boolean isSelectAllSchemaChild) {
        NetworkBuilder subTreeFilteringResultBuilder = new NetworkBuilder();
        Boolean isAnySelectOrContainmentNode = false;
        if (!processLeafSubtreeFiltering(appInstance, subTreeFilteringResultBuilder,
            isAnySelectOrContainmentNode, isSelectAllSchemaChild)) {
            return null;
        }
        if (!processChildNodesSubTreeFiltering(appInstance, subTreeFilteringResultBuilder,
            isAnySelectOrContainmentNode, isSelectAllSchemaChild)) {
            return null;
        }
        if (!isSelectAllSchemaChild && !isAnySelectOrContainmentNode) {
            return processSubtreeFiltering(appInstance, true);
        }
        return subTreeFilteringResultBuilder.build();
    }
    private boolean processLeafSubtreeFiltering(Network appInstance, NetworkBuilder subTreeFilteringResultBuilder,
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

        if (getValueLeafFlags().get(LeafIdentifier.SURNAME.getLeafIndex())) {
            if (appInstance.surname() == null || !(surname().equals(appInstance.surname()))) {
                return false;
            } else {
                subTreeFilteringResultBuilder.surname(appInstance.surname());
            }
        } else if (getSelectLeafFlags().get(LeafIdentifier.SURNAME.getLeafIndex()) || isSelectAllSchemaChild) {
            isAnySelectOrContainmentNode = true;
            subTreeFilteringResultBuilder.surname(appInstance.surname());
        }

        if (getValueLeafFlags().get(LeafIdentifier.ISHAPPY.getLeafIndex())) {
            if (appInstance.isHappy() != isHappy()) {
                return false;
            } else {
                subTreeFilteringResultBuilder.isHappy(appInstance.isHappy());
            }
        } else if (getSelectLeafFlags().get(LeafIdentifier.ISHAPPY.getLeafIndex()) || isSelectAllSchemaChild) {
            isAnySelectOrContainmentNode = true;
            subTreeFilteringResultBuilder.isHappy(appInstance.isHappy());
        }

        return true;
    }

    private boolean processChildNodesSubTreeFiltering(Network appInstance, NetworkBuilder
            subTreeFilteringResultBuilder,
            Boolean isAnySelectOrContainmentNode, boolean isSelectAllSchemaChild) {
        if (isSelectAllSchemaChild) {
            for (Networklist networklist : appInstance.networklist()) {
                subTreeFilteringResultBuilder.addToNetworklist(networklist);
            }
        } else if (networklist() != null) {
            isAnySelectOrContainmentNode = true;
            if (!networklist().isEmpty()) {
                if (appInstance.networklist() != null && !appInstance.networklist().isEmpty()) {
                    for (Networklist networklist : networklist()) {
                        for (Networklist networklist2 : appInstance.networklist()) {
                            Networklist result = networklist.processSubtreeFiltering(networklist2, false);
                            if (result != null) {
                                subTreeFilteringResultBuilder.addToNetworklist(result);
                            }
                        }
                    }
                }
            } else {
                if (appInstance.networklist() != null && !appInstance.networklist().isEmpty()) {
                    for (Networklist networklist : appInstance.networklist()) {
                        subTreeFilteringResultBuilder.addToNetworklist(networklist);
                    }
                }
            }
        }

        if (networkPath()  != null) {
            isAnySelectOrContainmentNode = true;
            if (appInstance.networkPath() != null) {
                NetworkPath result = networkPath.processSubtreeFiltering(appInstance.networkPath(), false);
                if (result != null) {
                    subTreeFilteringResultBuilder.networkPath(result);
                }
            }
        }

        return true;
    }


    /**
     * Creates an instance of networkOpParam.
     */
    protected NetworkOpParam() {
    }

    /**
     * Returns the attribute NetworkBuilder.
     *
     * @return value of NetworkBuilder
     */
    public static NetworkBuilder builder() {
        return new NetworkBuilder();
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
     * Represents the builder implementation of network.
     */
    public static class NetworkBuilder {

        protected String name;
        protected String surname;
        protected boolean isHappy;
        protected OnosYangNodeOperationType onosYangNodeOperationType;
        protected List<Networklist> networklist;
        protected NetworkPath networkPath;
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
        public String surname() {
            return surname;
        }
        public boolean isHappy() {
            return isHappy;
        }
        public OnosYangNodeOperationType onosYangNodeOperationType() {
            return onosYangNodeOperationType;
        }
        public List<Networklist> networklist() {
            return networklist;
        }
        public NetworkPath networkPath() {
            return networkPath;
        }

        /**
         * Returns the builder object of name.
         *
         * @param name value of name
         * @return builder object of name
         */
        public NetworkBuilder name(String name) {
            getValueLeafFlags().set(LeafIdentifier.NAME.getLeafIndex());
            this.name = name;
            return this;
        }

        /**
         * Returns the builder object of surname.
         *
         * @param surname value of surname
         * @return builder object of surname
         */
        public NetworkBuilder surname(String surname) {
            getValueLeafFlags().set(LeafIdentifier.SURNAME.getLeafIndex());
            this.surname = surname;
            return this;
        }

        /**
         * Returns the builder object of isHappy.
         *
         * @param isHappy value of isHappy
         * @return builder object of isHappy
         */
        public NetworkBuilder isHappy(boolean isHappy) {
            getValueLeafFlags().set(LeafIdentifier.ISHAPPY.getLeafIndex());
            this.isHappy = isHappy;
            return this;
        }

        /**
         * Returns the builder object of onosYangNodeOperationType.
         *
         * @param onosYangNodeOperationType value of onosYangNodeOperationType
         * @return builder object of onosYangNodeOperationType
         */
        public NetworkBuilder onosYangNodeOperationType(OnosYangNodeOperationType onosYangNodeOperationType) {
            this.onosYangNodeOperationType = onosYangNodeOperationType;
            return this;
        }

        /**
         * Returns the builder object of networklist.
         *
         * @param networklist list of networklist
         * @return builder object of networklist
         */
        public NetworkBuilder networklist(List<Networklist> networklist) {
            this.networklist = networklist;
            return this;
        }

        /**
         * Returns the builder object of networkPath.
         *
         * @param networkPath value of networkPath
         * @return builder object of networkPath
         */
        public NetworkBuilder networkPath(NetworkPath networkPath) {
            this.networkPath = networkPath;
            return this;
        }
        public NetworkBuilder addToNetworklist(Networklist value) {
            if (networklist() == null) {
                networklist(new ArrayList<>());
            }
            networklist().add(value);
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



        public NetworkBuilder selectLeaf(LeafIdentifier leaf) {
            getSelectLeafFlags().set(leaf.getLeafIndex());
            return this;
        }

        public Network build() {
            return new NetworkOpParam(this);
        }

        /**
         * Creates an instance of networkBuilder.
         */
        public NetworkBuilder() {
        }
    }
}
