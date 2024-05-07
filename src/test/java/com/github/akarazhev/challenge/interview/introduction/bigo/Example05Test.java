package com.github.akarazhev.challenge.interview.introduction.bigo;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Example 05 Test")
public final class Example05Test {

    @Test
    @DisplayName("Test F")
    public void testF() {
        assertEquals(2, Example05.f(1));
    }
}
