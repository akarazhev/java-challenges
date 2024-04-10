package com.github.akarazhev.challenge.interview.arraysandstrings;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Provides tests for the <code>URLify</code> solution.
 */
@DisplayName("URLify Test")
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
