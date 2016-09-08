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

/**
 * Represents ENUM data of lfenumEnum.
 */
public enum LfenumEnum {

    /**
     * Represents enum1.
     */
    ENUM1(0, "enum1"),

    /**
     * Represents enum2.
     */
    ENUM2(1, "enum2"),

    /**
     * Represents enum3.
     */
    ENUM3(2, "enum3"),

    /**
     * Represents enum4.
     */
    ENUM4(3, "enum4");

    private int lfenumEnum;
    private String schemaName;

    /**
     * Creates an instance of lfenumEnum.
     *
     * @param value value of lfenumEnum
     */
    LfenumEnum(int value, String stringValue) {
        lfenumEnum = value;
        schemaName = stringValue;
    }

    /**
     * Returns the object of lfenumEnumForValue.
     *
     * @param value value of lfenumEnumForValue
     * @return Object of lfenumEnumForValue
     */
    public static LfenumEnum of(int value) {
        switch (value) {
            case 0:
                return LfenumEnum.ENUM1;
            case 1:
                return LfenumEnum.ENUM2;
            case 2:
                return LfenumEnum.ENUM3;
            case 3:
                return LfenumEnum.ENUM4;
            default :
                return null;
        }
    }

    /**
     * Returns the object of lfenumEnumForSchemaName.
     *
     * @param value value of lfenumEnumForSchemaName
     * @return Object of lfenumEnumForSchemaName
     */
    public static LfenumEnum of(String value) {
        switch (value) {
            case "enum1":
                return LfenumEnum.ENUM1;
            case "enum2":
                return LfenumEnum.ENUM2;
            case "enum3":
                return LfenumEnum.ENUM3;
            case "enum4":
                return LfenumEnum.ENUM4;
            default :
                return null;
        }
    }
    /**
     * Returns the attribute lfenumEnum.
     *
     * @return value of lfenumEnum
     */
    public int lfenumEnum() {
        return lfenumEnum;
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
     * Returns the object of lfenumEnum fromString input String.
     *
     * @param valInString input String
     * @return Object of lfenumEnum
     */
    public static LfenumEnum fromString(String valInString) {
        try {
            int tmpVal = Integer.parseInt(valInString);
            return of(tmpVal);
        } catch (Exception e) {
        }
        return null;
    }
}
