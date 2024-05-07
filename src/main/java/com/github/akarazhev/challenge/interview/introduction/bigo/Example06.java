package com.github.akarazhev.challenge.interview.introduction.bigo;

/**
 * What is the runtime of the below code?
 * <p>
 * This will take O(N) time. The fact that we iterate through the array twice doesn't matter.
 */
public final class Example06 {

    public static void foo(final int[] array) {
        int sum = 0;
        int product = 1;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        for (int i = 0; i < array.length; i++) {
            product *= array[i];
        }

        System.out.println(sum + ", " + product);
    }
}
