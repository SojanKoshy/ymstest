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

package org.onosproject.yang.gen.v1.urn.simple.data.types.rev20131112.simpledatatypes.tpdfun2;

import org.onosproject.yang.gen.v1.urn.simple.data.types.rev20131112.simpledatatypes.Tpdfun3;
import org.onosproject.yang.gen.v1.urn.simple.data.types.rev20131112.simpledatatypes.Tpdfun4;
import java.util.Objects;
import com.google.common.base.MoreObjects;

/**
 * Represents the implementation of tpdfun2Union.
 */
public final class Tpdfun2Union {

    private Tpdfun3 tpdfun3;
    private Tpdfun4 tpdfun4;

    /**
     * Creates an instance of tpdfun2Union.
     */
    private Tpdfun2Union() {
    }

    /**
     * Creates an instance of tpdfun2UnionForTypeTpdfun3.
     *
     * @param value value of tpdfun2UnionForTypeTpdfun3
     */
    public Tpdfun2Union(Tpdfun3 value) {
        this.tpdfun3 = value;
    }

    /**
     * Creates an instance of tpdfun2UnionForTypeTpdfun4.
     *
     * @param value value of tpdfun2UnionForTypeTpdfun4
     */
    public Tpdfun2Union(Tpdfun4 value) {
        this.tpdfun4 = value;
    }

    /**
     * Returns the object of tpdfun2UnionForTypeTpdfun3.
     *
     * @param value value of tpdfun2UnionForTypeTpdfun3
     * @return Object of tpdfun2UnionForTypeTpdfun3
     */
    public static Tpdfun2Union of(Tpdfun3 value) {
        return new Tpdfun2Union(value);
    }

    /**
     * Returns the object of tpdfun2UnionForTypeTpdfun4.
     *
     * @param value value of tpdfun2UnionForTypeTpdfun4
     * @return Object of tpdfun2UnionForTypeTpdfun4
     */
    public static Tpdfun2Union of(Tpdfun4 value) {
        return new Tpdfun2Union(value);
    }

    /**
     * Returns the attribute tpdfun3.
     *
     * @return value of tpdfun3
     */
    public Tpdfun3 tpdfun3() {
        return tpdfun3;
    }

    /**
     * Returns the attribute tpdfun4.
     *
     * @return value of tpdfun4
     */
    public Tpdfun4 tpdfun4() {
        return tpdfun4;
    }

    @Override
    public int hashCode() {
        return Objects.hash(tpdfun3, tpdfun4);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Tpdfun2Union) {
            Tpdfun2Union other = (Tpdfun2Union) obj;
            return
                 Objects.equals(tpdfun3, other.tpdfun3) &&
                 Objects.equals(tpdfun4, other.tpdfun4);
        }
        return false;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(getClass())
            .omitNullValues()
            .add("tpdfun3", tpdfun3)
            .add("tpdfun4", tpdfun4)
            .toString();
    }

    /**
     * Returns the object of tpdfun2Union fromString input String.
     *
     * @param valInString input String
     * @return Object of tpdfun2Union
     */
    public static Tpdfun2Union fromString(String valInString) {
        try {
            Tpdfun3 tmpVal = Tpdfun3.fromString(valInString);
            return of(tmpVal);
        } catch (Exception e) {
        }
        try {
            Tpdfun4 tmpVal = Tpdfun4.fromString(valInString);
            return of(tmpVal);
        } catch (Exception e) {
        }
        return null;
    }
}
