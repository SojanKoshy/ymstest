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

import java.math.BigInteger;

/**
 * Abstraction of an entity which represents the functionality of alldata.
 */
public interface Alldata {

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
     * Identify the leaf of Alldata.
     */
    public enum LeafIdentifier {

        /**
         * Represents name.
         */
        NAME(1),
        /**
         * Represents lfint8.
         */
        LFINT8(2),
        /**
         * Represents lfint16.
         */
        LFINT16(3),
        /**
         * Represents lfint32.
         */
        LFINT32(4),
        /**
         * Represents lfint64.
         */
        LFINT64(5),
        /**
         * Represents lfuint8.
         */
        LFUINT8(6),
        /**
         * Represents lfuint16.
         */
        LFUINT16(7),
        /**
         * Represents lfuint32.
         */
        LFUINT32(8),
        /**
         * Represents lfuint64.
         */
        LFUINT64(9);

        private int leafIndex;

        public int getLeafIndex() {
            return leafIndex;
        }

        LeafIdentifier(int value) {
            this.leafIndex = value;
        }
    }

    /**
     * Returns the attribute name.
     *
     * @return value of name
     */
    String name();

    /**
     * Returns the attribute lfint8.
     *
     * @return value of lfint8
     */
    byte lfint8();

    /**
     * Returns the attribute lfint16.
     *
     * @return value of lfint16
     */
    short lfint16();

    /**
     * Returns the attribute lfint32.
     *
     * @return value of lfint32
     */
    int lfint32();

    /**
     * Returns the attribute lfint64.
     *
     * @return value of lfint64
     */
    long lfint64();

    /**
     * Returns the attribute lfuint8.
     *
     * @return value of lfuint8
     */
    short lfuint8();

    /**
     * Returns the attribute lfuint16.
     *
     * @return value of lfuint16
     */
    int lfuint16();

    /**
     * Returns the attribute lfuint32.
     *
     * @return value of lfuint32
     */
    long lfuint32();

    /**
     * Returns the attribute lfuint64.
     *
     * @return value of lfuint64
     */
    BigInteger lfuint64();

    /**
     * Returns the attribute onosYangNodeOperationType.
     *
     * @return value of onosYangNodeOperationType
     */
    OnosYangNodeOperationType onosYangNodeOperationType();

    /**
     * Checks if the passed Alldata maps the content match query condition.
     *
     * @param alldata alldata being passed to check for content match
     * @param isSelectAllSchemaChild is select all schema child
     * @return match result
     */
    Alldata processSubtreeFiltering(Alldata alldata, boolean isSelectAllSchemaChild);

    /**
     * Checks if the leaf value is set.
     *
     * @param leaf leaf whose value status needs to checked
     * @return result of leaf value set in object
     */
    boolean isLeafValueSet(LeafIdentifier leaf);

    /**
     * Checks if the leaf is set to be a selected leaf.
     *
     * @param leaf if leaf needs to be selected
     * @return result of leaf value set in object
     */
    boolean isSelectLeaf(LeafIdentifier leaf);
}
