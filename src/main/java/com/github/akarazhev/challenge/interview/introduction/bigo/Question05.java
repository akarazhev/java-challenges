package com.github.akarazhev.challenge.interview.introduction.bigo;

public final class Question05 {

    /**
     * The following code computes the [integer] square root of a number. If the number is not a perfect square
     * (there is no integer square root), then it returns -1. It does this by successive guessing. If n is 100,
     * it first guesses 50. Too high? Try something lower - halfway between 1 and SO. What is its runtime?
     * O(log n). This algorithm is essentially doing a binary search to find the square root. Therefore, the runtime is
     * O(log n).
     */
    public static int sqrt(final int n) {
        return sqrtHelper(n, 1, n);
    }

    private static int sqrtHelper(final int n, final int min, final int max) {
        if (max < min) {
            return -1; // no square root
        }

        int guess = (min + max) / 2;
        if (guess * guess == n) { // found it!
            return guess;
        } else if (guess * guess < n) { // too low
            return sqrtHelper(n, guess + 1, max); // try higher
        } else { // too high
            return sqrtHelper(n, min, guess - 1); // try lower
        }
    }
}
