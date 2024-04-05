package com.github.akarazhev.challenge.interview.arraysandstrings;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Provides tests for the <code>UniqueString</code> solution.
 */
@DisplayName("Unique String Test")
public class UniqueStringTest {

    @Test
    @DisplayName("Test Is String Unique")
    void testIsStringUnique() {
        assertTrue(UniqueString.isUnique("abcde"));
        assertFalse(UniqueString.isUnique("hello"));
        assertFalse(UniqueString.isUnique("apple"));
        assertTrue(UniqueString.isUnique("kite"));
        assertTrue(UniqueString.isUnique("padle"));
    }

    @Test
    @DisplayName("Test Is String Unique Chars")
    void testIsStringUniqueChars() {
        assertTrue(UniqueString.isUniqueChars("abcde"));
        assertFalse(UniqueString.isUniqueChars("hello"));
        assertFalse(UniqueString.isUniqueChars("apple"));
        assertTrue(UniqueString.isUniqueChars("kite"));
        assertTrue(UniqueString.isUniqueChars("padle"));
    }
}
