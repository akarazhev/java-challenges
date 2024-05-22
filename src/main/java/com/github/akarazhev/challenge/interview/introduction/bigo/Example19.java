package com.github.akarazhev.challenge.interview.introduction.bigo;

public final class Example19 {

    /**
     * We're doing a constant amount of work N times, so this is O(n) time.
     */
    public static void allFib(final int n) {
        int[] memo = new int[n + 1];
        for (int i = 0; i < n; i++) {
            System.out.println(i + ": " + fib(i, memo));
        }
    }

    private static int fib(final int n, final int[] memo) {
        if (n <= 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else if (memo[n] > 0) {
            return memo[n];
        }

        memo[n] = fib(n - 1, memo) + fib(n - 2, memo);
        return memo[n];
    }
}
