package com.github.akarazhev.challenge.interview.arraysandstrings;

/**
 * Statement: Write an algorithm such that if an element in an MxN matrix is 0, its entire row and column are set to 0.
 */
public final class ZeroMatrix {

    private final static class Common {

        private static void nullifyRow(final int[][] matrix, final int row) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[row][j] = 0;
            }
        }

        private static void nullifyColumn(final int[][] matrix, final int col) {
            for (int i = 0; i < matrix.length; i++) {
                matrix[i][col] = 0;
            }
        }

        private static boolean matricesAreEqual(final int[][] m1, final int[][] m2) {
            if (m1.length != m2.length || m1[0].length != m2[0].length) {
                return false;
            }

            for (int k = 0; k < m1.length; k++) {
                for (int j = 0; j < m1[0].length; j++) {
                    if (m1[k][j] != m2[k][j]) {
                        return false;
                    }
                }
            }

            return true;
        }

        private static int[][] cloneMatrix(final int[][] matrix) {
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
    static final class FirstSolution {

        public static void setZeros(final int[][] matrix) {
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
    static final class SecondSolution {

        public static void setZeros(final int[][] matrix) {
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
