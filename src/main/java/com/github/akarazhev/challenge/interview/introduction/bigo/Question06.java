package com.github.akarazhev.challenge.interview.introduction.bigo;

public final class Question06 {

    /**
     * The following code computes the [integer] square root of a number. If the number is not a perfect square
     * (there is no integer square root), then it returns -1. It does this by trying increasingly large numbers
     * until it finds the right value (or is too high). What is its runtime?
     * O(sqrt(n)). This is just a straightforward loop that stops when guess * guess > n (or, in other words, when
     * guess > sqrt(n)).
     */
    public static int sqrt(final int n) {
        for (int guess = 1; guess * guess <= n; guess++) {
            if (guess * guess == n) {
                return guess;
            }
        }

        return -1;
    }
}
