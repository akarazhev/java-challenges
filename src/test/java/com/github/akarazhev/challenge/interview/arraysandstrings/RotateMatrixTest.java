package com.github.akarazhev.challenge.interview.arraysandstrings;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Provides tests for the statement: Given an image represented by an NxN matrix, where each pixel in the image is
 * 4 bytes, write a method to rotate the image by 90 degrees. Can you do this in place?
 */
@DisplayName("Rotate Matrix Test")
public final class RotateMatrixTest {

    @Test
    @DisplayName("Test Rotate")
    void testRotate() {
        int[][] matrix = new int[][]{{3, 3}, {0, 9}};
        assertTrue(RotateMatrix.rotate(matrix));
        assertEquals(0, matrix[0][0]);
        assertEquals(3, matrix[0][1]);
        assertEquals(3, matrix[1][1]);
        assertEquals(9, matrix[1][0]);
    }
}
