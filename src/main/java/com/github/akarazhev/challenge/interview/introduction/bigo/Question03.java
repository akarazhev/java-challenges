package com.github.akarazhev.challenge.interview.introduction.bigo;

public final class Question03 {

    public static int mod(final int a, final int b) {
        if (b <= 0) {
            return -1;
        }

        int div = a / b;
        return a - div * b;
    }
}
