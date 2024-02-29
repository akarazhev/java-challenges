package com.github.akarazhev.challenge.twopointers;

/**
 * Provides <code>Valid Palindrome</code> solution.
 */
public class ValidPalindrome {

    /**
     * This function takes a string, s, as an input and determines whether or not it is a palindrome.
     *
     * @param s the string.
     * @return the result of operation.
     */
    public static boolean isPalindrome(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
                return false;
            }
        }

        return true;
    }
}
