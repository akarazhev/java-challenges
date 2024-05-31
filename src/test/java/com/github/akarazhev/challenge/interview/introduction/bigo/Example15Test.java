package com.github.akarazhev.challenge.interview.introduction.bigo;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

@DisplayName("Example 15 Test")
public final class Example15Test {

    @Test
    @DisplayName("Test Is Prime")
    public void testIsPrime() {
        assertTrue(Example15.isPrime(2));
        assertTrue(Example15.isPrime(3));
        assertFalse(Example15.isPrime(4));
        assertTrue(Example15.isPrime(5));
        assertFalse(Example15.isPrime(6));
        assertTrue(Example15.isPrime(7));
        assertFalse(Example15.isPrime(8));
        assertFalse(Example15.isPrime(9));
        assertFalse(Example15.isPrime(10));
    }
}
