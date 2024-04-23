package com.github.akarazhev.challenge.interview.arraysandstrings;

/**
 * Statement: Implement an algorithm to determine if a string has all unique characters.
 * What if you cannot use additional data structures?
 */
public class IsUnique {

    /**
     * First solution
     */
    static class FirstSolution {

        /**
         * This function takes a string and evaluates if it's the unique or not.
         */
        public static boolean isUniqueChars(String string) {
            if (string.length() > 128) {
                return false;
            }

            int val;
            boolean[] charSet = new boolean[128];
            for (int i = 0; i < string.length(); i++) {
                val = string.charAt(i);
                if (charSet[val]) {
                    return false;
                }

                charSet[val] = true;
            }

            return true;
        }
    }

    /**
     * Second solution
     */
    static class SecondSolution {

        /**
         * This function takes a string and evaluates if it's the unique or not. Assumes only letters a through z.
         */
        public static boolean isUniqueChars(String string) {
            if (string.length() > 26) { // Only 26 characters
                return false;
            }

            int val;
            int checker = 0;
            for (int i = 0; i < string.length(); i++) {
                val = string.charAt(i) - 'a';
                if ((checker & (1 << val)) > 0) {
                    return false;
                }

                checker |= (1 << val);
            }

            return true;
        }
    }
}
