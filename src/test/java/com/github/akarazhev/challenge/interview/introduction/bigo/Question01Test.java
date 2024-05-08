package com.github.akarazhev.challenge.interview.introduction.bigo;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Question 01 Test")
public final class Question01Test {

    @Test
    @DisplayName("Test Product")
    public void testProduct() {
        assertEquals(30, Question01.product(5, 6));
    }
}
