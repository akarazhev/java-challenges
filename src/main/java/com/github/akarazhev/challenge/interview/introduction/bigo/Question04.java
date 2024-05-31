package com.github.akarazhev.challenge.interview.introduction.bigo;

public final class Question04 {

    /**
     * The following code performs integer division. What is its runtime (assume a and b are both positive)?
     * O(a/b). The variable count will eventually equal a/b. The while loop iterates count times. Therefore,
     * it iterates a/b times.
     */
    public static int div(final int a, final int b) {
        int count = 0;
        int sum = b;
        while (sum <= a) {
            sum += b;
            count++;
        }

        return count;
    }
}
