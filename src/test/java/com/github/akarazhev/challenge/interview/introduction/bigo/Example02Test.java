package com.github.akarazhev.challenge.interview.introduction.bigo;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Example 02 Test")
public final class Example02Test {

    @Test
    @DisplayName("Test Pair Sum Sequence")
    public void testPairSumSequence() {
        assertEquals(16, Example02.pairSumSequence(4));
    }
}
