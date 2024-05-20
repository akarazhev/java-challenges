package com.github.akarazhev.challenge.interview.introduction.bigo;

public final class Example02 {

    private static int pairSum(final int a, final int b) {
        return a + b;
    }

    /**
     * There will be roughly O(n) calls to pairSum. However, those calls do not exist simultaneously on the call stack,
     * so you only need O(1) space.
     */
    public static int pairSumSequence(final int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += pairSum(i, i + 1);
        }

        return sum;
    }
}
