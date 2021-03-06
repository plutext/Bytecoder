/*
 * Copyright 2017 Mirko Sertic
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package de.mirkosertic.bytecoder.classlib.java.lang;

import de.mirkosertic.bytecoder.api.NoExceptionCheck;
import de.mirkosertic.bytecoder.api.SubstitutesInClass;
import de.mirkosertic.bytecoder.classlib.VM;

@SubstitutesInClass(completeReplace = true)
public class TShort extends Number {

    private short shortValue;

    @NoExceptionCheck
    public TShort(short aShortValue) {
        shortValue = aShortValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;

        Short tShort = (Short) o;

        if (shortValue != tShort.shortValue())
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        return shortValue;
    }

    @Override
    public int intValue() {
        return (int) shortValue;
    }

    @Override
    public float floatValue() {
        return (float) shortValue;
    }

    @Override
    public long longValue() {
        return shortValue;
    }

    @Override
    public double doubleValue() {
        return shortValue;
    }

    @Override
    public String toString() {
        return toString(shortValue);
    }

    public static TShort valueOf(short aValue) {
        return new TShort(aValue);
    }

    public static TShort valueOf(String aValue) {
        return new TShort((short) VM.stringToLong(aValue));
    }

    public static short parseShort(String aString) {
        return (short) VM.stringToLong(aString);
    }

    public static String toString(short aValue) {
        StringBuilder theBuffer = new StringBuilder();
        theBuffer.append(aValue);
        return theBuffer.toString();
    }
}
