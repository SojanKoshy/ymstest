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

import org.onosproject.yang.gen.v1.urn.simple.data.types.rev20131112.simpledatatypes.Tpdfun1;
import org.onosproject.yang.gen.v1.urn.simple.data.types.rev20131112.simpledatatypes.Tpdfun2;
import java.util.Objects;
import com.google.common.base.MoreObjects;

/**
 * Represents the implementation of lfunion11Union.
 */
public final class Lfunion11Union {

    private Tpdfun1 tpdfun1;
    private Tpdfun2 tpdfun2;

    /**
     * Creates an instance of lfunion11Union.
     */
    private Lfunion11Union() {
    }

    /**
     * Creates an instance of lfunion11UnionForTypeTpdfun1.
     *
     * @param value value of lfunion11UnionForTypeTpdfun1
     */
    public Lfunion11Union(Tpdfun1 value) {
        this.tpdfun1 = value;
    }

    /**
     * Creates an instance of lfunion11UnionForTypeTpdfun2.
     *
     * @param value value of lfunion11UnionForTypeTpdfun2
     */
    public Lfunion11Union(Tpdfun2 value) {
        this.tpdfun2 = value;
    }

    /**
     * Returns the object of lfunion11UnionForTypeTpdfun1.
     *
     * @param value value of lfunion11UnionForTypeTpdfun1
     * @return Object of lfunion11UnionForTypeTpdfun1
     */
    public static Lfunion11Union of(Tpdfun1 value) {
        return new Lfunion11Union(value);
    }

    /**
     * Returns the object of lfunion11UnionForTypeTpdfun2.
     *
     * @param value value of lfunion11UnionForTypeTpdfun2
     * @return Object of lfunion11UnionForTypeTpdfun2
     */
    public static Lfunion11Union of(Tpdfun2 value) {
        return new Lfunion11Union(value);
    }

    /**
     * Returns the attribute tpdfun1.
     *
     * @return value of tpdfun1
     */
    public Tpdfun1 tpdfun1() {
        return tpdfun1;
    }

    /**
     * Returns the attribute tpdfun2.
     *
     * @return value of tpdfun2
     */
    public Tpdfun2 tpdfun2() {
        return tpdfun2;
    }

    @Override
    public int hashCode() {
        return Objects.hash(tpdfun1, tpdfun2);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Lfunion11Union) {
            Lfunion11Union other = (Lfunion11Union) obj;
            return
                 Objects.equals(tpdfun1, other.tpdfun1) &&
                 Objects.equals(tpdfun2, other.tpdfun2);
        }
        return false;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(getClass())
            .omitNullValues()
            .add("tpdfun1", tpdfun1)
            .add("tpdfun2", tpdfun2)
            .toString();
    }

    /**
     * Returns the object of lfunion11Union fromString input String.
     *
     * @param valInString input String
     * @return Object of lfunion11Union
     */
    public static Lfunion11Union fromString(String valInString) {
        try {
            Tpdfun1 tmpVal = Tpdfun1.fromString(valInString);
            return of(tmpVal);
        } catch (Exception e) {
        }
        try {
            Tpdfun2 tmpVal = Tpdfun2.fromString(valInString);
            return of(tmpVal);
        } catch (Exception e) {
        }
        return null;
    }
}
