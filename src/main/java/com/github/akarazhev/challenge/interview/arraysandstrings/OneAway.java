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

        private static boolean oneEditReplace(String firstString, String secondString) {
            boolean foundDifference = false;
            for (int i = 0; i < firstString.length(); i++) {
                if (firstString.charAt(i) != secondString.charAt(i)) {
                    if (foundDifference) {
                        return false;
                    }

                    foundDifference = true;
                }
            }

            return true;
        }

        /**
         * Check if you can insert a character into firstString to make secondString.
         */
        private static boolean oneEditInsert(String firstString, String secondString) {
            int firstIndex = 0;
            int secondIndex = 0;
            while (secondIndex < secondString.length() && firstIndex < firstString.length()) {
                if (firstString.charAt(firstIndex) != secondString.charAt(secondIndex)) {
                    if (firstIndex != secondIndex) {
                        return false;
                    }

                    secondIndex++;
                } else {
                    firstIndex++;
                    secondIndex++;
                }
            }

            return true;
        }

        /**
         * This function takes two strings and checks if they are one edit (or zero edits) away.
         */
        public static boolean oneEditAway(String firstString, String secondString) {
            if (firstString.length() == secondString.length()) {
                return oneEditReplace(firstString, secondString);
            } else if (firstString.length() + 1 == secondString.length()) {
                return oneEditInsert(firstString, secondString);
            } else if (firstString.length() - 1 == secondString.length()) {
                return oneEditInsert(secondString, firstString);
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
