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

package org.onosproject.yang.gen.v1.urn.simple.data.types.rev20131112.simpledatatypes.tpdfun1;

import java.math.BigDecimal;
import java.util.Objects;
import com.google.common.base.MoreObjects;

/**
 * Represents the implementation of tpdfun1Union.
 */
public final class Tpdfun1Union {

    private short uint8;
    private BigDecimal decimal64;

    /**
     * Creates an instance of tpdfun1Union.
     */
    private Tpdfun1Union() {
    }

    /**
     * Creates an instance of tpdfun1UnionForTypeUint8.
     *
     * @param value value of tpdfun1UnionForTypeUint8
     */
    public Tpdfun1Union(short value) {
        this.uint8 = value;
    }

    /**
     * Creates an instance of tpdfun1UnionForTypeDecimal64.
     *
     * @param value value of tpdfun1UnionForTypeDecimal64
     */
    public Tpdfun1Union(BigDecimal value) {
        this.decimal64 = value;
    }

    /**
     * Returns the object of tpdfun1UnionForTypeUint8.
     *
     * @param value value of tpdfun1UnionForTypeUint8
     * @return Object of tpdfun1UnionForTypeUint8
     */
    public static Tpdfun1Union of(short value) {
        return new Tpdfun1Union(value);
    }

    /**
     * Returns the object of tpdfun1UnionForTypeDecimal64.
     *
     * @param value value of tpdfun1UnionForTypeDecimal64
     * @return Object of tpdfun1UnionForTypeDecimal64
     */
    public static Tpdfun1Union of(BigDecimal value) {
        return new Tpdfun1Union(value);
    }

    /**
     * Returns the attribute uint8.
     *
     * @return value of uint8
     */
    public short uint8() {
        return uint8;
    }

    /**
     * Returns the attribute decimal64.
     *
     * @return value of decimal64
     */
    public BigDecimal decimal64() {
        return decimal64;
    }

    @Override
    public int hashCode() {
        return Objects.hash(uint8, decimal64);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Tpdfun1Union) {
            Tpdfun1Union other = (Tpdfun1Union) obj;
            return
                 Objects.equals(uint8, other.uint8) &&
                 Objects.equals(decimal64, other.decimal64);
        }
        return false;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(getClass())
            .omitNullValues()
            .add("uint8", uint8)
            .add("decimal64", decimal64)
            .toString();
    }

    /**
     * Returns the object of tpdfun1Union fromString input String.
     *
     * @param valInString input String
     * @return Object of tpdfun1Union
     */
    public static Tpdfun1Union fromString(String valInString) {
        try {
            short tmpVal = Short.parseShort(valInString);
            return of(tmpVal);
        } catch (Exception e) {
        }
        try {
            BigDecimal tmpVal = new BigDecimal(valInString);
            return of(tmpVal);
        } catch (Exception e) {
        }
        return null;
    }
}
