package com.github.akarazhev.challenge.interview.arraysandstrings;

/**
 * Provides <code>URLify</code> solution.
 */
public class URLify {

    /**
     * This function replace all spaces in a string with '%20'.
     *
     * @param s          the string
     * @param trueLength the true length
     */
    public static void replaceSpaces(char[] s, int trueLength) {
        int spaces = 0, i;
        for (i = 0; i < trueLength; i++) {
            if (s[i] == ' ') {
                spaces++;
            }
        }

        if (trueLength < s.length) {
            s[trueLength] = '\0';
        }

        int index = trueLength + spaces * 2;
        for (i = trueLength - 1; i >= 0; i--) {
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