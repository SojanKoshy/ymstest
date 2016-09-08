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

import java.math.BigDecimal;
import java.util.Objects;
import com.google.common.base.MoreObjects;

/**
 * Represents the implementation of lfunion2Union.
 */
public final class Lfunion2Union {

    private BigDecimal decimal64;
    private String string;

    /**
     * Creates an instance of lfunion2Union.
     */
    private Lfunion2Union() {
    }

    /**
     * Creates an instance of lfunion2UnionForTypeDecimal64.
     *
     * @param value value of lfunion2UnionForTypeDecimal64
     */
    public Lfunion2Union(BigDecimal value) {
        this.decimal64 = value;
    }

    /**
     * Creates an instance of lfunion2UnionForTypeString.
     *
     * @param value value of lfunion2UnionForTypeString
     */
    public Lfunion2Union(String value) {
        this.string = value;
    }

    /**
     * Returns the object of lfunion2UnionForTypeDecimal64.
     *
     * @param value value of lfunion2UnionForTypeDecimal64
     * @return Object of lfunion2UnionForTypeDecimal64
     */
    public static Lfunion2Union of(BigDecimal value) {
        return new Lfunion2Union(value);
    }

    /**
     * Returns the object of lfunion2UnionForTypeString.
     *
     * @param value value of lfunion2UnionForTypeString
     * @return Object of lfunion2UnionForTypeString
     */
    public static Lfunion2Union of(String value) {
        return new Lfunion2Union(value);
    }

    /**
     * Returns the attribute decimal64.
     *
     * @return value of decimal64
     */
    public BigDecimal decimal64() {
        return decimal64;
    }

    /**
     * Returns the attribute string.
     *
     * @return value of string
     */
    public String string() {
        return string;
    }

    @Override
    public int hashCode() {
        return Objects.hash(decimal64, string);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Lfunion2Union) {
            Lfunion2Union other = (Lfunion2Union) obj;
            return
                 Objects.equals(decimal64, other.decimal64) &&
                 Objects.equals(string, other.string);
        }
        return false;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(getClass())
            .omitNullValues()
            .add("decimal64", decimal64)
            .add("string", string)
            .toString();
    }

    /**
     * Returns the object of lfunion2Union fromString input String.
     *
     * @param valInString input String
     * @return Object of lfunion2Union
     */
    public static Lfunion2Union fromString(String valInString) {
        try {
            BigDecimal tmpVal = new BigDecimal(valInString);
            return of(tmpVal);
        } catch (Exception e) {
        }
        try {
            String tmpVal = (valInString);
            return of(tmpVal);
        } catch (Exception e) {
        }
        return null;
    }
}
