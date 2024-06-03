package com.github.akarazhev.challenge.interview.arraysandstrings;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Provides tests for the statement: There are three types of edits that can be performed on strings: insert a character,
 * remove a character, or replace a character. Given two strings, write a function to check if they are one edit
 * (or zero edits) away.
 */
@DisplayName("One Away String Test")
public final class OneAwayTest {

    @Test
    @DisplayName("Test First Solution")
    void testFirstSolution() {
        assertTrue(OneAway.FirstSolution.oneEditAway("a", "b"));
        assertTrue(OneAway.FirstSolution.oneEditAway("", "d"));
        assertTrue(OneAway.FirstSolution.oneEditAway("d", "de"));
        assertFalse(OneAway.FirstSolution.oneEditAway("pale", "pse"));
        assertTrue(OneAway.FirstSolution.oneEditAway("acdsfdsfadsf", "acdsgdsfadsf"));
        assertTrue(OneAway.FirstSolution.oneEditAway("acdsfdsfadsf", "acdsfdfadsf"));
        assertTrue(OneAway.FirstSolution.oneEditAway("acdsfdsfadsf", "acdsfdsfads"));
        assertTrue(OneAway.FirstSolution.oneEditAway("acdsfdsfadsf", "cdsfdsfadsf"));
        assertFalse(OneAway.FirstSolution.oneEditAway("adfdsfadsf", "acdfdsfdsf"));
        assertFalse(OneAway.FirstSolution.oneEditAway("adfdsfadsf", "bdfdsfadsg"));
        assertFalse(OneAway.FirstSolution.oneEditAway("adfdsfadsf", "affdsfads"));
        assertTrue(OneAway.FirstSolution.oneEditAway("pale", "pkle"));
        assertFalse(OneAway.FirstSolution.oneEditAway("pkle", "pable"));
        assertTrue(OneAway.FirstSolution.oneEditAway("palee", "pale"));
    }

    @Test
    @DisplayName("Test Second Solution")
    void testSecondSolution() {
        assertTrue(OneAway.SecondSolution.oneEditAway("a", "b"));
        assertTrue(OneAway.SecondSolution.oneEditAway("", "d"));
        assertTrue(OneAway.SecondSolution.oneEditAway("d", "de"));
        assertFalse(OneAway.SecondSolution.oneEditAway("pale", "pse"));
        assertTrue(OneAway.SecondSolution.oneEditAway("acdsfdsfadsf", "acdsgdsfadsf"));
        assertTrue(OneAway.SecondSolution.oneEditAway("acdsfdsfadsf", "acdsfdfadsf"));
        assertTrue(OneAway.SecondSolution.oneEditAway("acdsfdsfadsf", "acdsfdsfads"));
        assertTrue(OneAway.SecondSolution.oneEditAway("acdsfdsfadsf", "cdsfdsfadsf"));
        assertFalse(OneAway.SecondSolution.oneEditAway("adfdsfadsf", "acdfdsfdsf"));
        assertFalse(OneAway.SecondSolution.oneEditAway("adfdsfadsf", "bdfdsfadsg"));
        assertFalse(OneAway.SecondSolution.oneEditAway("adfdsfadsf", "affdsfads"));
        assertTrue(OneAway.SecondSolution.oneEditAway("pale", "pkle"));
        assertFalse(OneAway.SecondSolution.oneEditAway("pkle", "pable"));
        assertTrue(OneAway.SecondSolution.oneEditAway("palee", "pale"));
    }
}
