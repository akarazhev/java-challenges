package com.github.akarazhev.challenge.interview.arraysandstrings;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Provides tests for the <code>Palindrome Permutation</code> solutions.
 */
@DisplayName("Palindrome Permutation Test")
public class PalindromePermutationTest {

    @Test
    @DisplayName("Test First Solution Is Permutation")
    void testFirstSolutionIsPermutation() {
        assertTrue(PalindromePermutation.FirstSolution.isPermutation("Rats live on no evil star"));
        assertTrue(PalindromePermutation.FirstSolution.isPermutation("A man, a plan, a canal, panama"));
        assertTrue(PalindromePermutation.FirstSolution.isPermutation("Lleve"));
        assertTrue(PalindromePermutation.FirstSolution.isPermutation("Tacotac"));
        assertFalse(PalindromePermutation.FirstSolution.isPermutation("asda"));
    }

    @Test
    @DisplayName("Test Second Solution Is Permutation")
    void testSecondSolutionIsPermutation() {
        assertTrue(PalindromePermutation.SecondSolution.isPermutation("Rats live on no evil star"));
        assertTrue(PalindromePermutation.SecondSolution.isPermutation("A man, a plan, a canal, panama"));
        assertTrue(PalindromePermutation.SecondSolution.isPermutation("Lleve"));
        assertTrue(PalindromePermutation.SecondSolution.isPermutation("Tacotac"));
        assertFalse(PalindromePermutation.SecondSolution.isPermutation("asda"));
    }

    @Test
    @DisplayName("Test Third Solution Is Permutation")
    void testThirdSolutionIsPermutation() {
        assertTrue(PalindromePermutation.ThirdSolution.isPermutation("Rats live on no evil star"));
        assertTrue(PalindromePermutation.ThirdSolution.isPermutation("A man, a plan, a canal, panama"));
        assertTrue(PalindromePermutation.ThirdSolution.isPermutation("Lleve"));
        assertTrue(PalindromePermutation.ThirdSolution.isPermutation("Tacotac"));
        assertFalse(PalindromePermutation.ThirdSolution.isPermutation("asda"));
    }
}
