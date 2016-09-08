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
 * Represents the implementation of lfunion4Union.
 */
public final class Lfunion4Union {

    private boolean yangAutoPrefixBoolean;
    private String string;

    /**
     * Creates an instance of lfunion4Union.
     */
    private Lfunion4Union() {
    }

    /**
     * Creates an instance of lfunion4UnionForTypeYangAutoPrefixBoolean.
     *
     * @param value value of lfunion4UnionForTypeYangAutoPrefixBoolean
     */
    public Lfunion4Union(boolean value) {
        this.yangAutoPrefixBoolean = value;
    }

    /**
     * Creates an instance of lfunion4UnionForTypeString.
     *
     * @param value value of lfunion4UnionForTypeString
     */
    public Lfunion4Union(String value) {
        this.string = value;
    }

    /**
     * Returns the object of lfunion4UnionForTypeYangAutoPrefixBoolean.
     *
     * @param value value of lfunion4UnionForTypeYangAutoPrefixBoolean
     * @return Object of lfunion4UnionForTypeYangAutoPrefixBoolean
     */
    public static Lfunion4Union of(boolean value) {
        return new Lfunion4Union(value);
    }

    /**
     * Returns the object of lfunion4UnionForTypeString.
     *
     * @param value value of lfunion4UnionForTypeString
     * @return Object of lfunion4UnionForTypeString
     */
    public static Lfunion4Union of(String value) {
        return new Lfunion4Union(value);
    }

    /**
     * Returns the attribute yangAutoPrefixBoolean.
     *
     * @return value of yangAutoPrefixBoolean
     */
    public boolean yangAutoPrefixBoolean() {
        return yangAutoPrefixBoolean;
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
        return Objects.hash(yangAutoPrefixBoolean, string);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Lfunion4Union) {
            Lfunion4Union other = (Lfunion4Union) obj;
            return
                 Objects.equals(yangAutoPrefixBoolean, other.yangAutoPrefixBoolean) &&
                 Objects.equals(string, other.string);
        }
        return false;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(getClass())
            .omitNullValues()
            .add("yangAutoPrefixBoolean", yangAutoPrefixBoolean)
            .add("string", string)
            .toString();
    }

    /**
     * Returns the object of lfunion4Union fromString input String.
     *
     * @param valInString input String
     * @return Object of lfunion4Union
     */
    public static Lfunion4Union fromString(String valInString) {
        try {
            boolean tmpVal = Boolean.parseBoolean(valInString);
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
