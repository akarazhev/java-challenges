package com.github.akarazhev.challenge.interview.arraysandstrings;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Provides tests for the statement:
 * Write a method to replace all spaces in a string with '%20'. You may assume that the string has sufficient space at
 * the end to hold the additional characters,and that you are given the "true" length of the string.
 * (Note: Please use a character array so that you can perform this operation in place.)
 */
@DisplayName("URLify String Test")
public class URLifyTest {

    @Test
    @DisplayName("Test Replace Spaces")
    void testReplaceSpaces() {
        char[] string = "Mr John Smith    ".toCharArray();
        URLify.replaceSpaces(string, findLastCharacter(string) + 1);
        assertEquals("Mr%20John%20Smith", String.valueOf(string));
    }

    private static int findLastCharacter(char[] str) {
        for (int i = str.length - 1; i >= 0; i--) {
            if (str[i] != ' ') {
                return i;
            }
        }

        return -1;
    }
}
