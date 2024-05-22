package com.github.akarazhev.challenge.interview.introduction.bigo;

public final class Example10 {

    /**
     * 1000 units of work is still constant, so the runtime is 0(ab).
     */
    public static void printUnorderedPairs(final int[] arrayA, final int[] arrayB) {
        for (int j : arrayA) {
            for (int value : arrayB) {
                for (int k = 0; k < 1000; k++) {
                    System.out.println(j + "," + value);
                }
            }
        }
    }
}
