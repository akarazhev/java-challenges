package com.github.akarazhev.challenge.interview.introduction.bigo;

public final class Example09 {

    public static void printUnorderedPairs(final int[] arrayA, final int[] arrayB) {
        for (int i = 0; i < arrayA.length; i++) {
            for (int j = 0; j < arrayB.length; j++) {
                if (arrayA[i] < arrayB[j]) {
                    System.out.println(arrayA[i] + "," + arrayB[j]);
                }
            }
        }
    }
}
