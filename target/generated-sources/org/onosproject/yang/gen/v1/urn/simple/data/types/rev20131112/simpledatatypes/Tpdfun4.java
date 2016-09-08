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

import java.util.Objects;
import com.google.common.base.MoreObjects;

/**
 * Represents the implementation of tpdfun4.
 */
public final class Tpdfun4 {

    private boolean yangAutoPrefixBoolean;

    /**
     * Creates an instance of tpdfun4.
     */
    private Tpdfun4() {
    }

    /**
     * Creates an instance of tpdfun4ForTypeYangAutoPrefixBoolean.
     *
     * @param value value of tpdfun4ForTypeYangAutoPrefixBoolean
     */
    public Tpdfun4(boolean value) {
        this.yangAutoPrefixBoolean = value;
    }

    /**
     * Returns the object of tpdfun4ForTypeYangAutoPrefixBoolean.
     *
     * @param value value of tpdfun4ForTypeYangAutoPrefixBoolean
     * @return Object of tpdfun4ForTypeYangAutoPrefixBoolean
     */
    public static Tpdfun4 of(boolean value) {
        return new Tpdfun4(value);
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
        return Objects.hash(yangAutoPrefixBoolean);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Tpdfun4) {
            Tpdfun4 other = (Tpdfun4) obj;
            return
                 Objects.equals(yangAutoPrefixBoolean, other.yangAutoPrefixBoolean);
        }
        return false;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(getClass())
            .add("yangAutoPrefixBoolean", yangAutoPrefixBoolean)
            .toString();
    }

    /**
     * Returns the object of tpdfun4 fromString input String.
     *
     * @param valInString input String
     * @return Object of tpdfun4
     */
    public static Tpdfun4 fromString(String valInString) {
        try {
            boolean tmpVal = Boolean.parseBoolean(valInString);
            return of(tmpVal);
        } catch (Exception e) {
        }
        return null;
    }
}
