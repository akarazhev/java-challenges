package com.github.akarazhev.challenge.interview.arraysandstrings;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Provides tests for the <code>Is Unique</code> solutions.
 */
@DisplayName("Unique String Test")
public class IsUniqueTest {

    @Test
    @DisplayName("Test Is String Unique")
    void testIsStringUnique() {
        assertTrue(IsUnique.isUnique("abcde"));
        assertFalse(IsUnique.isUnique("hello"));
        assertFalse(IsUnique.isUnique("apple"));
        assertTrue(IsUnique.isUnique("kite"));
        assertTrue(IsUnique.isUnique("padle"));
    }

    @Test
    @DisplayName("Test Is String Unique Chars")
    void testIsStringUniqueChars() {
        assertTrue(IsUnique.isUniqueChars("abcde"));
        assertFalse(IsUnique.isUniqueChars("hello"));
        assertFalse(IsUnique.isUniqueChars("apple"));
        assertTrue(IsUnique.isUniqueChars("kite"));
        assertTrue(IsUnique.isUniqueChars("padle"));
    }
}
