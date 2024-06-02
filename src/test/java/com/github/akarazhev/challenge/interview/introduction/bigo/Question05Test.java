package com.github.akarazhev.challenge.interview.introduction.bigo;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Question 05 Test")
public final class Question05Test {

    @Test
    @DisplayName("Test Sqrt")
    public void testSqrt() {
        assertEquals(-1, Question05.sqrt(26));
    }
}
