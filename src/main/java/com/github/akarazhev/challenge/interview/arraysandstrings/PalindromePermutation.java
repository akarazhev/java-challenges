package com.github.akarazhev.challenge.interview.arraysandstrings;

/**
 * Provides <code>Palindrome Permutation</code> solutions.
 */
public class PalindromePermutation {

    private static class Common {

        private static int getCharNumber(Character c) {
            int a = Character.getNumericValue('a');
            int z = Character.getNumericValue('z');

            int val = Character.getNumericValue(c);
            if (a <= val && val <= z) {
                return val - a;
            }

            return -1;
        }

        private static int[] buildCharFrequencyTable(String p) {
            int[] table = new int[Character.getNumericValue('z') - Character.getNumericValue('a') + 1];
            for (char c : p.toCharArray()) {
                int x = getCharNumber(c);
                if (x != -1) {
                    table[x]++;
                }
            }

            return table;
        }
    }

    /**
     * First solution
     */
    static class FirstSolution {

        private static boolean checkMaxOneOdd(int[] t) {
            boolean foundOdd = false;
            for (int count : t) {
                if (count % 2 == 1) {
                    if (foundOdd) {
                        return false;
                    }

                    foundOdd = true;
                }
            }
            return true;
        }

        /**
         * This function takes a string and check if it is a permutation of a palindrome.
         *
         * @param p the phrase
         * @return the result of operation
         */
        public static boolean isPermutation(String p) {
            int[] table = Common.buildCharFrequencyTable(p);
            return checkMaxOneOdd(table);
        }
    }

    /**
     * Second solution
     */
    static class SecondSolution {

        /**
         * This function takes a string and check if it is a permutation of a palindrome.
         *
         * @param p the phrase
         * @return the result of operation
         */
        public static boolean isPermutation(String p) {
            int countOdd = 0, x;
            int[] table = new int[Character.getNumericValue('z') - Character.getNumericValue('a') + 1];
            for (char c : p.toCharArray()) {
                x = Common.getCharNumber(c);
                if (x != -1) {
                    table[x]++;

                    if (table[x] % 2 == 1) {
                        countOdd++;
                    } else {
                        countOdd--;
                    }
                }
            }

            return countOdd <= 1;
        }
    }

    static class ThirdSolution {

        /* Toggle the ith bit in the integer. */
        private static int toggle(int v, int i) {
            if (i < 0) {
                return v;
            }

            int mask = 1 << i;
            if ((v & mask) == 0) {
                v |= mask;
            } else {
                v &= ~mask;
            }

            return v;
        }

        /* Create bit vector for string. For each letter with value i,
         * toggle the ith bit. */
        private static int createBitVector(String p) {
            int v = 0;
            for (char c : p.toCharArray()) {
                int x = Common.getCharNumber(c);
                v = toggle(v, x);
            }

            return v;
        }

        /* Check that at most one bit is set by subtracting one from the
         * integer and ANDing it with the original integer. */
        private static boolean checkAtMostOneBitSet(int v) {
            return (v & (v - 1)) == 0;
        }

        /**
         * This function takes a string and check if it is a permutation of a palindrome.
         *
         * @param p the phrase
         * @return the result of operation
         */
        public static boolean isPermutation(String p) {
            int v = createBitVector(p);
            return checkAtMostOneBitSet(v);
        }
    }
}
