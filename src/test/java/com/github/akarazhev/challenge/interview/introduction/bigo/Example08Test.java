package com.github.akarazhev.challenge.interview.introduction.bigo;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Example 08 Test")
public final class Example08Test {

    @Test
    @DisplayName("Test Print Unordered Pairs")
    public void testPrintUnorderedPairs() {
        Example08.printUnorderedPairs(new int[]{0, 1, 2, 3});
    }
}
