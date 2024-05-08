package com.github.akarazhev.challenge.interview.introduction.bigo;

public final class Question04 {

    public static int div(final int a, final int b) {
        int count = 0;
        int sum = b;
        while (sum <= a) {
            sum += b;
            count++;
        }

        return count;
    }
}
