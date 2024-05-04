package com.github.akarazhev.challenge.interview.introduction.bigo;

public final class Example01 {

    public static int sum(final int n) {
        if (n <= 0) {
            return 0;
        }

        return n + sum(n - 1);
    }
}
