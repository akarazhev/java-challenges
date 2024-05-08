package com.github.akarazhev.challenge.interview.introduction.bigo;

public final class Example18 {

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
