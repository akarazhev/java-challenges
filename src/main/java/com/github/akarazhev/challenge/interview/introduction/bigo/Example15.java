package com.github.akarazhev.challenge.interview.introduction.bigo;

public final class Example15 {

    /**
     * This runs in O(sqrt(n)) time.
     */
    public static boolean isPrime(final int n) {
        for (int x = 2; x * x <= n; x++) {
            if (n % x == 0) {
                return false;
            }
        }

        return true;
    }
}
