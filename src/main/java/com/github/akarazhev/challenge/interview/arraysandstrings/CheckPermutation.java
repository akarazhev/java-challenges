package com.github.akarazhev.challenge.interview.arraysandstrings;

/**
 * Statement: Given two strings, write a method to decide if one is a permutation of the other.
 */
public class CheckPermutation {

    /**
     * First Solution: The function takes two strings and evaluates if one is a permutation of the other.
     */
    static class FirstSolution {

        private static String sort(String string) {
            char[] content = string.toCharArray();
            java.util.Arrays.sort(content);
            return new String(content);
        }

        public static boolean permutation(String firstString, String secondString) {
            return sort(firstString).equals(sort(secondString));
        }
    }

    /**
     * Second Solution: The function takes two strings and evaluates if one is a permutation of the other.
     */
    static class SecondSolution {

        public static boolean permutation(String firstString, String secondString) {
            if (firstString.length() != secondString.length()) {
                return false; // Permutations must be same length
            }

            int[] letters = new int[128]; // Assumption: ASCII
            for (int i = 0; i < firstString.length(); i++) {
                letters[firstString.charAt(i)]++;
            }

            for (int i = 0; i < secondString.length(); i++) {
                letters[secondString.charAt(i)]--;
                if (letters[secondString.charAt(i)] < 0) {
                    return false;
                }
            }

            return true; // letters array has no negative values, and therefore no positive values either
        }
    }
}
