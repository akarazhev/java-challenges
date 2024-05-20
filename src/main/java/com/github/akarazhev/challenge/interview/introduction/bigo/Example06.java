package com.github.akarazhev.challenge.interview.introduction.bigo;

/**
 * This will take O(N) time. The fact that we iterate through the array twice doesn't matter.
 */
public final class Example06 {

    public static void foo(final int[] array) {
        int sum = 0;
        int product = 1;
        for (int j : array) {
            sum += j;
        }

        for (int j : array) {
            product *= j;
        }

        System.out.println(sum + ", " + product);
    }
}
