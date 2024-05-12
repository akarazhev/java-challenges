package com.github.akarazhev.challenge.interview.arraysandstrings;

/**
 * Statement: Assume you have a method isSubstring which checks if one word is a substring of another.
 * Given two strings, sl and s2, write code to check if s2 is a rotation of sl using only one call to isSubstring
 * (e.g.,"waterbottle" is a rotation of"erbottlewat").
 */
public final class StringRotation {

    /**
     * This function takes two strings and checks if one word is a substring of another.
     */
    public static boolean isRotation(final String s1, final String s2) {
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
