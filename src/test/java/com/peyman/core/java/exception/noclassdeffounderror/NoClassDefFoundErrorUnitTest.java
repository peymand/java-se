package com.peyman.core.java.exception.noclassdeffounderror;

import org.junit.Test;

public class NoClassDefFoundErrorUnitTest {

    @Test(expected = NoClassDefFoundError.class)
    public void givenInitErrorInClass_whenloadClass_thenNoClassDefFoundError() {
        NoClassDefFoundErrorExample sample = new NoClassDefFoundErrorExample();
        sample.getClassWithInitErrors();
    }
}