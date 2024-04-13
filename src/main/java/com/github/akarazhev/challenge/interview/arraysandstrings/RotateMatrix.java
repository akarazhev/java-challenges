package com.github.akarazhev.challenge.interview.arraysandstrings;

/**
 * Provides <code>Rotate Matrix</code> solutions.
 */
public class RotateMatrix {

    /**
     * This function takes a matrix and writes a method to rotate the image by 90 degrees.
     *
     * @param m the matrix
     * @return the result of operation
     */
    public static boolean rotate(int[][] m) {
        if (m.length == 0 || m.length != m[0].length) {
            return false; // Not a square
        }

        int n = m.length;
        for (int layer = 0; layer < n / 2; layer++) {
            int last = n - 1 - layer;
            for (int i = layer; i < last; i++) {
                int offset = i - layer;
                int top = m[layer][i]; // save top
                // left -> top
                m[layer][i] = m[last - offset][layer];
                // bottom -> left
                m[last - offset][layer] = m[last][last - offset];
                // right -> bottom
                m[last][last - offset] = m[i][last];
                // top -> right
                m[i][last] = top; // right <- saved top
            }
        }

        return true;
    }
}
