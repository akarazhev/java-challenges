package com.github.akarazhev.challenge.interview.introduction.bigo;

public final class Example20 {

    /**
     * There are log N powers of 2 between 1 and n. Therefore, the runtime is 0(log n).
     */
    public static int powersOf2(final int n) {
        if (n == 1) {
            System.out.println(1);
            return 1;
        } else {
            int prev = powersOf2(n / 2);
            int curr = prev * 2;
            System.out.println(curr);
            return curr;
        }
    }
}
