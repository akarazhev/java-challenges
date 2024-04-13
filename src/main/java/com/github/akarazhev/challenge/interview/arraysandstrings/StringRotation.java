package com.github.akarazhev.challenge.interview.arraysandstrings;

/**
 * Provides <code>String Rotation</code> solutions.
 */
public class StringRotation {

    /**
     * This function takes two strings and checks if one word is a substring of another.
     *
     * @param s1 first string
     * @param s2 second string
     * @return the result of operation
     */
    public static boolean isRotation(String s1, String s2) {
        int len = s1.length();
        /* check that s1 and s2 are equal length and not empty */
        if (len == s2.length() && len > 0) {
            /* concatenate s1 and s1 within new buffer */
            String s1s1 = s1 + s1;
            return s1s1.contains(s2);
        }

        return false;
    }
}
