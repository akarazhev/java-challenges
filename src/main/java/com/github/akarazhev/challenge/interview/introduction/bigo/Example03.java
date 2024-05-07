package com.github.akarazhev.challenge.interview.introduction.bigo;

public final class Example03 {

    public static void minAndMax1(final int[] array) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int x : array) {
            if (x < min) min = x;
            if (x > max) max = x;
        }

        System.out.println(min + ", " + max);
    }

    public static void minAndMax2(final int[] array) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int x : array) {
            if (x < min) min = x;
        }

        for (int x : array) {
            if (x > max) max = x;
        }

        System.out.println(min + ", " + max);
    }
}
