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

import de.mirkosertic.bytecoder.unittest.BytecoderUnitTestRunner;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

@RunWith(BytecoderUnitTestRunner.class)
public class StringTest {

    @Test
    public void testString() {
        String lala = "Mirko";
        byte[] theData = lala.getBytes();
        assertEquals(5, theData.length, 0);
    }

    @Test
    public void testEquals1() {
        assertTrue("123".equals("123"));
    }

    @Test
    public void testEquals() {
        assertTrue("123".equals(new String("123")));
        assertFalse("123".equals(new String("321")));
        assertFalse("123".equals(null));
        assertFalse("123".equals(10L));
    }

    @Test
    public void testEqualsIgnoreCase() {
        assertTrue("A123".equalsIgnoreCase(new String("a123")));
        assertTrue("abcdefghijklmnopqrstuvwxyz".equalsIgnoreCase(new String("ABCDEFGHIJKLMNOPQRSTUVWXYZ")));
        assertTrue("a123".equalsIgnoreCase(new String("A123")));
        assertFalse("123".equalsIgnoreCase(new String("321")));
        assertFalse("123".equalsIgnoreCase(null));
    }

    @Test
    public void testLength() {
        assertEquals(10, "0123456789".length(), 0);
    }
}