package com.github.akarazhev.challenge.interview.introduction.bigo;

public final class Example09 {

    /**
     * The if-statement within j's for loop is O(1) time since it's just a sequence of constant-time statements.
     * For each element of arrayA, the inner for loop goes through b iterations, where b = arrayB.length.
     * if a = arrayA.length, then the runtime is O(ab).
     */
    public static void printUnorderedPairs(final int[] arrayA, final int[] arrayB) {
        for (int k : arrayA) {
            for (int i : arrayB) {
                if (k < i) {
                    System.out.println(k + "," + i);
                }
            }
        }
    }
}
