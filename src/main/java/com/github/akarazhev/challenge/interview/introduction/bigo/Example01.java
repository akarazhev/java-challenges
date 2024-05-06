package com.github.akarazhev.challenge.interview.introduction.bigo;

/**
 * This would take O(n) time and O(n) space.
 */
public final class Example01 {

    public static int sum(final int n) {
        if (n <= 0) {
            return 0;
        }

        return n + sum(n - 1);
    }
}
