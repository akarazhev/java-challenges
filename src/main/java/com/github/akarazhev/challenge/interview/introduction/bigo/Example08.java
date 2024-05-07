package com.github.akarazhev.challenge.interview.introduction.bigo;

public final class Example08 {

    public static void printUnorderedPairs(final int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                System.out.println(array[i] + "," + array[j]);
            }
        }
    }
}
