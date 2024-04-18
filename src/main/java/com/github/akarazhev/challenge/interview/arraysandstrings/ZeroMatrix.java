package com.github.akarazhev.challenge.interview.arraysandstrings;

/**
 * Provides <code>Zero Matrix</code> solution.
 */
public class ZeroMatrix {

    /**
     * First solution
     */
    static class FirstSolution {

        private static void nullifyRow(int[][] m, int r) {
            for (int j = 0; j < m[0].length; j++) {
                m[r][j] = 0;
            }
        }

        private static void nullifyColumn(int[][] m, int c) {
            for (int i = 0; i < m.length; i++) {
                m[i][c] = 0;
            }
        }

        public static void setZeros(int[][] m) {
            boolean[] row = new boolean[m.length];
            boolean[] column = new boolean[m[0].length];
            // Store the row and column index with value 0
            for (int i = 0; i < m.length; i++) {
                for (int j = 0; j < m[0].length; j++) {
                    if (m[i][j] == 0) {
                        row[i] = true;
                        column[j] = true;
                    }
                }
            }
            // Nullify rows
            for (int i = 0; i < row.length; i++) {
                if (row[i]) {
                    nullifyRow(m, i);
                }
            }
            // Nullify columns
            for (int j = 0; j < column.length; j++) {
                if (column[j]) {
                    nullifyColumn(m, j);
                }
            }
        }

        private static boolean matricesAreEqual(int[][] m1, int[][] m2) {
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

        private static int[][] cloneMatrix(int[][] m) {
            int[][] c = new int[m.length][m[0].length];
            for (int i = 0; i < m.length; i++) {
                for (int j = 0; j < m[0].length; j++) {
                    c[i][j] = m[i][j];
                }
            }

            return c;
        }
    }

    /**
     * Second solution
     */
    static class SecondSolution {

        private static void nullifyRow(int[][] m, int r) {
            for (int j = 0; j < m[0].length; j++) {
                m[r][j] = 0;
            }
        }

        private static void nullifyColumn(int[][] m, int c) {
            for (int i = 0; i < m.length; i++) {
                m[i][c] = 0;
            }
        }

        public static void setZeros(int[][] m) {
            boolean rowHasZero = false;
            boolean colHasZero = false;
            // Check if first row has a zero
            for (int j = 0; j < m[0].length; j++) {
                if (m[0][j] == 0) {
                    rowHasZero = true;
                    break;
                }
            }
            // Check if first column has a zero
            for (int i = 0; i < m.length; i++) {
                if (m[i][0] == 0) {
                    colHasZero = true;
                    break;
                }
            }
            // Check for zeros in the rest of the array
            for (int i = 1; i < m.length; i++) {
                for (int j = 1; j < m[0].length; j++) {
                    if (m[i][j] == 0) {
                        m[i][0] = 0;
                        m[0][j] = 0;
                    }
                }
            }
            // Nullify rows based on values in first column
            for (int i = 1; i < m.length; i++) {
                if (m[i][0] == 0) {
                    nullifyRow(m, i);
                }
            }
            // Nullify columns based on values in first row
            for (int j = 1; j < m[0].length; j++) {
                if (m[0][j] == 0) {
                    nullifyColumn(m, j);
                }
            }
            // Nullify first row
            if (rowHasZero) {
                nullifyRow(m, 0);
            }
            // Nullify first column
            if (colHasZero) {
                nullifyColumn(m, 0);
            }
        }

        private static boolean matricesAreEqual(int[][] m1, int[][] m2) {
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

        private static int[][] cloneMatrix(int[][] m) {
            int[][] c = new int[m.length][m[0].length];
            for (int i = 0; i < m.length; i++) {
                for (int j = 0; j < m[0].length; j++) {
                    c[i][j] = m[i][j];
                }
            }

            return c;
        }
    }
}
