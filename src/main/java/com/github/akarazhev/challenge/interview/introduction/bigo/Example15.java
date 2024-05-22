package com.github.akarazhev.challenge.interview.introduction.bigo;

public final class Example15 {

    /**
     * It will take O(n) time.
     */
    public static int factorial(final int n) {
        if (n < 0) {
            return -1;
        } else if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
}
