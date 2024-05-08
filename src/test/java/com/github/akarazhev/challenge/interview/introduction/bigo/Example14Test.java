package com.github.akarazhev.challenge.interview.introduction.bigo;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

@DisplayName("Example 14 Test")
public final class Example14Test {

    @Test
    @DisplayName("Test Is Prime")
    public void testIsPrime() {
        assertTrue(Example14.isPrime(2));
        assertTrue(Example14.isPrime(3));
        assertFalse(Example14.isPrime(4));
        assertTrue(Example14.isPrime(5));
        assertFalse(Example14.isPrime(6));
        assertTrue(Example14.isPrime(7));
        assertFalse(Example14.isPrime(8));
        assertFalse(Example14.isPrime(9));
        assertFalse(Example14.isPrime(10));
    }
}
