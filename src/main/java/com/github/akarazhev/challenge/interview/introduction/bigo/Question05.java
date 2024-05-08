package com.github.akarazhev.challenge.interview.introduction.bigo;

public final class Question05 {

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
