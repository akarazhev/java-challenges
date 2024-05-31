package com.github.akarazhev.challenge.interview.introduction.bigo;

public final class Question09 {

    /**
     * The appendToNew method appends a value to an array by creating a new, longer array and returning this longer array.
     * You've used the appendToNew method to create a copyArray function that repeatedly calls appendToNew.
     * How long does copying an array take?
     * O(n^2), where n is the number of elements in the array. The first call to appendToNew takes 1 copy. The second
     * call takes 2 copies. The third call takes 3 copies. And so on. The total time will be the sum of 1 through n,
     * which is O(n^2).
     */
    public static int[] copyArray(final int[] array) {
        int[] copy = new int[0];
        for (int value : array) {
            copy = appendToNew(copy, value);
        }

        return copy;
    }

    private static int[] appendToNew(final int[] array, final int value) {
        // copy all elements over to new array
        int[] bigger = new int[array.length + 1];
        for (int i = 0; i < array.length; i++) {
            bigger[i] = array[i];
        }

        // add new element
        bigger[bigger.length - 1] = value;
        return bigger;
    }
}
