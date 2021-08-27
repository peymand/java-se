package com.peyman.core.java.numbers.lcm;

import org.junit.Assert;
import org.junit.Test;

import static com.peyman.core.java.numbers.lcm.SimpleAlgorithm.lcm;

public class SimpleAlgorithmUnitTest {

    @Test
    public void testLCM() {
        Assert.assertEquals(36, lcm(12, 18));
    }

}
