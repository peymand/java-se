package com.peyman.core.java.syntax.breakcontinue;


import org.junit.jupiter.api.Test;

import static com.peyman.core.java.syntax.breakcontinue.BreakContinue.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BreakContinueUnitTest {

    @Test
    public void whenUnlabeledBreak_ThenEqual() {
        assertEquals(4, unlabeledBreak());
    }

    @Test
    public void whenUnlabeledBreakNestedLoops_ThenEqual() {
        assertEquals(2, unlabeledBreakNestedLoops());
    }

    @Test
    public void whenLabeledBreak_ThenEqual() {
        assertEquals(1, labeledBreak());
    }

    @Test
    public void whenUnlabeledContinue_ThenEqual() {
        assertEquals(5, unlabeledContinue());
    }

    @Test
    public void whenLabeledContinue_ThenEqual() {
        assertEquals(3, labeledContinue());
    }

}
