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

package org.onosproject.yang.gen.v1.urn.simple.data.types.rev20131112.simpledatatypes;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.BitSet;
import java.util.Map;
import org.onosproject.yang.gen.v1.urn.simple.data.types.rev20131112.simpledatatypes.cont.LfenumEnum;
import org.onosproject.yang.gen.v1.urn.simple.data.types.rev20131112.simpledatatypes.cont.Lfunion10Union;
import org.onosproject.yang.gen.v1.urn.simple.data.types.rev20131112.simpledatatypes.cont.Lfunion11Union;
import org.onosproject.yang.gen.v1.urn.simple.data.types.rev20131112.simpledatatypes.cont.Lfunion14Union;
import org.onosproject.yang.gen.v1.urn.simple.data.types.rev20131112.simpledatatypes.cont.Lfunion1Union;
import org.onosproject.yang.gen.v1.urn.simple.data.types.rev20131112.simpledatatypes.cont.Lfunion2Union;
import org.onosproject.yang.gen.v1.urn.simple.data.types.rev20131112.simpledatatypes.cont.Lfunion4Union;
import org.onosproject.yang.gen.v1.urn.simple.data.types.rev20131112.simpledatatypes.cont.Lfunion5Union;
import org.onosproject.yang.gen.v1.urn.simple.data.types.rev20131112.simpledatatypes.cont.Lfunion8Union;
import org.onosproject.yang.gen.v1.urn.simple.data.types.rev20131112.simpledatatypes.cont.Lfunion9Union;

/**
 * Abstraction of an entity which represents the functionality of cont.
 */
public interface Cont {

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
     * Identify the leaf of Cont.
     */
    public enum LeafIdentifier {

        /**
         * Represents lfint8Min.
         */
        LFINT8MIN(1),
        /**
         * Represents lfint8Max.
         */
        LFINT8MAX(2),
        /**
         * Represents lfint16Min.
         */
        LFINT16MIN(3),
        /**
         * Represents lfint16Max.
         */
        LFINT16MAX(4),
        /**
         * Represents lfint32Min.
         */
        LFINT32MIN(5),
        /**
         * Represents lfint32Max.
         */
        LFINT32MAX(6),
        /**
         * Represents lfint64Min.
         */
        LFINT64MIN(7),
        /**
         * Represents lfint64Max.
         */
        LFINT64MAX(8),
        /**
         * Represents lfuint8Max.
         */
        LFUINT8MAX(9),
        /**
         * Represents lfuint16Max.
         */
        LFUINT16MAX(10),
        /**
         * Represents lfuint32Max.
         */
        LFUINT32MAX(11),
        /**
         * Represents lfuint64Max.
         */
        LFUINT64MAX(12),
        /**
         * Represents lfstr.
         */
        LFSTR(13),
        /**
         * Represents lfstr1.
         */
        LFSTR1(14),
        /**
         * Represents lfbool1.
         */
        LFBOOL1(15),
        /**
         * Represents lfbool2.
         */
        LFBOOL2(16),
        /**
         * Represents lfbool3.
         */
        LFBOOL3(17),
        /**
         * Represents lfdecimal1.
         */
        LFDECIMAL1(18),
        /**
         * Represents lfdecimal2.
         */
        LFDECIMAL2(19),
        /**
         * Represents lfdecimal3.
         */
        LFDECIMAL3(20),
        /**
         * Represents lfdecimal4.
         */
        LFDECIMAL4(21),
        /**
         * Represents lfdecimal6.
         */
        LFDECIMAL6(22),
        /**
         * Represents lfenum.
         */
        LFENUM(23),
        /**
         * Represents lfbits.
         */
        LFBITS(24),
        /**
         * Represents lfbinary.
         */
        LFBINARY(25),
        /**
         * Represents lfref1.
         */
        LFREF1(26),
        /**
         * Represents lfref2.
         */
        LFREF2(27),
        /**
         * Represents lfempty.
         */
        LFEMPTY(28),
        /**
         * Represents lfunion1.
         */
        LFUNION1(29),
        /**
         * Represents lfunion2.
         */
        LFUNION2(30),
        /**
         * Represents lfunion4.
         */
        LFUNION4(31),
        /**
         * Represents lfunion5.
         */
        LFUNION5(32),
        /**
         * Represents lfunion7.
         */
        LFUNION7(33),
        /**
         * Represents lfunion8.
         */
        LFUNION8(34),
        /**
         * Represents lfunion9.
         */
        LFUNION9(35),
        /**
         * Represents lfunion10.
         */
        LFUNION10(36),
        /**
         * Represents lfunion11.
         */
        LFUNION11(37),
        /**
         * Represents lfunion12.
         */
        LFUNION12(38),
        /**
         * Represents lfunion13.
         */
        LFUNION13(39),
        /**
         * Represents lfunion14.
         */
        LFUNION14(40),
        /**
         * Represents identityref1.
         */
        IDENTITYREF1(41);

        private int leafIndex;

        public int getLeafIndex() {
            return leafIndex;
        }

        LeafIdentifier(int value) {
            this.leafIndex = value;
        }
    }

    /**
     * Returns the attribute lfint8Min.
     *
     * @return value of lfint8Min
     */
    byte lfint8Min();

    /**
     * Returns the attribute lfint8Max.
     *
     * @return value of lfint8Max
     */
    byte lfint8Max();

    /**
     * Returns the attribute lfint16Min.
     *
     * @return value of lfint16Min
     */
    short lfint16Min();

    /**
     * Returns the attribute lfint16Max.
     *
     * @return value of lfint16Max
     */
    short lfint16Max();

    /**
     * Returns the attribute lfint32Min.
     *
     * @return value of lfint32Min
     */
    int lfint32Min();

    /**
     * Returns the attribute lfint32Max.
     *
     * @return value of lfint32Max
     */
    int lfint32Max();

    /**
     * Returns the attribute lfint64Min.
     *
     * @return value of lfint64Min
     */
    long lfint64Min();

    /**
     * Returns the attribute lfint64Max.
     *
     * @return value of lfint64Max
     */
    long lfint64Max();

    /**
     * Returns the attribute lfuint8Max.
     *
     * @return value of lfuint8Max
     */
    short lfuint8Max();

    /**
     * Returns the attribute lfuint16Max.
     *
     * @return value of lfuint16Max
     */
    int lfuint16Max();

    /**
     * Returns the attribute lfuint32Max.
     *
     * @return value of lfuint32Max
     */
    long lfuint32Max();

    /**
     * Returns the attribute lfuint64Max.
     *
     * @return value of lfuint64Max
     */
    BigInteger lfuint64Max();

    /**
     * Returns the attribute lfstr.
     *
     * @return value of lfstr
     */
    String lfstr();

    /**
     * Returns the attribute lfstr1.
     *
     * @return value of lfstr1
     */
    String lfstr1();

    /**
     * Returns the attribute lfbool1.
     *
     * @return value of lfbool1
     */
    boolean lfbool1();

    /**
     * Returns the attribute lfbool2.
     *
     * @return value of lfbool2
     */
    boolean lfbool2();

    /**
     * Returns the attribute lfbool3.
     *
     * @return value of lfbool3
     */
    boolean lfbool3();

    /**
     * Returns the attribute lfdecimal1.
     *
     * @return value of lfdecimal1
     */
    BigDecimal lfdecimal1();

    /**
     * Returns the attribute lfdecimal2.
     *
     * @return value of lfdecimal2
     */
    BigDecimal lfdecimal2();

    /**
     * Returns the attribute lfdecimal3.
     *
     * @return value of lfdecimal3
     */
    BigDecimal lfdecimal3();

    /**
     * Returns the attribute lfdecimal4.
     *
     * @return value of lfdecimal4
     */
    BigDecimal lfdecimal4();

    /**
     * Returns the attribute lfdecimal6.
     *
     * @return value of lfdecimal6
     */
    BigDecimal lfdecimal6();

    /**
     * Returns the attribute lfenum.
     *
     * @return value of lfenum
     */
    LfenumEnum lfenum();

    /**
     * Returns the attribute lfbits.
     *
     * @return value of lfbits
     */
    BitSet lfbits();

    /**
     * Returns the attribute lfbinary.
     *
     * @return value of lfbinary
     */
    byte[] lfbinary();

    /**
     * Returns the attribute lfref1.
     *
     * @return value of lfref1
     */
    String lfref1();

    /**
     * Returns the attribute lfref2.
     *
     * @return value of lfref2
     */
    byte lfref2();

    /**
     * Returns the attribute lfempty.
     *
     * @return value of lfempty
     */
    boolean lfempty();

    /**
     * Returns the attribute lfunion1.
     *
     * @return value of lfunion1
     */
    Lfunion1Union lfunion1();

    /**
     * Returns the attribute lfunion2.
     *
     * @return value of lfunion2
     */
    Lfunion2Union lfunion2();

    /**
     * Returns the attribute lfunion4.
     *
     * @return value of lfunion4
     */
    Lfunion4Union lfunion4();

    /**
     * Returns the attribute lfunion5.
     *
     * @return value of lfunion5
     */
    Lfunion5Union lfunion5();

    /**
     * Returns the attribute lfunion7.
     *
     * @return value of lfunion7
     */
    Tpdfun3 lfunion7();

    /**
     * Returns the attribute lfunion8.
     *
     * @return value of lfunion8
     */
    Lfunion8Union lfunion8();

    /**
     * Returns the attribute lfunion9.
     *
     * @return value of lfunion9
     */
    Lfunion9Union lfunion9();

    /**
     * Returns the attribute lfunion10.
     *
     * @return value of lfunion10
     */
    Lfunion10Union lfunion10();

    /**
     * Returns the attribute lfunion11.
     *
     * @return value of lfunion11
     */
    Lfunion11Union lfunion11();

    /**
     * Returns the attribute lfunion12.
     *
     * @return value of lfunion12
     */
    Tpdfun2 lfunion12();

    /**
     * Returns the attribute lfunion13.
     *
     * @return value of lfunion13
     */
    Tpdfbit lfunion13();

    /**
     * Returns the attribute lfunion14.
     *
     * @return value of lfunion14
     */
    Lfunion14Union lfunion14();

    /**
     * Returns the attribute identityref1.
     *
     * @return value of identityref1
     */
    Iden identityref1();

    /**
     * Returns the attribute onosYangNodeOperationType.
     *
     * @return value of onosYangNodeOperationType
     */
    OnosYangNodeOperationType onosYangNodeOperationType();

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
     * Checks if the passed Cont maps the content match query condition.
     *
     * @param cont cont being passed to check for content match
     * @param isSelectAllSchemaChild is select all schema child
     * @return match result
     */
    Cont processSubtreeFiltering(Cont cont, boolean isSelectAllSchemaChild);

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

    /**
     * Builder for cont.
     */
    interface ContBuilder {

        /**
         * Returns the attribute lfint8Min.
         *
         * @return value of lfint8Min
         */
        byte lfint8Min();

        /**
         * Returns the attribute lfint8Max.
         *
         * @return value of lfint8Max
         */
        byte lfint8Max();

        /**
         * Returns the attribute lfint16Min.
         *
         * @return value of lfint16Min
         */
        short lfint16Min();

        /**
         * Returns the attribute lfint16Max.
         *
         * @return value of lfint16Max
         */
        short lfint16Max();

        /**
         * Returns the attribute lfint32Min.
         *
         * @return value of lfint32Min
         */
        int lfint32Min();

        /**
         * Returns the attribute lfint32Max.
         *
         * @return value of lfint32Max
         */
        int lfint32Max();

        /**
         * Returns the attribute lfint64Min.
         *
         * @return value of lfint64Min
         */
        long lfint64Min();

        /**
         * Returns the attribute lfint64Max.
         *
         * @return value of lfint64Max
         */
        long lfint64Max();

        /**
         * Returns the attribute lfuint8Max.
         *
         * @return value of lfuint8Max
         */
        short lfuint8Max();

        /**
         * Returns the attribute lfuint16Max.
         *
         * @return value of lfuint16Max
         */
        int lfuint16Max();

        /**
         * Returns the attribute lfuint32Max.
         *
         * @return value of lfuint32Max
         */
        long lfuint32Max();

        /**
         * Returns the attribute lfuint64Max.
         *
         * @return value of lfuint64Max
         */
        BigInteger lfuint64Max();

        /**
         * Returns the attribute lfstr.
         *
         * @return value of lfstr
         */
        String lfstr();

        /**
         * Returns the attribute lfstr1.
         *
         * @return value of lfstr1
         */
        String lfstr1();

        /**
         * Returns the attribute lfbool1.
         *
         * @return value of lfbool1
         */
        boolean lfbool1();

        /**
         * Returns the attribute lfbool2.
         *
         * @return value of lfbool2
         */
        boolean lfbool2();

        /**
         * Returns the attribute lfbool3.
         *
         * @return value of lfbool3
         */
        boolean lfbool3();

        /**
         * Returns the attribute lfdecimal1.
         *
         * @return value of lfdecimal1
         */
        BigDecimal lfdecimal1();

        /**
         * Returns the attribute lfdecimal2.
         *
         * @return value of lfdecimal2
         */
        BigDecimal lfdecimal2();

        /**
         * Returns the attribute lfdecimal3.
         *
         * @return value of lfdecimal3
         */
        BigDecimal lfdecimal3();

        /**
         * Returns the attribute lfdecimal4.
         *
         * @return value of lfdecimal4
         */
        BigDecimal lfdecimal4();

        /**
         * Returns the attribute lfdecimal6.
         *
         * @return value of lfdecimal6
         */
        BigDecimal lfdecimal6();

        /**
         * Returns the attribute lfenum.
         *
         * @return value of lfenum
         */
        LfenumEnum lfenum();

        /**
         * Returns the attribute lfbits.
         *
         * @return value of lfbits
         */
        BitSet lfbits();

        /**
         * Returns the attribute lfbinary.
         *
         * @return value of lfbinary
         */
        byte[] lfbinary();

        /**
         * Returns the attribute lfref1.
         *
         * @return value of lfref1
         */
        String lfref1();

        /**
         * Returns the attribute lfref2.
         *
         * @return value of lfref2
         */
        byte lfref2();

        /**
         * Returns the attribute lfempty.
         *
         * @return value of lfempty
         */
        boolean lfempty();

        /**
         * Returns the attribute lfunion1.
         *
         * @return value of lfunion1
         */
        Lfunion1Union lfunion1();

        /**
         * Returns the attribute lfunion2.
         *
         * @return value of lfunion2
         */
        Lfunion2Union lfunion2();

        /**
         * Returns the attribute lfunion4.
         *
         * @return value of lfunion4
         */
        Lfunion4Union lfunion4();

        /**
         * Returns the attribute lfunion5.
         *
         * @return value of lfunion5
         */
        Lfunion5Union lfunion5();

        /**
         * Returns the attribute lfunion7.
         *
         * @return value of lfunion7
         */
        Tpdfun3 lfunion7();

        /**
         * Returns the attribute lfunion8.
         *
         * @return value of lfunion8
         */
        Lfunion8Union lfunion8();

        /**
         * Returns the attribute lfunion9.
         *
         * @return value of lfunion9
         */
        Lfunion9Union lfunion9();

        /**
         * Returns the attribute lfunion10.
         *
         * @return value of lfunion10
         */
        Lfunion10Union lfunion10();

        /**
         * Returns the attribute lfunion11.
         *
         * @return value of lfunion11
         */
        Lfunion11Union lfunion11();

        /**
         * Returns the attribute lfunion12.
         *
         * @return value of lfunion12
         */
        Tpdfun2 lfunion12();

        /**
         * Returns the attribute lfunion13.
         *
         * @return value of lfunion13
         */
        Tpdfbit lfunion13();

        /**
         * Returns the attribute lfunion14.
         *
         * @return value of lfunion14
         */
        Lfunion14Union lfunion14();

        /**
         * Returns the attribute identityref1.
         *
         * @return value of identityref1
         */
        Iden identityref1();

        /**
         * Returns the attribute onosYangNodeOperationType.
         *
         * @return value of onosYangNodeOperationType
         */
        OnosYangNodeOperationType onosYangNodeOperationType();

        /**
         * Returns the builder object of lfint8Min.
         *
         * @param lfint8Min value of lfint8Min
         * @return builder object of lfint8Min
         */
        ContBuilder lfint8Min(byte lfint8Min);

        /**
         * Returns the builder object of lfint8Max.
         *
         * @param lfint8Max value of lfint8Max
         * @return builder object of lfint8Max
         */
        ContBuilder lfint8Max(byte lfint8Max);

        /**
         * Returns the builder object of lfint16Min.
         *
         * @param lfint16Min value of lfint16Min
         * @return builder object of lfint16Min
         */
        ContBuilder lfint16Min(short lfint16Min);

        /**
         * Returns the builder object of lfint16Max.
         *
         * @param lfint16Max value of lfint16Max
         * @return builder object of lfint16Max
         */
        ContBuilder lfint16Max(short lfint16Max);

        /**
         * Returns the builder object of lfint32Min.
         *
         * @param lfint32Min value of lfint32Min
         * @return builder object of lfint32Min
         */
        ContBuilder lfint32Min(int lfint32Min);

        /**
         * Returns the builder object of lfint32Max.
         *
         * @param lfint32Max value of lfint32Max
         * @return builder object of lfint32Max
         */
        ContBuilder lfint32Max(int lfint32Max);

        /**
         * Returns the builder object of lfint64Min.
         *
         * @param lfint64Min value of lfint64Min
         * @return builder object of lfint64Min
         */
        ContBuilder lfint64Min(long lfint64Min);

        /**
         * Returns the builder object of lfint64Max.
         *
         * @param lfint64Max value of lfint64Max
         * @return builder object of lfint64Max
         */
        ContBuilder lfint64Max(long lfint64Max);

        /**
         * Returns the builder object of lfuint8Max.
         *
         * @param lfuint8Max value of lfuint8Max
         * @return builder object of lfuint8Max
         */
        ContBuilder lfuint8Max(short lfuint8Max);

        /**
         * Returns the builder object of lfuint16Max.
         *
         * @param lfuint16Max value of lfuint16Max
         * @return builder object of lfuint16Max
         */
        ContBuilder lfuint16Max(int lfuint16Max);

        /**
         * Returns the builder object of lfuint32Max.
         *
         * @param lfuint32Max value of lfuint32Max
         * @return builder object of lfuint32Max
         */
        ContBuilder lfuint32Max(long lfuint32Max);

        /**
         * Returns the builder object of lfuint64Max.
         *
         * @param lfuint64Max value of lfuint64Max
         * @return builder object of lfuint64Max
         */
        ContBuilder lfuint64Max(BigInteger lfuint64Max);

        /**
         * Returns the builder object of lfstr.
         *
         * @param lfstr value of lfstr
         * @return builder object of lfstr
         */
        ContBuilder lfstr(String lfstr);

        /**
         * Returns the builder object of lfstr1.
         *
         * @param lfstr1 value of lfstr1
         * @return builder object of lfstr1
         */
        ContBuilder lfstr1(String lfstr1);

        /**
         * Returns the builder object of lfbool1.
         *
         * @param lfbool1 value of lfbool1
         * @return builder object of lfbool1
         */
        ContBuilder lfbool1(boolean lfbool1);

        /**
         * Returns the builder object of lfbool2.
         *
         * @param lfbool2 value of lfbool2
         * @return builder object of lfbool2
         */
        ContBuilder lfbool2(boolean lfbool2);

        /**
         * Returns the builder object of lfbool3.
         *
         * @param lfbool3 value of lfbool3
         * @return builder object of lfbool3
         */
        ContBuilder lfbool3(boolean lfbool3);

        /**
         * Returns the builder object of lfdecimal1.
         *
         * @param lfdecimal1 value of lfdecimal1
         * @return builder object of lfdecimal1
         */
        ContBuilder lfdecimal1(BigDecimal lfdecimal1);

        /**
         * Returns the builder object of lfdecimal2.
         *
         * @param lfdecimal2 value of lfdecimal2
         * @return builder object of lfdecimal2
         */
        ContBuilder lfdecimal2(BigDecimal lfdecimal2);

        /**
         * Returns the builder object of lfdecimal3.
         *
         * @param lfdecimal3 value of lfdecimal3
         * @return builder object of lfdecimal3
         */
        ContBuilder lfdecimal3(BigDecimal lfdecimal3);

        /**
         * Returns the builder object of lfdecimal4.
         *
         * @param lfdecimal4 value of lfdecimal4
         * @return builder object of lfdecimal4
         */
        ContBuilder lfdecimal4(BigDecimal lfdecimal4);

        /**
         * Returns the builder object of lfdecimal6.
         *
         * @param lfdecimal6 value of lfdecimal6
         * @return builder object of lfdecimal6
         */
        ContBuilder lfdecimal6(BigDecimal lfdecimal6);

        /**
         * Returns the builder object of lfenum.
         *
         * @param lfenum value of lfenum
         * @return builder object of lfenum
         */
        ContBuilder lfenum(LfenumEnum lfenum);

        /**
         * Returns the builder object of lfbits.
         *
         * @param lfbits value of lfbits
         * @return builder object of lfbits
         */
        ContBuilder lfbits(BitSet lfbits);

        /**
         * Returns the builder object of lfbinary.
         *
         * @param lfbinary value of lfbinary
         * @return builder object of lfbinary
         */
        ContBuilder lfbinary(byte[] lfbinary);

        /**
         * Returns the builder object of lfref1.
         *
         * @param lfref1 value of lfref1
         * @return builder object of lfref1
         */
        ContBuilder lfref1(String lfref1);

        /**
         * Returns the builder object of lfref2.
         *
         * @param lfref2 value of lfref2
         * @return builder object of lfref2
         */
        ContBuilder lfref2(byte lfref2);

        /**
         * Returns the builder object of lfempty.
         *
         * @param lfempty value of lfempty
         * @return builder object of lfempty
         */
        ContBuilder lfempty(boolean lfempty);

        /**
         * Returns the builder object of lfunion1.
         *
         * @param lfunion1 value of lfunion1
         * @return builder object of lfunion1
         */
        ContBuilder lfunion1(Lfunion1Union lfunion1);

        /**
         * Returns the builder object of lfunion2.
         *
         * @param lfunion2 value of lfunion2
         * @return builder object of lfunion2
         */
        ContBuilder lfunion2(Lfunion2Union lfunion2);

        /**
         * Returns the builder object of lfunion4.
         *
         * @param lfunion4 value of lfunion4
         * @return builder object of lfunion4
         */
        ContBuilder lfunion4(Lfunion4Union lfunion4);

        /**
         * Returns the builder object of lfunion5.
         *
         * @param lfunion5 value of lfunion5
         * @return builder object of lfunion5
         */
        ContBuilder lfunion5(Lfunion5Union lfunion5);

        /**
         * Returns the builder object of lfunion7.
         *
         * @param lfunion7 value of lfunion7
         * @return builder object of lfunion7
         */
        ContBuilder lfunion7(Tpdfun3 lfunion7);

        /**
         * Returns the builder object of lfunion8.
         *
         * @param lfunion8 value of lfunion8
         * @return builder object of lfunion8
         */
        ContBuilder lfunion8(Lfunion8Union lfunion8);

        /**
         * Returns the builder object of lfunion9.
         *
         * @param lfunion9 value of lfunion9
         * @return builder object of lfunion9
         */
        ContBuilder lfunion9(Lfunion9Union lfunion9);

        /**
         * Returns the builder object of lfunion10.
         *
         * @param lfunion10 value of lfunion10
         * @return builder object of lfunion10
         */
        ContBuilder lfunion10(Lfunion10Union lfunion10);

        /**
         * Returns the builder object of lfunion11.
         *
         * @param lfunion11 value of lfunion11
         * @return builder object of lfunion11
         */
        ContBuilder lfunion11(Lfunion11Union lfunion11);

        /**
         * Returns the builder object of lfunion12.
         *
         * @param lfunion12 value of lfunion12
         * @return builder object of lfunion12
         */
        ContBuilder lfunion12(Tpdfun2 lfunion12);

        /**
         * Returns the builder object of lfunion13.
         *
         * @param lfunion13 value of lfunion13
         * @return builder object of lfunion13
         */
        ContBuilder lfunion13(Tpdfbit lfunion13);

        /**
         * Returns the builder object of lfunion14.
         *
         * @param lfunion14 value of lfunion14
         * @return builder object of lfunion14
         */
        ContBuilder lfunion14(Lfunion14Union lfunion14);

        /**
         * Returns the builder object of identityref1.
         *
         * @param identityref1 value of identityref1
         * @return builder object of identityref1
         */
        ContBuilder identityref1(Iden identityref1);

        /**
         * Returns the builder object of onosYangNodeOperationType.
         *
         * @param onosYangNodeOperationType value of onosYangNodeOperationType
         * @return builder object of onosYangNodeOperationType
         */
        ContBuilder onosYangNodeOperationType(OnosYangNodeOperationType onosYangNodeOperationType);


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
         * Set a leaf to be selected.
         *
         * @param leaf leaf needs to be selected
         * @return builder object for select leaf
         */
        ContBuilder selectLeaf(LeafIdentifier leaf);

        /**
         * Builds object of cont.
         *
         * @return object of cont.
         */
        Cont build();
    }
}
