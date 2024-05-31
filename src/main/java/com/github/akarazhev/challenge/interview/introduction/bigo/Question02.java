package com.github.akarazhev.challenge.interview.introduction.bigo;

public final class Question02 {

    /**
     * The following code computes a^b. What is its runtime?
     * O(b). The recursive code iterates through b calls, since it subtracts one at each level.
     */
    public static int power(final int a, final int b) {
        if (b < 0) {
            return 0; // error
        } else if (b == 0) {
            return 1;
        } else {
            return a * power(a, b - 1);
        }
    }
}
