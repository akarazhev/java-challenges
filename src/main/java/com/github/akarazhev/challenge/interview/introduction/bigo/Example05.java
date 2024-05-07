package com.github.akarazhev.challenge.interview.introduction.bigo;

public final class Example05 {

    public static int f(final int n) {
        if (n <= 0) {
            return 1;
        }

        return f(n - 1) + f(n - 1);
    }
}
