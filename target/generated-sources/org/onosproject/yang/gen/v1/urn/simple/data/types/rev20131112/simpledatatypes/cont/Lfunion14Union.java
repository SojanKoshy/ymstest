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

import org.onosproject.yang.gen.v1.urn.simple.data.types.rev20131112.simpledatatypes.cont.lfunion14union
            .Lfunion14UnionEnum1;
import java.util.Objects;
import com.google.common.base.MoreObjects;

/**
 * Represents the implementation of lfunion14Union.
 */
public final class Lfunion14Union {

    private Lfunion14UnionEnum1 enumeration;
    private int uint16;

    /**
     * Creates an instance of lfunion14Union.
     */
    private Lfunion14Union() {
    }

    /**
     * Creates an instance of lfunion14UnionForTypeEnumeration.
     *
     * @param value value of lfunion14UnionForTypeEnumeration
     */
    public Lfunion14Union(Lfunion14UnionEnum1 value) {
        this.enumeration = value;
    }

    /**
     * Creates an instance of lfunion14UnionForTypeUint16.
     *
     * @param value value of lfunion14UnionForTypeUint16
     */
    public Lfunion14Union(int value) {
        this.uint16 = value;
    }

    /**
     * Returns the object of lfunion14UnionForTypeEnumeration.
     *
     * @param value value of lfunion14UnionForTypeEnumeration
     * @return Object of lfunion14UnionForTypeEnumeration
     */
    public static Lfunion14Union of(Lfunion14UnionEnum1 value) {
        return new Lfunion14Union(value);
    }

    /**
     * Returns the object of lfunion14UnionForTypeUint16.
     *
     * @param value value of lfunion14UnionForTypeUint16
     * @return Object of lfunion14UnionForTypeUint16
     */
    public static Lfunion14Union of(int value) {
        return new Lfunion14Union(value);
    }

    /**
     * Returns the attribute enumeration.
     *
     * @return value of enumeration
     */
    public Lfunion14UnionEnum1 enumeration() {
        return enumeration;
    }

    /**
     * Returns the attribute uint16.
     *
     * @return value of uint16
     */
    public int uint16() {
        return uint16;
    }

    @Override
    public int hashCode() {
        return Objects.hash(enumeration, uint16);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Lfunion14Union) {
            Lfunion14Union other = (Lfunion14Union) obj;
            return
                 Objects.equals(enumeration, other.enumeration) &&
                 Objects.equals(uint16, other.uint16);
        }
        return false;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(getClass())
            .omitNullValues()
            .add("enumeration", enumeration)
            .add("uint16", uint16)
            .toString();
    }

    /**
     * Returns the object of lfunion14Union fromString input String.
     *
     * @param valInString input String
     * @return Object of lfunion14Union
     */
    public static Lfunion14Union fromString(String valInString) {
        try {
            Lfunion14UnionEnum1 tmpVal = Lfunion14UnionEnum1.fromString(valInString);
            return of(tmpVal);
        } catch (Exception e) {
        }
        try {
            int tmpVal = Integer.parseInt(valInString);
            return of(tmpVal);
        } catch (Exception e) {
        }
        return null;
    }
}
