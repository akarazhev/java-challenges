package com.github.akarazhev.challenge.interview.arraysandstrings;

import java.util.Arrays;

/**
 * Statement: Given two strings, write a method to decide if one is a permutation of the other.
 */
public final class CheckPermutation {

    /**
     * First Solution
     */
    static final class FirstSolution {

        private static String sort(final String s) {
            char[] content = s.toCharArray();
            Arrays.sort(content);
            return new String(content);
        }

        /**
         * This function takes two strings and evaluates if one is a permutation of the other.
         */
        public static boolean permutation(final String s, final String t) {
            return sort(s).equals(sort(t));
        }
    }

    /**
     * Second Solution
     */
    static final class SecondSolution {

        /**
         * This function takes two strings and evaluates if one is a permutation of the other.
         */
        public static boolean permutation(final String s, final String t) {
            if (s.length() != t.length()) {
                return false; // Permutations must be same length
            }

            int[] letters = new int[128]; // Assumption: ASCII
            for (int i = 0; i < s.length(); i++) {
                letters[s.charAt(i)]++;
            }

            for (int i = 0; i < t.length(); i++) {
                letters[t.charAt(i)]--;
                if (letters[t.charAt(i)] < 0) {
                    return false;
                }
            }

            return true; // letters array has no negative values, and therefore no positive values either
        }
    }
}
