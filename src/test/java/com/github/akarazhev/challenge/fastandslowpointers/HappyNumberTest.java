package com.github.akarazhev.challenge.fastandslowpointers;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Provides tests for the <code>HappyNumberTest</code> solution.
 */
@DisplayName("Happy Number Test")
public class HappyNumberTest {

    @Test
    @DisplayName("Test is 2147483646 happy number")
    void testIs2147483646HappyNumber() {
        assertFalse(HappyNumber.isHappyNumber(2147483646));
    }

    @Test
    @DisplayName("Test is 1 happy number")
    void testIs1HappyNumber() {
        assertTrue(HappyNumber.isHappyNumber(1));
    }

    @Test
    @DisplayName("Test is 19 happy number")
    void testIs19HappyNumber() {
        assertTrue(HappyNumber.isHappyNumber(19));
    }

    @Test
    @DisplayName("Test is 8 happy number")
    void testIs8HappyNumber() {
        assertFalse(HappyNumber.isHappyNumber(8));
    }

    @Test
    @DisplayName("Test is 7 happy number")
    void testIs7HappyNumber() {
        assertTrue(HappyNumber.isHappyNumber(7));
    }
}
