package com.github.akarazhev.challenge.interview.arraysandstrings;

/**
 * Statement: There are three types of edits that can be performed on strings: insert a character, remove a character,
 * or replace a character. Given two strings, write a function to check if they are one edit (or zero edits) away.
 * <p>
 * EXAMPLE
 * pale,  ple  -> true
 * pales, pale -> true
 * pale,  bale -> true
 * pale,  bake -> false
 */
public class OneAway {

    /**
     * First solution
     */
    static class FirstSolution {

        private static boolean oneEditReplace(String s1, String s2) {
            boolean foundDifference = false;
            for (int i = 0; i < s1.length(); i++) {
                if (s1.charAt(i) != s2.charAt(i)) {
                    if (foundDifference) {
                        return false;
                    }

                    foundDifference = true;
                }
            }

            return true;
        }

        /**
         * Check if you can insert a character into s1 to make s2.
         */
        private static boolean oneEditInsert(String s1, String s2) {
            int index1 = 0;
            int index2 = 0;
            while (index2 < s2.length() && index1 < s1.length()) {
                if (s1.charAt(index1) != s2.charAt(index2)) {
                    if (index1 != index2) {
                        return false;
                    }

                    index2++;
                } else {
                    index1++;
                    index2++;
                }
            }

            return true;
        }

        /**
         * This function takes two strings and checks if they are one edit (or zero edits) away.
         */
        public static boolean oneEditAway(String first, String second) {
            if (first.length() == second.length()) {
                return oneEditReplace(first, second);
            } else if (first.length() + 1 == second.length()) {
                return oneEditInsert(first, second);
            } else if (first.length() - 1 == second.length()) {
                return oneEditInsert(second, first);
            }

            return false;
        }
    }

    /**
     * Second solution
     */
    static class SecondSolution {

        /**
         * This function takes two strings and checks if they are one edit (or zero edits) away.
         */
        public static boolean oneEditAway(String firstString, String secondString) {
            /* Length checks. */
            if (Math.abs(firstString.length() - secondString.length()) > 1) {
                return false;
            }

            /* Get shorter and longer string.*/
            String shorterString = firstString.length() < secondString.length() ? firstString : secondString;
            String longerString = firstString.length() < secondString.length() ? secondString : firstString;

            int firstIndex = 0;
            int secondIndex = 0;
            boolean foundDifference = false;
            while (secondIndex < longerString.length() && firstIndex < shorterString.length()) {
                if (shorterString.charAt(firstIndex) != longerString.charAt(secondIndex)) {
                    /* Ensure that this is the first difference found.*/
                    if (foundDifference) {
                        return false;
                    }

                    foundDifference = true;
                    if (shorterString.length() == longerString.length()) { // On replace, move shorter pointer
                        firstIndex++;
                    }
                } else {
                    firstIndex++; // If matching, move shorter pointer
                }

                secondIndex++; // Always move pointer for longer string
            }

            return true;
        }
    }
}
