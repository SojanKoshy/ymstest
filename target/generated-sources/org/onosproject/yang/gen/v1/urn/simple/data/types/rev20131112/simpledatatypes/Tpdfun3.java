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

import org.onosproject.yang.gen.v1.urn.simple.data.types.rev20131112.simpledatatypes.tpdfun3.Tpdfun3Union;
import java.util.Objects;
import com.google.common.base.MoreObjects;

/**
 * Represents the implementation of tpdfun3.
 */
public final class Tpdfun3 {

    private Tpdfun3Union union;

    /**
     * Creates an instance of tpdfun3.
     */
    private Tpdfun3() {
    }

    /**
     * Creates an instance of tpdfun3ForTypeUnion.
     *
     * @param value value of tpdfun3ForTypeUnion
     */
    public Tpdfun3(Tpdfun3Union value) {
        this.union = value;
    }

    /**
     * Returns the object of tpdfun3ForTypeUnion.
     *
     * @param value value of tpdfun3ForTypeUnion
     * @return Object of tpdfun3ForTypeUnion
     */
    public static Tpdfun3 of(Tpdfun3Union value) {
        return new Tpdfun3(value);
    }

    /**
     * Returns the attribute union.
     *
     * @return value of union
     */
    public Tpdfun3Union union() {
        return union;
    }

    @Override
    public int hashCode() {
        return Objects.hash(union);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Tpdfun3) {
            Tpdfun3 other = (Tpdfun3) obj;
            return
                 Objects.equals(union, other.union);
        }
        return false;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(getClass())
            .add("union", union)
            .toString();
    }

    /**
     * Returns the object of tpdfun3 fromString input String.
     *
     * @param valInString input String
     * @return Object of tpdfun3
     */
    public static Tpdfun3 fromString(String valInString) {
        try {
            Tpdfun3Union tmpVal = Tpdfun3Union.fromString(valInString);
            return of(tmpVal);
        } catch (Exception e) {
        }
        return null;
    }
}
