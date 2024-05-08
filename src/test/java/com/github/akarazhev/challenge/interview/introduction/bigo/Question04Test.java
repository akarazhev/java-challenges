package com.github.akarazhev.challenge.interview.introduction.bigo;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Question 04 Test")
public final class Question04Test {

    @Test
    @DisplayName("Test Div")
    public void testDiv() {
        assertEquals(3, Question04.div(12, 4));
    }
}
