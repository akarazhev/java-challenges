package com.github.akarazhev.challenge.interview.introduction.bigo;

public final class Example18 {

    /**
     * This is 2^n+1. Therefore, the runtime to compute the first n Fibonacci numbers (using this terrible algorithm)
     * is still O(2^n)
     */
    public static void allFib(final int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(i + ": " + fib(i));
        }
    }

    private static int fib(final int n) {
        if (n <= 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }

        return fib(n - 1) + fib(n - 2);
    }
}
