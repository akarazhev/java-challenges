package com.github.akarazhev.challenge.interview.introduction.bigo;

public final class Example05 {

    /**
     * When you have a recursive function that makes multiple calls, the runtime will often (but not always) look
     * like O(branches^depth), where branches is the number of times each recursive call branches. In this case,
     * this gives us O(2^N).
     */
    public static int f(final int n) {
        if (n <= 0) {
            return 1;
        }

        return f(n - 1) + f(n - 1);
    }
}
