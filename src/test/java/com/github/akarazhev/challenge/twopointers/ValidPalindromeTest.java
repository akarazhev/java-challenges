package com.github.akarazhev.challenge.twopointers;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Provides tests for the <code>Valid Palindrome</code> solution.
 */
@DisplayName("Valid Palindrome Test")
public class ValidPalindromeTest {

    @Test
    @DisplayName("Test Valid Palindrome")
    void testValidPalindrome() {
        assertTrue(ValidPalindrome.isPalindrome("kayak"));
        assertFalse(ValidPalindrome.isPalindrome("hello"));
        assertFalse(ValidPalindrome.isPalindrome("RACEACAR"));
        assertTrue(ValidPalindrome.isPalindrome("A"));
        assertFalse(ValidPalindrome.isPalindrome("ABCDABCD"));
    }
}
