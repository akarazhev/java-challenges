package com.github.akarazhev.challenge.interview.arraysandstrings;

/**
 * Statement: Given an image represented by an NxN matrix, where each pixel in the image is 4 bytes, write a method
 * to rotate the image by 90 degrees. Can you do this in place?
 */
public class RotateMatrix {

    /**
     * This function takes a matrix and writes a method to rotate the image by 90 degrees.
     */
    public static boolean rotate(int[][] matrix) {
        if (matrix.length == 0 || matrix.length != matrix[0].length) {
            return false; // Not a square
        }

        int n = matrix.length;
        for (int layer = 0; layer < n / 2; layer++) {
            int last = n - 1 - layer;
            for (int i = layer; i < last; i++) {
                int offset = i - layer;
                int top = matrix[layer][i]; // save top
                // left -> top
                matrix[layer][i] = matrix[last - offset][layer];
                // bottom -> left
                matrix[last - offset][layer] = matrix[last][last - offset];
                // right -> bottom
                matrix[last][last - offset] = matrix[i][last];
                // top -> right
                matrix[i][last] = top; // right <- saved top
            }
        }

        return true;
    }
}
