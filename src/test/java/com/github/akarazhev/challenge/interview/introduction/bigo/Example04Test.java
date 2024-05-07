package com.github.akarazhev.challenge.interview.introduction.bigo;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Example 04 Test")
public final class Example04Test {

    @Test
    @DisplayName("Test Foo")
    public void testFoo() {
        Example04.foo(new int[]{1, 2, 5, 2, 2, 5, -1, 9, 3}, new int[]{5, 2, 1, 0, 2});
    }

    @Test
    @DisplayName("Test Bar")
    public void testBar() {
        Example04.bar(new int[]{1, 2, 5, 2, 2, 5, -1, 9, 3}, new int[]{5, 2, 1, 0, 2});
    }
}
