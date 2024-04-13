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
            if (s.length() != t.length()) { // Permutations must be same length
                return false;
            }

            int[] letters = new int[128]; // Assumption: ASCII
            char[] string = s.toCharArray();
            for (char c : string) { // count number of each char in s
                letters[c]++;
            }

            for (int i = 0; i < t.length(); i++) {
                int c = t.charAt(i);
                letters[c]--;
                if (letters[c] < 0) {
                    return false;
                }
            }

            return true;
        }
    }
}
