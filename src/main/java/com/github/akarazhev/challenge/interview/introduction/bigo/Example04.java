package com.github.akarazhev.challenge.interview.introduction.bigo;

public final class Example04 {

    public static void foo(final int[] arrA, final int[] arrB) {
        for (int a : arrA) {
            System.out.println(a);
        }

        for (int b : arrB) {
            System.out.println(b);
        }
    }

    public static void bar(final int[] arrA, final int[] arrB) {
        for (int a : arrA) {
            for (int b : arrB) {
                System.out.println(a + "," + b);
            }
        }
    }
}
