package com.github.akarazhev.challenge.interview.arraysandstrings;

/**
 * Statement: Write a method to replace all spaces in a string with '%20'. You may assume that the string has sufficient
 * space at the end to hold the additional characters,and that you are given the "true" length of the string.
 * (Note: Please use a character array so that you can perform this operation in place.)
 * <p>
 * EXAMPLE
 * Input:   "Mr John Smith    ", 13
 * Output:  "Mr$20John%20Smith"
 */
public final class URLify {

    /**
     * This function replaces all spaces in a string with '%20'. Assume string has sufficient free space at the end.
     */
    public static void replaceSpaces(final char[] str, final int trueLength) {
        int spaceCount = 0, i;
        for (i = 0; i < trueLength; i++) {
            if (str[i] == ' ') {
                spaceCount++;
            }
        }

        if (trueLength < str.length) {
            str[trueLength] = '\0';
        }

        int index = trueLength + spaceCount * 2;
        for (i = trueLength - 1; i >= 0; i--) {
            if (str[i] == ' ') {
                str[index - 1] = '0';
                str[index - 2] = '2';
                str[index - 3] = '%';
                index = index - 3;
            } else {
                str[index - 1] = str[i];
                index--;
            }
        }
    }
}