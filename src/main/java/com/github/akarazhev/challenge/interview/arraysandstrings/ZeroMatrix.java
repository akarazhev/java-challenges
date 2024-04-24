package com.github.akarazhev.challenge.interview.arraysandstrings;

/**
 * Statement: Write an algorithm such that if an element in an MxN matrix is 0, its entire row and column are set to 0.
 */
public class ZeroMatrix {

    private static class Common {

        private static void nullifyRow(int[][] matrix, int row) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[row][j] = 0;
            }
        }

        private static void nullifyColumn(int[][] matrix, int col) {
            for (int i = 0; i < matrix.length; i++) {
                matrix[i][col] = 0;
            }
        }

        private static boolean matricesAreEqual(int[][] firstMatrix, int[][] secondMatrix) {
            if (firstMatrix.length != secondMatrix.length || firstMatrix[0].length != secondMatrix[0].length) {
                return false;
            }

            for (int k = 0; k < firstMatrix.length; k++) {
                for (int j = 0; j < firstMatrix[0].length; j++) {
                    if (firstMatrix[k][j] != secondMatrix[k][j]) {
                        return false;
                    }
                }
            }

            return true;
        }

        private static int[][] cloneMatrix(int[][] matrix) {
            int[][] c = new int[matrix.length][matrix[0].length];
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[0].length; j++) {
                    c[i][j] = matrix[i][j];
                }
            }

            return c;
        }
    }

    /**
     * First solution
     */
    static class FirstSolution {

        public static void setZeros(int[][] matrix) {
            boolean[] row = new boolean[matrix.length];
            boolean[] column = new boolean[matrix[0].length];
            // Store the row and column index with value 0
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[0].length; j++) {
                    if (matrix[i][j] == 0) {
                        row[i] = true;
                        column[j] = true;
                    }
                }
            }
            // Nullify rows
            for (int i = 0; i < row.length; i++) {
                if (row[i]) {
                    Common.nullifyRow(matrix, i);
                }
            }
            // Nullify columns
            for (int j = 0; j < column.length; j++) {
                if (column[j]) {
                    Common.nullifyColumn(matrix, j);
                }
            }
        }
    }

    /**
     * Second solution
     */
    static class SecondSolution {

        public static void setZeros(int[][] matrix) {
            boolean rowHasZero = false;
            boolean colHasZero = false;
            // Check if first row has a zero
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[0][j] == 0) {
                    rowHasZero = true;
                    break;
                }
            }
            // Check if first column has a zero
            for (int i = 0; i < matrix.length; i++) {
                if (matrix[i][0] == 0) {
                    colHasZero = true;
                    break;
                }
            }
            // Check for zeros in the rest of the array
            for (int i = 1; i < matrix.length; i++) {
                for (int j = 1; j < matrix[0].length; j++) {
                    if (matrix[i][j] == 0) {
                        matrix[i][0] = 0;
                        matrix[0][j] = 0;
                    }
                }
            }
            // Nullify rows based on values in first column
            for (int i = 1; i < matrix.length; i++) {
                if (matrix[i][0] == 0) {
                    Common.nullifyRow(matrix, i);
                }
            }
            // Nullify columns based on values in first row
            for (int j = 1; j < matrix[0].length; j++) {
                if (matrix[0][j] == 0) {
                    Common.nullifyColumn(matrix, j);
                }
            }
            // Nullify first row
            if (rowHasZero) {
                Common.nullifyRow(matrix, 0);
            }
            // Nullify first column
            if (colHasZero) {
                Common.nullifyColumn(matrix, 0);
            }
        }
    }
}
