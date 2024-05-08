package com.github.akarazhev.challenge.interview.introduction.bigo;

public final class Example11 {

    public static void reverse(final int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int other = array.length - i - 1;
            int temp = array[i];
            array[i] = array[other];
            array[other] = temp;
        }
    }
}
