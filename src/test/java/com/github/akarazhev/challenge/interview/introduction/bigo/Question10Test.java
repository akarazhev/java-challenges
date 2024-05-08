package com.github.akarazhev.challenge.interview.introduction.bigo;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Question 10 Test")
public final class Question10Test {

    @Test
    @DisplayName("Test Sum Digits")
    public void testSumDigits() {
        assertEquals(10, Question10.sumDigits(1252));
    }
}
