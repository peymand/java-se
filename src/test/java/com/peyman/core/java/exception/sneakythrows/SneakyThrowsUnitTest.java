package com.peyman.core.java.exception.sneakythrows;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class SneakyThrowsUnitTest {

    @Test
    public void whenCallSneakyMethod_thenThrowSneakyException() {
        try {
            SneakyThrows.throwsSneakyIOException();
        } catch (Exception ex) {
            assertEquals("sneaky", ex.getMessage().toString());
        }
    }

}
