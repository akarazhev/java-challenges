package com.github.akarazhev.challenge.interview.introduction.bigo;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Example 01 Test")
public class Example01Test {

    @Test
    @DisplayName("Test Sum")
    public void testSum() {
        assertEquals(10, Example01.sum(4));
    }
}
