package com.github.akarazhev.challenge.interview.introduction.bigo;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Question 09 Test")
public final class Question09Test {

    @Test
    @DisplayName("Test Copy Array")
    public void testCopyArray() {
        int[] copy = Question09.copyArray(new int[]{1, 2, 3, 4, 5, 6});
        assertEquals(1, copy[0]);
        assertEquals(2, copy[1]);
        assertEquals(3, copy[2]);
        assertEquals(4, copy[3]);
        assertEquals(5, copy[4]);
        assertEquals(6, copy[5]);
    }
}
