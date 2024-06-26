package com.github.akarazhev.challenge.interview.arraysandstrings;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Provides tests for the statement:
 * Implement an algorithm to determine if a string has all unique characters.
 * What if you cannot use additional data structures?
 */
@DisplayName("Is Unique String Test")
public final class IsUniqueTest {

    @Test
    @DisplayName("Test First Solution")
    void testFirstSolution() {
        assertTrue(IsUnique.FirstSolution.isUniqueChars("abcde"));
        assertFalse(IsUnique.FirstSolution.isUniqueChars("hello"));
        assertFalse(IsUnique.FirstSolution.isUniqueChars("apple"));
        assertTrue(IsUnique.FirstSolution.isUniqueChars("kite"));
        assertTrue(IsUnique.FirstSolution.isUniqueChars("padle"));
    }

    @Test
    @DisplayName("Test Second Solution")
    void testSecondSolution() {
        assertTrue(IsUnique.SecondSolution.isUniqueChars("abcde"));
        assertFalse(IsUnique.SecondSolution.isUniqueChars("hello"));
        assertFalse(IsUnique.SecondSolution.isUniqueChars("apple"));
        assertTrue(IsUnique.SecondSolution.isUniqueChars("kite"));
        assertTrue(IsUnique.SecondSolution.isUniqueChars("padle"));
    }
}
