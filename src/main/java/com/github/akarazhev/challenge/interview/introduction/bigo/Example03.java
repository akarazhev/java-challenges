package com.github.akarazhev.challenge.interview.introduction.bigo;

/**
 * It is very possible for O(N) code to run faster than O( 1) code for specific inputs.
 * Big O just describes the rate of increase.
 * For this reason, we drop the constants in runtime. An algorithm that one might have described as O(2N) is actually O(N).
 * <p>
 * Big O allows us to express how the runtime scales. We just need to accept that it doesn't mean that O(N) is always
 * better than O(N^2).
 */
public final class Example03 {

    public static void minAndMax1(final int[] array) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int x : array) {
            if (x < min) {
                min = x;
            }

            if (x > max) {
                max = x;
            }
        }

        System.out.println(min + ", " + max);
    }

    public static void minAndMax2(final int[] array) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int x : array) {
            if (x < min) {
                min = x;
            }
        }

        for (int x : array) {
            if (x > max) {
                max = x;
            }
        }

        System.out.println(min + ", " + max);
    }
}
