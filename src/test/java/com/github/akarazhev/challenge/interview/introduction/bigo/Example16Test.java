package com.github.akarazhev.challenge.interview.introduction.bigo;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

@DisplayName("Example 16 Test")
public final class Example16Test {

    @Test
    @DisplayName("Test Factorial")
    public void testFactorial() {
        assertEquals(24, Example16.factorial(4));
    }
}
