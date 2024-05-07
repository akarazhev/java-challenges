package com.github.akarazhev.challenge.interview.introduction.bigo;

public final class Example03 {

    public static int[] minAndMax1(final int[] array) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int x : array) {
            if (x < min) min = x;
            if (x > max) max = x;
        }

        return new int[]{min, max};
    }

    public static int[] minAndMax2(final int[] array) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int x : array) {
            if (x < min) min = x;
        }
        for (int x : array) {
            if (x > max) max = x;
        }

        return new int[]{min, max};
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 5, 2, 2, 5, -1, 9, 3};
        minAndMax1(array);
        minAndMax2(array);
    }
}
