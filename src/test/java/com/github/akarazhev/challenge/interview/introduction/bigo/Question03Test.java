package com.github.akarazhev.challenge.interview.introduction.bigo;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Question 03 Test")
public final class Question03Test {

    @Test
    @DisplayName("Test Mod")
    public void testMod() {
        assertEquals(3, Question03.mod(3, 6));
    }
}
