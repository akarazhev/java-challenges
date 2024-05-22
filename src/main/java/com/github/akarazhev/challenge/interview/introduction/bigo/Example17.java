package com.github.akarazhev.challenge.interview.introduction.bigo;

public final class Example17 {

    /**
     * There are 2 branches per call, and we go as deep as N, therefore the runtime is O(2^N).
     */
    public static int fib(final int n) {
        if (n <= 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }

        return fib(n - 1) + fib(n - 2);
    }
}
