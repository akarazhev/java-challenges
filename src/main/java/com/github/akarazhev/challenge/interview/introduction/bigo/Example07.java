package com.github.akarazhev.challenge.interview.introduction.bigo;

public final class Example07 {

    public static void printPairs(final int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.println(array[i] + "," + array[j]);
            }
        }
    }
}
