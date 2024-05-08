package com.github.akarazhev.challenge.interview.introduction.bigo;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

@DisplayName("Example 15 Test")
public final class Example15Test {

    @Test
    @DisplayName("Test Factorial")
    public void testFactorial() {
        assertEquals(24, Example15.factorial(4));
    }
}
