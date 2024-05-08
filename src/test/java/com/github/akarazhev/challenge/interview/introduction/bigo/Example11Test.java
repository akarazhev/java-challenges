package com.github.akarazhev.challenge.interview.introduction.bigo;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Example 11 Test")
public final class Example11Test {

    @Test
    @DisplayName("Test Reverse")
    public void testReverse() {
        int[] array = {0, 1, 2, 3, 4, 5};
        Example11.reverse(array);
        for (int x : array) {
            System.out.println(x);
        }
    }
}
