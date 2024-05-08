package com.github.akarazhev.challenge.interview.introduction;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

@DisplayName("Compare Binary To Hex Test")
public final class CompareBinaryToHexTest {

    @Test
    @DisplayName("Test Compare Bin To Hex")
    public void testCompareBinToHex() {
        assertTrue(CompareBinaryToHex.compareBinToHex("111001011", "1CB"));
    }
}
