package com.github.akarazhev.challenge.interview.introduction.bigo;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Example 06 Test")
public final class Example06Test {

    @Test
    @DisplayName("Test Foo")
    public void testFoo() {
        Example06.foo(new int[]{1, 2, 5, 2, 2, 5, -1, 9, 3});
    }
}
