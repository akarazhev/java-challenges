package com.github.akarazhev.challenge.interview.introduction.bigo;

public final class Question06 {

    public static int sqrt(final int n) {
        for (int guess = 1; guess * guess <= n; guess++) {
            if (guess * guess == n) {
                return guess;
            }
        }

        return -1;
    }
}
