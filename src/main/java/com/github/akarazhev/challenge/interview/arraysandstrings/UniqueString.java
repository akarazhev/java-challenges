package com.github.akarazhev.challenge.interview.arraysandstrings;

/**
 * Provides <code>Unique String</code> solution.
 */
public class UniqueString {

    /**
     * This function takes a string and evaluates if it's the unique or not.
     *
     * @param s the string
     * @return the result of operation
     */
    public static boolean isUnique(String s) {
        if (s.length() > 128) {
            return false;
        }

        boolean[] chars = new boolean[128];
        for (int i = 0; i < s.length(); i++) {
            byte c = (byte) s.charAt(i);
            if (chars[c]) {
                return false;
            }

            chars[c] = true;
        }

        return true;
    }

    /**
     * This function takes a string and evaluates if it's the unique or not without data structures.
     *
     * @param s the string
     * @return the result of operation
     */
    public static boolean isUniqueChars(String s) {
        if (s.length() > 26) {
            return false;
        }

        int checker = 0;
        for (int i = 0; i < s.length(); i++) {
            int val = s.charAt(i) - 'a';
            if ((checker & (1 << val)) > 0) {
                return false;
            }

            checker |= (1 << val);
        }

        return true;
    }
}
