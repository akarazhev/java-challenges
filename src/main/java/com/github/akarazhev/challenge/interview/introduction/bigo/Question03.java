package com.github.akarazhev.challenge.interview.introduction.bigo;

public final class Question03 {

    /**
     * The following code computes a % b. What is its runtime?
     * O(1). It does a constant amount of work.
     */
    public static int mod(final int a, final int b) {
        if (b <= 0) {
            return -1;
        }

        int div = a / b;
        return a - div * b;
    }
}
