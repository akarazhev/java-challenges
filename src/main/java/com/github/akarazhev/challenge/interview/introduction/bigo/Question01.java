package com.github.akarazhev.challenge.interview.introduction.bigo;

public final class Question01 {

    public static int product(final int a, final int b) {
        int sum = 0;
        for (int i = 0; i < b; i++) {
            sum += a;
        }

        return sum;
    }
}
