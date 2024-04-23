package com.github.akarazhev.challenge.interview.arraysandstrings;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Provides tests for the statement:
 * Given two strings, write a method to decide if one is a permutation of the other.
 */
@DisplayName("Check String Permutation Test")
public class CheckPermutationTest {

    @Test
    @DisplayName("Test First Solution")
    void testFirstSolution() {
        assertTrue(CheckPermutation.FirstSolution.permutation("apple", "papel"));
        assertTrue(CheckPermutation.FirstSolution.permutation("carrot", "tarroc"));
        assertFalse(CheckPermutation.FirstSolution.permutation("hello", "llloh"));
    }

    @Test
    @DisplayName("Test Second Solution")
    void testSecondSolution() {
        assertTrue(CheckPermutation.SecondSolution.permutation("apple", "papel"));
        assertTrue(CheckPermutation.SecondSolution.permutation("carrot", "tarroc"));
        assertFalse(CheckPermutation.SecondSolution.permutation("hello", "llloh"));
    }
}
