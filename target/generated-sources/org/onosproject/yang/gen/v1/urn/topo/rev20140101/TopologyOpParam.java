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

package org.onosproject.yang.gen.v1.urn.topo.rev20140101;

import com.google.common.base.MoreObjects;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.onosproject.yang.gen.v1.urn.topo.rev20140101.topology.Node;

/**
 * Represents the implementation of topology.
 */
public class TopologyOpParam implements Topology {

    protected OnosYangNodeOperationType onosYangNodeOperationType;
    protected List<Node> node;
    public OnosYangNodeOperationType onosYangNodeOperationType() {
        return onosYangNodeOperationType;
    }
    public List<Node> node() {
        return node;
    }

    @Override
    public int hashCode() {
        return Objects.hash(onosYangNodeOperationType, node);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof TopologyOpParam) {
            TopologyOpParam other = (TopologyOpParam) obj;
            return
                 Objects.equals(onosYangNodeOperationType, other.onosYangNodeOperationType) &&
                 Objects.equals(node, other.node);
        }
        return false;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(getClass())
            .add("onosYangNodeOperationType", onosYangNodeOperationType)
            .add("node", node)
            .toString();
    }

    /**
     * Creates an instance of topology.
     *
     * @param builderObject builder object of topology
     */
    protected TopologyOpParam(TopologyBuilder builderObject) {
        this.onosYangNodeOperationType = builderObject.onosYangNodeOperationType();
        this.node = builderObject.node();
    }

    @Override
    public Topology processSubtreeFiltering(Topology appInstance, boolean isSelectAllSchemaChild) {
        TopologyBuilder subTreeFilteringResultBuilder = new TopologyBuilder();
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
    private boolean processChildNodesSubTreeFiltering(Topology appInstance, TopologyBuilder
            subTreeFilteringResultBuilder,
            Boolean isAnySelectOrContainmentNode, boolean isSelectAllSchemaChild) {
        if (isSelectAllSchemaChild) {
            for (Node node : appInstance.node()) {
                subTreeFilteringResultBuilder.addToNode(node);
            }
        } else if (node() != null) {
            isAnySelectOrContainmentNode = true;
            if (!node().isEmpty()) {
                if (appInstance.node() != null && !appInstance.node().isEmpty()) {
                    for (Node node : node()) {
                        for (Node node2 : appInstance.node()) {
                            Node result = node.processSubtreeFiltering(node2, false);
                            if (result != null) {
                                subTreeFilteringResultBuilder.addToNode(result);
                            }
                        }
                    }
                }
            } else {
                if (appInstance.node() != null && !appInstance.node().isEmpty()) {
                    for (Node node : appInstance.node()) {
                        subTreeFilteringResultBuilder.addToNode(node);
                    }
                }
            }
        }

        return true;
    }


    /**
     * Creates an instance of topologyOpParam.
     */
    protected TopologyOpParam() {
    }

    /**
     * Returns the attribute TopologyBuilder.
     *
     * @return value of TopologyBuilder
     */
    public static TopologyBuilder builder() {
        return new TopologyBuilder();
    }


    /**
     * Represents the builder implementation of topology.
     */
    public static class TopologyBuilder {

        protected OnosYangNodeOperationType onosYangNodeOperationType;
        protected List<Node> node;

        public OnosYangNodeOperationType onosYangNodeOperationType() {
            return onosYangNodeOperationType;
        }
        public List<Node> node() {
            return node;
        }

        /**
         * Returns the builder object of onosYangNodeOperationType.
         *
         * @param onosYangNodeOperationType value of onosYangNodeOperationType
         * @return builder object of onosYangNodeOperationType
         */
        public TopologyBuilder onosYangNodeOperationType(OnosYangNodeOperationType onosYangNodeOperationType) {
            this.onosYangNodeOperationType = onosYangNodeOperationType;
            return this;
        }

        /**
         * Returns the builder object of node.
         *
         * @param node list of node
         * @return builder object of node
         */
        public TopologyBuilder node(List<Node> node) {
            this.node = node;
            return this;
        }
        public TopologyBuilder addToNode(Node value) {
            if (node() == null) {
                node(new ArrayList<>());
            }
            node().add(value);
            return this;
        }

        public Topology build() {
            return new TopologyOpParam(this);
        }

        /**
         * Creates an instance of topologyBuilder.
         */
        public TopologyBuilder() {
        }
    }
}
