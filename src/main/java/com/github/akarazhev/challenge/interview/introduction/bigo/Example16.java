package com.github.akarazhev.challenge.interview.introduction.bigo;

public final class Example16 {

    /**
     * Since we are calling permutation 0(n*n!) times (as an upper bound), and each one takes O(n) time,
     * the total runtime will not exceed O(n^2*n!).
     */
    public static void permutation(final String str) {
        permutation(str, "");
    }

    private static void permutation(final String str, final String prefix) {
        if (str.isEmpty()) {
            System.out.println(prefix);
        } else {
            for (int i = 0; i < str.length(); i++) {
                String rem = str.substring(0, i) + str.substring(i + 1);
                permutation(rem, prefix + str.charAt(i));
            }
        }
    }
}
