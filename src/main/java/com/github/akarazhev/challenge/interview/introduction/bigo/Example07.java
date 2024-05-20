package com.github.akarazhev.challenge.interview.introduction.bigo;

public final class Example07 {

    /**
     * The inner for loop has O(N) iterations, and it is called N times. Therefore, the runtime is O(N^2).
     */
    public static void printPairs(final int[] array) {
        for (int k : array) {
            for (int i : array) {
                System.out.println(k + "," + i);
            }
        }
    }
}
