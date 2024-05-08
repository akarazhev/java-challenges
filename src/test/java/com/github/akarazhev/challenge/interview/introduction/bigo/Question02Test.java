package com.github.akarazhev.challenge.interview.introduction.bigo;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Question 02 Test")
public final class Question02Test {

    @Test
    @DisplayName("Test Power")
    public void testPower() {
        assertEquals(81, Question02.power(3, 4));
    }
}
