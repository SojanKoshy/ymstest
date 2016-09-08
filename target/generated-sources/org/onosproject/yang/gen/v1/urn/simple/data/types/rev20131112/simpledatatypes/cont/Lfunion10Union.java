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

package org.onosproject.yang.gen.v1.urn.simple.data.types.rev20131112.simpledatatypes.cont;

import java.util.BitSet;
import java.util.Objects;
import com.google.common.base.MoreObjects;

/**
 * Represents the implementation of lfunion10Union.
 */
public final class Lfunion10Union {

    private BitSet bits;
    private boolean yangAutoPrefixBoolean;

    /**
     * Creates an instance of lfunion10Union.
     */
    private Lfunion10Union() {
    }

    /**
     * Creates an instance of lfunion10UnionForTypeBits.
     *
     * @param value value of lfunion10UnionForTypeBits
     */
    public Lfunion10Union(BitSet value) {
        this.bits = value;
    }

    /**
     * Creates an instance of lfunion10UnionForTypeYangAutoPrefixBoolean.
     *
     * @param value value of lfunion10UnionForTypeYangAutoPrefixBoolean
     */
    public Lfunion10Union(boolean value) {
        this.yangAutoPrefixBoolean = value;
    }

    /**
     * Returns the object of lfunion10UnionForTypeBits.
     *
     * @param value value of lfunion10UnionForTypeBits
     * @return Object of lfunion10UnionForTypeBits
     */
    public static Lfunion10Union of(BitSet value) {
        return new Lfunion10Union(value);
    }

    /**
     * Returns the object of lfunion10UnionForTypeYangAutoPrefixBoolean.
     *
     * @param value value of lfunion10UnionForTypeYangAutoPrefixBoolean
     * @return Object of lfunion10UnionForTypeYangAutoPrefixBoolean
     */
    public static Lfunion10Union of(boolean value) {
        return new Lfunion10Union(value);
    }

    /**
     * Returns the attribute bits.
     *
     * @return value of bits
     */
    public BitSet bits() {
        return bits;
    }

    /**
     * Returns the attribute yangAutoPrefixBoolean.
     *
     * @return value of yangAutoPrefixBoolean
     */
    public boolean yangAutoPrefixBoolean() {
        return yangAutoPrefixBoolean;
    }

    @Override
    public int hashCode() {
        return Objects.hash(bits, yangAutoPrefixBoolean);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Lfunion10Union) {
            Lfunion10Union other = (Lfunion10Union) obj;
            return
                 Objects.equals(bits, other.bits) &&
                 Objects.equals(yangAutoPrefixBoolean, other.yangAutoPrefixBoolean);
        }
        return false;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(getClass())
            .omitNullValues()
            .add("bits", bits)
            .add("yangAutoPrefixBoolean", yangAutoPrefixBoolean)
            .toString();
    }

    /**
     * Returns the object of lfunion10Union fromString input String.
     *
     * @param valInString input String
     * @return Object of lfunion10Union
     */
    public static Lfunion10Union fromString(String valInString) {
        try {
            BitSet tmpVal = new BitSet();
            valInString = valInString.replace('{', ' ');
            valInString = valInString.replace('}', ' ');
            valInString = valInString.trim();
            String[] bitsTemp = valInString.split(",", 0);
            for (String bitTemp : bitsTemp) {
                bitTemp = bitTemp.trim();
                tmpVal.set(Integer.parseInt(bitTemp));
            }
            return of(tmpVal);
        } catch (Exception e) {
        }
        try {
            boolean tmpVal = Boolean.parseBoolean(valInString);
            return of(tmpVal);
        } catch (Exception e) {
        }
        return null;
    }
}
