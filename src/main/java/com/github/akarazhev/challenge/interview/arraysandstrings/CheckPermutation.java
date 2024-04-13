package com.github.akarazhev.challenge.interview.arraysandstrings;

/**
 * Provides <code>Check Permutation</code> solutions.
 */
public class CheckPermutation {

    /**
     * First Solution
     */
    static class FirstSolution {

        private static String sort(String s) {
            char[] content = s.toCharArray();
            java.util.Arrays.sort(content);
            return new String(content);
        }

        /**
         * This function takes two strings and evaluates if one is a permutation of the other.
         *
         * @param s the first string
         * @param t the second string
         * @return the result of operation
         */
        public static boolean permutation(String s, String t) {
            return sort(s).equals(sort(t));
        }
    }

    /**
     * Second Solution
     */
    static class SecondSolution {

        /**
         * This function takes two strings and evaluates if one is a permutation of the other.
         *
         * @param s the first string
         * @param t the second string
         * @return the result of operation
         */
        public static boolean permutation(String s, String t) {
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
