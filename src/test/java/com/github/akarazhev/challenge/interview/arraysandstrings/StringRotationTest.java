package com.github.akarazhev.challenge.interview.arraysandstrings;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Provides tests for the <code>String Rotation</code> solutions.
 */
@DisplayName("String Rotation Test")
public class StringRotationTest {

    @Test
    @DisplayName("Test Is Rotation")
    void testIsRotation() {
        assertTrue(StringRotation.isRotation("apple", "pleap"));
        assertTrue(StringRotation.isRotation("waterbottle", "erbottlewat"));
        assertFalse(StringRotation.isRotation("camera", "macera"));
    }
}
