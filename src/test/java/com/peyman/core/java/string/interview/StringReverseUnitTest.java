package com.peyman.core.java.string.interview;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringReverseUnitTest {
    @Test
    public void whenUsingInbuildMethods_thenStringReversed() {
        String reversed = new StringBuilder("baeldung").reverse().toString();
        assertEquals("gnudleab", reversed);
    }
}
