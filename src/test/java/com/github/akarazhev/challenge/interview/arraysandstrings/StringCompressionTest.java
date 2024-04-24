package com.github.akarazhev.challenge.interview.arraysandstrings;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Provides tests for the statement: Implement a method to perform basic string compression using the counts of repeated
 * characters. For example, the string aabcccccaaa would become a2blc5a3. If the "compressed" string would not become
 * smaller than the original string, your method should return the original string. You can assume the string has only
 * uppercase and lowercase letters (a - z).
 */
@DisplayName("String Compression Test")
public class StringCompressionTest {

    @Test
    @DisplayName("Test First Solution")
    void testFirstSolution() {
        assertEquals("aa", StringCompression.FirstSolution.compress("aa"));
        assertEquals("a5b4a4b2d2c1", StringCompression.FirstSolution.compress("aaaaabbbbaaaabbddc"));
    }

    @Test
    @DisplayName("Test Second Solution")
    void testSecondSolution() {
        assertEquals("aa", StringCompression.SecondSolution.compress("aa"));
        assertEquals("a5b4a4b2d2c1", StringCompression.SecondSolution.compress("aaaaabbbbaaaabbddc"));
    }

    @Test
    @DisplayName("Test Third Solution")
    void testThirdSolution() {
        assertEquals("aa", StringCompression.ThirdSolution.compress("aa"));
        assertEquals("a5b4a4b2d2c1", StringCompression.ThirdSolution.compress("aaaaabbbbaaaabbddc"));
    }
}
