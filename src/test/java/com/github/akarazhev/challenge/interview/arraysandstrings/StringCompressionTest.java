package com.github.akarazhev.challenge.interview.arraysandstrings;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Provides tests for the <code>String Compression</code> solutions.
 */
@DisplayName("String Compression Test")
public class StringCompressionTest {

    @Test
    @DisplayName("Test First Solution Compress")
    void testFirstSolutionCompress() {
        assertEquals("a5b4a4b2d2c1", StringCompression.FirstSolution.compress("aaaaabbbbaaaabbddc"));
    }

    @Test
    @DisplayName("Test Second Solution Compress")
    void testSecondSolutionCompress() {
        assertEquals("a5b4a4b2d2c1", StringCompression.SecondSolution.compress("aaaaabbbbaaaabbddc"));
    }

    @Test
    @DisplayName("Test Third Solution Compress")
    void testThirdSolutionCompress() {
        assertEquals("a5b4a4b2d2c1", StringCompression.ThirdSolution.compress("aaaaabbbbaaaabbddc"));
    }
}
