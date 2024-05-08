package com.github.akarazhev.challenge.interview.introduction.bigo;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Question 12 Test")
public final class Question12Test {

    @Test
    @DisplayName("Test Intersection")
    public void testIntersection() {
        assertEquals(2, Question12.intersection(new int[]{1, 3, 5, 7}, new int[]{1, 9, 2, 7}));
    }
}
