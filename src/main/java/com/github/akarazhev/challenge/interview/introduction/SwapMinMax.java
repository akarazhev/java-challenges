package com.github.akarazhev.challenge.interview.introduction;

/**
 * Writing modular code means separating isolated chunks of code out into their own methods. This helps keep the code
 * more maintainable, readable, and testable.
 */
public final class SwapMinMax {

    public static int getMinIndex(final int[] array) {
        int minIndex = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[minIndex]) {
                minIndex = i;
            }
        }

        return minIndex;
    }

    public static int getMaxIndex(final int[] array) {
        int maxIndex = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] > array[maxIndex]) {
                maxIndex = i;
            }
        }

        return maxIndex;
    }

    public static void swap(final int[] array, final int m, final int n) {
        final int temp = array[m];
        array[m] = array[n];
        array[n] = temp;
    }

    public static void swapMinMaxBetter(final int[] array) {
        final int minIndex = getMinIndex(array);
        final int maxIndex = getMaxIndex(array);
        swap(array, minIndex, maxIndex);
    }

    public static void swapMinMax(final int[] array) {
        int minIndex = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[minIndex]) {
                minIndex = i;
            }
        }

        int maxIndex = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] > array[maxIndex]) {
                maxIndex = i;
            }
        }

        final int temp = array[minIndex];
        array[minIndex] = array[maxIndex];
        array[maxIndex] = temp;
    }
}
