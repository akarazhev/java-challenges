package com.github.akarazhev.challenge.twopointers;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Provides tests for the <code>SortColors</code> solution.
 */
@DisplayName("Sort Colors Test")
public class SortColorsTest {

    @Test
    @DisplayName("Test Sort 3 colors")
    void testSort3Colors() {
        int[] colors = SortColors.sortColors(new int[]{0, 1, 0});
        assertEquals(0, colors[0]);
        assertEquals(0, colors[1]);
        assertEquals(1, colors[2]);
    }

    @Test
    @DisplayName("Test Sort 1 color")
    void testSort1Color() {
        assertEquals(1, SortColors.sortColors(new int[]{1})[0]);
    }

    @Test
    @DisplayName("Test Sort 2 colors")
    void testSort2Colors() {
        int[] colors = SortColors.sortColors(new int[]{2, 2});
        assertEquals(2, colors[0]);
        assertEquals(2, colors[1]);
    }

    @Test
    @DisplayName("Test Sort 4 colors")
    void testSort4Colors() {
        int[] colors = SortColors.sortColors(new int[]{1, 1, 0, 2});
        assertEquals(0, colors[0]);
        assertEquals(1, colors[1]);
        assertEquals(1, colors[2]);
        assertEquals(2, colors[3]);
    }

    @Test
    @DisplayName("Test Sort 5 colors")
    void testSort5Colors() {
        int[] colors = SortColors.sortColors(new int[]{2, 1, 1, 0, 0});
        assertEquals(0, colors[0]);
        assertEquals(0, colors[1]);
        assertEquals(1, colors[2]);
        assertEquals(1, colors[3]);
        assertEquals(2, colors[4]);
    }
}
