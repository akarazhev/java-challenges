package com.github.akarazhev.challenge.interview.introduction.bigo;

public final class Example01 {

    /**
     * This would take O(n) time and O(n) space.
     */
    public static int sum(final int n) {
        if (n <= 0) {
            return 0;
        }

        return n + sum(n - 1);
    }
}
