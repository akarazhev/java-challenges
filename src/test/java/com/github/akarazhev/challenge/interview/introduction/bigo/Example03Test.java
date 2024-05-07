package com.github.akarazhev.challenge.interview.introduction.bigo;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Example 03 Test")
public class Example03Test {

    @Test
    @DisplayName("Test Min And Max 1")
    public void testMinAndMax1() {
        Example03.minAndMax1(new int[]{1, 2, 5, 2, 2, 5, -1, 9, 3});
    }

    @Test
    @DisplayName("Test Min And Max 2")
    public void testMinAndMax2() {
        Example03.minAndMax2(new int[]{1, 2, 5, 2, 2, 5, -1, 9, 3});
    }
}
