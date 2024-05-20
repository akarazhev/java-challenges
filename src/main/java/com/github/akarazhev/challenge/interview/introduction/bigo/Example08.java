package com.github.akarazhev.challenge.interview.introduction.bigo;

public final class Example08 {

    /**
     * There are N^2 total pairs. Roughly half of those will have i < j and the remaining half will have i > j.
     * This code goes through roughly N^2/2 pairs, so it does O(N^2) work.
     */
    public static void printUnorderedPairs(final int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                System.out.println(array[i] + "," + array[j]);
            }
        }
    }
}
