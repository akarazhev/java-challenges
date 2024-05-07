package com.github.akarazhev.challenge.interview.introduction.bigo;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Example 07 Test")
public final class Example07Test {

    @Test
    @DisplayName("Test Print Pairs")
    public void testPrintPairs() {
        Example07.printPairs(new int[]{0, 1, 2, 3});
    }
}
