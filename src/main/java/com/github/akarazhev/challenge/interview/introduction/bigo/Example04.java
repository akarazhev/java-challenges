package com.github.akarazhev.challenge.interview.introduction.bigo;

public final class Example04 {

    /**
     * We do A chunks of work then B chunks of work. Therefore, the total amount of work is O(A + B).
     */
    public static void foo(final int[] arrA, final int[] arrB) {
        for (int a : arrA) {
            System.out.println(a);
        }

        for (int b : arrB) {
            System.out.println(b);
        }
    }

    /**
     * We do B chunks of work for each element in A. Therefore, the total amount of work is O(A * B).
     */
    public static void bar(final int[] arrA, final int[] arrB) {
        for (int a : arrA) {
            for (int b : arrB) {
                System.out.println(a + "," + b);
            }
        }
    }
}
