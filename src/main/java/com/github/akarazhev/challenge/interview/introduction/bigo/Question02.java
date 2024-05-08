package com.github.akarazhev.challenge.interview.introduction.bigo;

public final class Question02 {

    public static int power(final int a, final int b) {
        if (b < 0) {
            return 0; // error
        } else if (b == 0) {
            return 1;
        } else {
            return a * power(a, b - 1);
        }
    }
}
