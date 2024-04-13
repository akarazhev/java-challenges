package com.github.akarazhev.challenge.interview.arraysandstrings;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Provides tests for the <code>Rotate Matrix</code> solutions.
 */
@DisplayName("Rotate Matrix Test")
public class RotateMatrixTest {

    @Test
    @DisplayName("Test Rotate")
    void testRotate() {
        assertTrue(RotateMatrix.rotate(new int[][]{{3, 3}, {0, 9}}));
    }
}
