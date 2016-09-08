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

import java.util.Objects;
import com.google.common.base.MoreObjects;

/**
 * Represents the implementation of lfunion9Union.
 */
public final class Lfunion9Union {

    private int uint16;
    private boolean yangAutoPrefixBoolean;

    /**
     * Creates an instance of lfunion9Union.
     */
    private Lfunion9Union() {
    }

    /**
     * Creates an instance of lfunion9UnionForTypeUint16.
     *
     * @param value value of lfunion9UnionForTypeUint16
     */
    public Lfunion9Union(int value) {
        this.uint16 = value;
    }

    /**
     * Creates an instance of lfunion9UnionForTypeYangAutoPrefixBoolean.
     *
     * @param value value of lfunion9UnionForTypeYangAutoPrefixBoolean
     */
    public Lfunion9Union(boolean value) {
        this.yangAutoPrefixBoolean = value;
    }

    /**
     * Returns the object of lfunion9UnionForTypeUint16.
     *
     * @param value value of lfunion9UnionForTypeUint16
     * @return Object of lfunion9UnionForTypeUint16
     */
    public static Lfunion9Union of(int value) {
        return new Lfunion9Union(value);
    }

    /**
     * Returns the object of lfunion9UnionForTypeYangAutoPrefixBoolean.
     *
     * @param value value of lfunion9UnionForTypeYangAutoPrefixBoolean
     * @return Object of lfunion9UnionForTypeYangAutoPrefixBoolean
     */
    public static Lfunion9Union of(boolean value) {
        return new Lfunion9Union(value);
    }

    /**
     * Returns the attribute uint16.
     *
     * @return value of uint16
     */
    public int uint16() {
        return uint16;
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
        return Objects.hash(uint16, yangAutoPrefixBoolean);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Lfunion9Union) {
            Lfunion9Union other = (Lfunion9Union) obj;
            return
                 Objects.equals(uint16, other.uint16) &&
                 Objects.equals(yangAutoPrefixBoolean, other.yangAutoPrefixBoolean);
        }
        return false;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(getClass())
            .omitNullValues()
            .add("uint16", uint16)
            .add("yangAutoPrefixBoolean", yangAutoPrefixBoolean)
            .toString();
    }

    /**
     * Returns the object of lfunion9Union fromString input String.
     *
     * @param valInString input String
     * @return Object of lfunion9Union
     */
    public static Lfunion9Union fromString(String valInString) {
        try {
            int tmpVal = Integer.parseInt(valInString);
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
