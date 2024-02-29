package com.github.akarazhev.challenge.twopointers;

/**
 * Provides <code>Sort Colors</code> solution.
 */
public class SortColors {
    /**
     * This function takes an array of colors and sort it.
     *
     * @param colors the list of array.
     * @return the sorted array.
     */
    public static int[] sortColors(int[] colors) {
        int temp;
        int red = 0;
        int white = 0;
        int blue = colors.length - 1;
        while (white <= blue) {
            if (colors[white] == 0) {
                if (colors[red] != 0) {
                    temp = colors[white];
                    colors[white] = colors[red];
                    colors[red] = temp;
                }

                white++;
                red++;
            } else if (colors[white] == 1) {
                white++;
            } else {
                temp = colors[white];
                colors[white] = colors[blue];
                colors[blue] = temp;
                blue--;
            }
        }

        return colors;
    }
}
