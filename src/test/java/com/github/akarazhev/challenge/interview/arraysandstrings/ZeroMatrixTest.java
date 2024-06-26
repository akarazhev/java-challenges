package com.github.akarazhev.challenge.interview.arraysandstrings;

import com.github.akarazhev.challenge.interview.util.AssortedMethods;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * Provides tests for the statement:
 * Write an algorithm such that if an element in an MxN matrix is 0, its entire row and column are set to 0.
 */
@DisplayName("Zero Matrix Test")
public final class ZeroMatrixTest {

    @Test
    @DisplayName("Test First Solution")
    void testFirstSolution() {
        int[][] matrix = AssortedMethods.randomMatrix(10, 15, -10, 10);
        AssortedMethods.printMatrix(matrix);
        ZeroMatrix.FirstSolution.setZeros(matrix);
        System.out.println();
        AssortedMethods.printMatrix(matrix);
    }

    @Test
    @DisplayName("Test Second Solution")
    void testSecondSolution() {
        int[][] matrix = AssortedMethods.randomMatrix(10, 15, -10, 10);
        AssortedMethods.printMatrix(matrix);
        ZeroMatrix.SecondSolution.setZeros(matrix);
        System.out.println();
        AssortedMethods.printMatrix(matrix);
    }
}
