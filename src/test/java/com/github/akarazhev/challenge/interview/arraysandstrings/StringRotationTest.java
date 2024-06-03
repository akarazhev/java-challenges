package com.github.akarazhev.challenge.interview.arraysandstrings;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Provides tests for the statement: Assume you have a method isSubstring which checks if one word is a substring of
 * another. Given two strings, sl and s2, write code to check if s2 is a rotation of sl using only one call to
 * isSubstring (e.g.,"waterbottle" is a rotation of"erbottlewat").
 */
@DisplayName("String Rotation Test")
public final class StringRotationTest {

    @Test
    @DisplayName("Test Is Rotation")
    void testIsRotation() {
        assertTrue(StringRotation.isRotation("apple", "pleap"));
        assertTrue(StringRotation.isRotation("waterbottle", "erbottlewat"));
        assertFalse(StringRotation.isRotation("camera", "macera"));
    }
}
