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

import java.util.BitSet;
import java.util.Objects;
import com.google.common.base.MoreObjects;

/**
 * Represents the implementation of tpdfbit.
 */
public final class Tpdfbit {

    private BitSet bits;

    /**
     * Creates an instance of tpdfbit.
     */
    private Tpdfbit() {
    }

    /**
     * Creates an instance of tpdfbitForTypeBits.
     *
     * @param value value of tpdfbitForTypeBits
     */
    public Tpdfbit(BitSet value) {
        this.bits = value;
    }

    /**
     * Returns the object of tpdfbitForTypeBits.
     *
     * @param value value of tpdfbitForTypeBits
     * @return Object of tpdfbitForTypeBits
     */
    public static Tpdfbit of(BitSet value) {
        return new Tpdfbit(value);
    }

    /**
     * Returns the attribute bits.
     *
     * @return value of bits
     */
    public BitSet bits() {
        return bits;
    }

    @Override
    public int hashCode() {
        return Objects.hash(bits);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Tpdfbit) {
            Tpdfbit other = (Tpdfbit) obj;
            return
                 Objects.equals(bits, other.bits);
        }
        return false;
    }

    @Override
    public String toString() {
        return bits.toString();
    }

    /**
     * Returns the object of tpdfbit fromString input String.
     *
     * @param valInString input String
     * @return Object of tpdfbit
     */
    public static Tpdfbit fromString(String valInString) {
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
        return null;
    }
}
