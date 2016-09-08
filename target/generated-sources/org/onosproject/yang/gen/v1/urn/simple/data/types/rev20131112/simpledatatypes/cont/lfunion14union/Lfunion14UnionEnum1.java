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

package org.onosproject.yang.gen.v1.urn.simple.data.types.rev20131112.simpledatatypes.cont.lfunion14union;

/**
 * Represents ENUM data of lfunion14UnionEnum1.
 */
public enum Lfunion14UnionEnum1 {

    /**
     * Represents zero.
     */
    ZERO(0, "zero"),

    /**
     * Represents one.
     */
    ONE(1, "one");

    private int lfunion14UnionEnum1;
    private String schemaName;

    /**
     * Creates an instance of lfunion14UnionEnum1.
     *
     * @param value value of lfunion14UnionEnum1
     */
    Lfunion14UnionEnum1(int value, String stringValue) {
        lfunion14UnionEnum1 = value;
        schemaName = stringValue;
    }

    /**
     * Returns the object of lfunion14UnionEnum1ForValue.
     *
     * @param value value of lfunion14UnionEnum1ForValue
     * @return Object of lfunion14UnionEnum1ForValue
     */
    public static Lfunion14UnionEnum1 of(int value) {
        switch (value) {
            case 0:
                return Lfunion14UnionEnum1.ZERO;
            case 1:
                return Lfunion14UnionEnum1.ONE;
            default :
                return null;
        }
    }

    /**
     * Returns the object of lfunion14UnionEnum1ForSchemaName.
     *
     * @param value value of lfunion14UnionEnum1ForSchemaName
     * @return Object of lfunion14UnionEnum1ForSchemaName
     */
    public static Lfunion14UnionEnum1 of(String value) {
        switch (value) {
            case "zero":
                return Lfunion14UnionEnum1.ZERO;
            case "one":
                return Lfunion14UnionEnum1.ONE;
            default :
                return null;
        }
    }
    /**
     * Returns the attribute lfunion14UnionEnum1.
     *
     * @return value of lfunion14UnionEnum1
     */
    public int lfunion14UnionEnum1() {
        return lfunion14UnionEnum1;
    }

    /**
     * Returns the attribute schemaName.
     *
     * @return value of schemaName
     */
    public String schemaName() {
        return schemaName;
    }

    /**
     * Returns the object of lfunion14UnionEnum1 fromString input String.
     *
     * @param valInString input String
     * @return Object of lfunion14UnionEnum1
     */
    public static Lfunion14UnionEnum1 fromString(String valInString) {
        try {
            int tmpVal = Integer.parseInt(valInString);
            return of(tmpVal);
        } catch (Exception e) {
        }
        return null;
    }
}
