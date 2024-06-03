package com.github.akarazhev.challenge.interview.introduction.bigo;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Example 11 Test")
public final class Example11Test {

    @Test
    @DisplayName("Test Reverse")
    public void testReverse() {
        int[] array = {0, 1, 2, 3, 4, 5};
        Example11.reverse(array);
        assertEquals(5, array[0]);
        assertEquals(4, array[1]);
        assertEquals(3, array[2]);
        assertEquals(2, array[3]);
        assertEquals(1, array[4]);
        assertEquals(0, array[5]);
    }
}
