package com.github.akarazhev.challenge.interview.introduction.bigo;

public final class Question01 {

    /**
     * The following code computes the product of a and b. What is its runtime?
     * O(b). The for loop just iterates through b.
     */
    public static int product(final int a, final int b) {
        int sum = 0;
        for (int i = 0; i < b; i++) {
            sum += a;
        }

        return sum;
    }
}
