package com.github.akarazhev.challenge.interview.introduction.bigo;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Ex 01 Test")
public class Ex01Test {

    @Test
    @DisplayName("Check Sum")
    public void checkSum() {
        assertEquals(10, Ex01.sum(4));
    }
}
