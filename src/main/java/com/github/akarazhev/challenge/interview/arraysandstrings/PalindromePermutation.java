package com.github.akarazhev.challenge.interview.arraysandstrings;

/**
 * Statement: Given a string, write a function to check if it is a permutation of a palindrome. A palindrome is a word
 * or phrase that is the same forwards and backwards. A permutation is a rearrangement of letters. The palindrome
 * does not need to be limited to just dictionary words.
 * <p>
 * EXAMPLE
 * Input: Tact Coa
 * Output: True (permutations: "taco cat", "atco eta", etc.)
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

        private static int[] buildCharFrequencyTable(String phrase) {
            int x;
            int[] table = new int[Character.getNumericValue('z') - Character.getNumericValue('a') + 1];
            for (char c : phrase.toCharArray()) {
                x = getCharNumber(c);
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

        private static boolean checkMaxOneOdd(int[] table) {
            boolean foundOdd = false;
            for (int count : table) {
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
         */
        public static boolean isPermutation(String phrase) {
            int[] table = Common.buildCharFrequencyTable(phrase);
            return checkMaxOneOdd(table);
        }
    }

    /**
     * Second solution
     */
    static class SecondSolution {

        /**
         * This function takes a string and check if it is a permutation of a palindrome.
         */
        public static boolean isPermutation(String phrase) {
            int countOdd = 0, x;
            int[] table = new int[Character.getNumericValue('z') - Character.getNumericValue('a') + 1];
            for (char c : phrase.toCharArray()) {
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

    /**
     * Third solution
     */
    static class ThirdSolution {

        /**
         * Toggle the ith bit in the integer.
         */
        private static int toggle(int bitVector, int index) {
            if (index < 0) {
                return bitVector;
            }

            int mask = 1 << index;
            if ((bitVector & mask) == 0) {
                bitVector |= mask;
            } else {
                bitVector &= ~mask;
            }

            return bitVector;
        }

        /**
         * Create bit vector for string. For each letter with value i, toggle the ith bit.
         */
        private static int createBitVector(String phrase) {
            int x, bitVector = 0;
            for (char c : phrase.toCharArray()) {
                x = Common.getCharNumber(c);
                bitVector = toggle(bitVector, x);
            }

            return bitVector;
        }

        /**
         * Check that at most one bit is set by subtracting one from the integer and ANDing it with the original integer.
         */
        private static boolean checkAtMostOneBitSet(int bitVector) {
            return (bitVector & (bitVector - 1)) == 0;
        }

        /**
         * This function takes a string and check if it is a permutation of a palindrome.
         */
        public static boolean isPermutation(String phrase) {
            int bitVector = createBitVector(phrase);
            return checkAtMostOneBitSet(bitVector);
        }
    }
}
