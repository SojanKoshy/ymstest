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

package org.onosproject.yang.gen.v1.urn.simple.data.types.rev20131112.simpledatatypes.tpdfun3;

import org.onosproject.yang.gen.v1.urn.simple.data.types.rev20131112.simpledatatypes.Tpdfbit;
import org.onosproject.yang.gen.v1.urn.simple.data.types.rev20131112.simpledatatypes.Tpdfstring;
import java.util.Objects;
import com.google.common.base.MoreObjects;

/**
 * Represents the implementation of tpdfun3Union.
 */
public final class Tpdfun3Union {

    private Tpdfbit tpdfbit;
    private Tpdfstring tpdfstring;

    /**
     * Creates an instance of tpdfun3Union.
     */
    private Tpdfun3Union() {
    }

    /**
     * Creates an instance of tpdfun3UnionForTypeTpdfbit.
     *
     * @param value value of tpdfun3UnionForTypeTpdfbit
     */
    public Tpdfun3Union(Tpdfbit value) {
        this.tpdfbit = value;
    }

    /**
     * Creates an instance of tpdfun3UnionForTypeTpdfstring.
     *
     * @param value value of tpdfun3UnionForTypeTpdfstring
     */
    public Tpdfun3Union(Tpdfstring value) {
        this.tpdfstring = value;
    }

    /**
     * Returns the object of tpdfun3UnionForTypeTpdfbit.
     *
     * @param value value of tpdfun3UnionForTypeTpdfbit
     * @return Object of tpdfun3UnionForTypeTpdfbit
     */
    public static Tpdfun3Union of(Tpdfbit value) {
        return new Tpdfun3Union(value);
    }

    /**
     * Returns the object of tpdfun3UnionForTypeTpdfstring.
     *
     * @param value value of tpdfun3UnionForTypeTpdfstring
     * @return Object of tpdfun3UnionForTypeTpdfstring
     */
    public static Tpdfun3Union of(Tpdfstring value) {
        return new Tpdfun3Union(value);
    }

    /**
     * Returns the attribute tpdfbit.
     *
     * @return value of tpdfbit
     */
    public Tpdfbit tpdfbit() {
        return tpdfbit;
    }

    /**
     * Returns the attribute tpdfstring.
     *
     * @return value of tpdfstring
     */
    public Tpdfstring tpdfstring() {
        return tpdfstring;
    }

    @Override
    public int hashCode() {
        return Objects.hash(tpdfbit, tpdfstring);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Tpdfun3Union) {
            Tpdfun3Union other = (Tpdfun3Union) obj;
            return
                 Objects.equals(tpdfbit, other.tpdfbit) &&
                 Objects.equals(tpdfstring, other.tpdfstring);
        }
        return false;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(getClass())
            .omitNullValues()
            .add("tpdfbit", tpdfbit)
            .add("tpdfstring", tpdfstring)
            .toString();
    }

    /**
     * Returns the object of tpdfun3Union fromString input String.
     *
     * @param valInString input String
     * @return Object of tpdfun3Union
     */
    public static Tpdfun3Union fromString(String valInString) {
        try {
            Tpdfbit tmpVal = Tpdfbit.fromString(valInString);
            return of(tmpVal);
        } catch (Exception e) {
        }
        try {
            Tpdfstring tmpVal = Tpdfstring.fromString(valInString);
            return of(tmpVal);
        } catch (Exception e) {
        }
        return null;
    }
}
