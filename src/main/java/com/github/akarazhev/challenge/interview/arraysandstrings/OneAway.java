package com.github.akarazhev.challenge.interview.arraysandstrings;

/**
 * Provides <code>One Away</code> solutions.
 */
public class OneAway {

    /**
     * First solution
     */
    static class FirstSolution {

        private static boolean oneEditReplace(String s1, String s2) {
            boolean foundDifference = false;
            for (int i = 0; i < s1.length(); i++) {
                if (s1.charAt(i) != s2.charAt(i)) {
                    if (foundDifference) {
                        return false;
                    }

                    foundDifference = true;
                }
            }

            return true;
        }

        /* Check if you can insert a character into s1 to make s2. */
        private static boolean oneEditInsert(String s1, String s2) {
            int index1 = 0;
            int index2 = 0;
            while (index2 < s2.length() && index1 < s1.length()) {
                if (s1.charAt(index1) != s2.charAt(index2)) {
                    if (index1 != index2) {
                        return false;
                    }

                    index2++;
                } else {
                    index1++;
                    index2++;
                }
            }

            return true;
        }

        /**
         * This function takes two strings and checks if they are one edit (or zero edits) away.
         *
         * @param f the first string
         * @param s the second string
         * @return the result of operation
         */
        public static boolean oneEditAway(String f, String s) {
            if (f.length() == s.length()) {
                return oneEditReplace(f, s);
            } else if (f.length() + 1 == s.length()) {
                return oneEditInsert(f, s);
            } else if (f.length() - 1 == s.length()) {
                return oneEditInsert(s, f);
            }

            return false;
        }
    }

    /**
     * Second solution
     */
    static class SecondSolution {

        /**
         * This function takes two strings and checks if they are one edit (or zero edits) away.
         *
         * @param f the first string
         * @param s the second string
         * @return the result of operation
         */
        public static boolean oneEditAway(String f, String s) {
            /* Length checks. */
            if (Math.abs(f.length() - s.length()) > 1) {
                return false;
            }

            /* Get shorter and longer string.*/
            String s1 = f.length() < s.length() ? f : s;
            String s2 = f.length() < s.length() ? s : f;

            int index1 = 0;
            int index2 = 0;
            boolean foundDifference = false;
            while (index2 < s2.length() && index1 < s1.length()) {
                if (s1.charAt(index1) != s2.charAt(index2)) {
                    /* Ensure that this is the first difference found.*/
                    if (foundDifference) {
                        return false;
                    }

                    foundDifference = true;
                    if (s1.length() == s2.length()) { // On replace, move shorter pointer
                        index1++;
                    }
                } else {
                    index1++; // If matching, move shorter pointer
                }

                index2++; // Always move pointer for longer string
            }

            return true;
        }
    }
}
