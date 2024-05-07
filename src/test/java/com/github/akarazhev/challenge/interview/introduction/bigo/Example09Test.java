package com.github.akarazhev.challenge.interview.introduction.bigo;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Example 09 Test")
public final class Example09Test {

    @Test
    @DisplayName("Test Print Unordered Pairs")
    public void testPrintUnorderedPairs() {
        Example09.printUnorderedPairs(new int[]{0, 1, 2, 3}, new int[]{4, 5, 6});
    }
}
