package com.github.akarazhev.challenge.interview.arraysandstrings;

/**
 * Provides <code>URLify</code> solution.
 */
public class URLify {

    /**
     * This function replace all spaces in a string with '%20'.
     *
     * @param s the string
     * @param l the true length
     */
    public static void replaceSpaces(char[] s, int l) {
        int spaceCount = 0, i;
        for (i = 0; i < l; i++) {
            if (s[i] == ' ') {
                spaceCount++;
            }
        }

        if (l < s.length) {
            s[l] = '\0';
        }

        int index = l + spaceCount * 2;
        for (i = l - 1; i >= 0; i--) {
            if (s[i] == ' ') {
                s[index - 1] = '0';
                s[index - 2] = '2';
                s[index - 3] = '%';
                index = index - 3;
            } else {
                s[index - 1] = s[i];
                index--;
            }
        }
    }
}