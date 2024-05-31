package com.github.akarazhev.challenge.interview.introduction.bigo;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Example 18 Test")
public final class Example18Test {

    @Test
    @DisplayName("Test Fib")
    public void testFib() {
        assertEquals(0, Example18.fib(0));
        assertEquals(1, Example18.fib(1));
        assertEquals(1, Example18.fib(2));
        assertEquals(2, Example18.fib(3));
        assertEquals(3, Example18.fib(4));
        assertEquals(5, Example18.fib(5));
    }
}
