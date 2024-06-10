package com.github.akarazhev.challenge.interview.introduction.bigo;

public final class Question11 {

    public static int numChars = 26;

    /**
     * The following code prints all strings of length k where the characters are in sorted order. It does this by
     * generating all strings of length k and then checking if each is sorted. What is its runtime?
     * O(kc^k), where k is the length of the string and c is the number of characters in the alphabet. It takes O(c^k)
     * time to generate each string. Then, we need to check that each of these is sorted, which takes O(k) time.
     */
    public static void printSortedStrings(final int remaining) {
        printSortedStrings(remaining, "");
    }

    private static void printSortedStrings(final int remaining, final String prefix) {
        if (remaining == 0) {
            if (isInOrder(prefix)) {
                System.out.println(prefix);
            }
        } else {
            for (int i = 0; i < numChars; i++) {
                char c = ithLetter(i);
                printSortedStrings(remaining - 1, prefix + c);
            }
        }
    }

    private static boolean isInOrder(final String s) {
        for (int i = 1; i < s.length(); i++) {
            int prev = ithLetter(s.charAt(i - 1));
            int curr = ithLetter(s.charAt(i));
            if (prev > curr) {
                return false;
            }
        }

        return true;
    }

    private static char ithLetter(final int i) {
        return (char) (((int) 'a') + i);
    }
}
