package com.github.akarazhev.challenge.interview.arraysandstrings;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Provides tests for the statement: Given a string, write a function to check if it is a permutation of a palindrome.
 * A palindrome is a word or phrase that is the same forwards and backwards. A permutation is a rearrangement of letters.
 * The palindrome does not need to be limited to just dictionary words.
 */
@DisplayName("Palindrome String Permutation Test")
public class PalindromePermutationTest {

    @Test
    @DisplayName("Test First Solution")
    void testFirstSolution() {
        assertTrue(PalindromePermutation.FirstSolution.isPermutation("Ratzs live on no evil starz"));
        assertTrue(PalindromePermutation.FirstSolution.isPermutation("Zeus was deified, saw Suez"));
        assertTrue(PalindromePermutation.FirstSolution.isPermutation("Rats live on no evil star"));
        assertTrue(PalindromePermutation.FirstSolution.isPermutation("A man, a plan, a canal, panama"));
        assertTrue(PalindromePermutation.FirstSolution.isPermutation("Lleve"));
        assertTrue(PalindromePermutation.FirstSolution.isPermutation("Tacotac"));
        assertFalse(PalindromePermutation.FirstSolution.isPermutation("asda"));
    }

    @Test
    @DisplayName("Test Second Solution")
    void testSecondSolution() {
        assertTrue(PalindromePermutation.SecondSolution.isPermutation("Ratzs live on no evil starz"));
        assertTrue(PalindromePermutation.SecondSolution.isPermutation("Zeus was deified, saw Suez"));
        assertTrue(PalindromePermutation.SecondSolution.isPermutation("Rats live on no evil star"));
        assertTrue(PalindromePermutation.SecondSolution.isPermutation("A man, a plan, a canal, panama"));
        assertTrue(PalindromePermutation.SecondSolution.isPermutation("Lleve"));
        assertTrue(PalindromePermutation.SecondSolution.isPermutation("Tacotac"));
        assertFalse(PalindromePermutation.SecondSolution.isPermutation("asda"));
    }

    @Test
    @DisplayName("Test Third Solution")
    void testThirdSolution() {
        assertTrue(PalindromePermutation.ThirdSolution.isPermutation("Ratzs live on no evil starz"));
        assertTrue(PalindromePermutation.ThirdSolution.isPermutation("Zeus was deified, saw Suez"));
        assertTrue(PalindromePermutation.ThirdSolution.isPermutation("Rats live on no evil star"));
        assertTrue(PalindromePermutation.ThirdSolution.isPermutation("A man, a plan, a canal, panama"));
        assertTrue(PalindromePermutation.ThirdSolution.isPermutation("Lleve"));
        assertTrue(PalindromePermutation.ThirdSolution.isPermutation("Tacotac"));
        assertFalse(PalindromePermutation.ThirdSolution.isPermutation("asda"));
    }
}
