package com.github.akarazhev.challenge.interview.introduction.bigo;

public final class Question12 {

    private static int binarySearch(final int[] a, final int x) {
        int low = 0;
        int high = a.length - 1;
        int mid;
        while (low <= high) {
            mid = (low + high) / 2;
            if (a[mid] < x) {
                low = mid + 1;
            } else if (a[mid] > x) {
                high = mid - 1;
            } else {
                return mid;
            }
        }

        return -1;
    }

    private static void mergesort(final int[] array) {
        int[] helper = new int[array.length];
        mergesort(array, helper, 0, array.length - 1);
    }

    private static void mergesort(final int[] array, final int[] helper, final int low, final int high) {
        if (low < high) {
            int middle = (low + high) / 2;
            mergesort(array, helper, low, middle); // Sort left half
            mergesort(array, helper, middle + 1, high); // Sort right half
            merge(array, helper, low, middle, high); // Merge them
        }
    }

    private static void merge(final int[] array, final int[] helper, final int low, final int middle, final int high) {
        /* Copy both halves into a helper array */
        for (int i = low; i <= high; i++) {
            helper[i] = array[i];
        }

        int helperLeft = low;
        int helperRight = middle + 1;
        int current = low;
        /* Iterate through helper array. Compare the left and right
         * half, copying back the smaller element from the two halves
         * into the original array. */
        while (helperLeft <= middle && helperRight <= high) {
            if (helper[helperLeft] <= helper[helperRight]) {
                array[current] = helper[helperLeft];
                helperLeft++;
            } else { // If right element is smaller than left element
                array[current] = helper[helperRight];
                helperRight++;
            }
            current++;
        }
        /* Copy the rest of the left side of the array into the
         * target array */
        int remaining = middle - helperLeft;
        for (int i = 0; i <= remaining; i++) {
            array[current + i] = helper[helperLeft + i];
        }
    }

    /**
     * The following code computes the intersection (the number of elements in common) of two arrays.
     * It assumes that neither array has duplicates. It computes the intersection by sorting one array (array b) and
     * then iterating through array a checking (via binary search) if each value is in b. What is its runtime?
     * O(b log b + a log b). First, we have to sort array b,which takes O(b log b) time.Then, for each element in a,
     * we do binary search in O(log b) time. The second part takes O(a log b) time.
     */
    public static int intersection(final int[] a, final int[] b) {
        mergesort(b);
        int intersect = 0;
        for (int x : a) {
            if (binarySearch(b, x) >= 0) {
                intersect++;
            }
        }

        return intersect;
    }
}
