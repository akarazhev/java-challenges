package com.github.akarazhev.challenge.interview.introduction.bigo;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Example 01 Test")
public class Example01Test {

    @Test
    @DisplayName("Check Sum")
    public void checkSum() {
        assertEquals(10, Example01.sum(4));
    }
}
