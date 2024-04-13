package com.github.akarazhev.challenge.interview.arraysandstrings;

/**
 * Provides <code>String Compression</code> solutions.
 */
public class StringCompression {

    /**
     * First solution
     */
    static class FirstSolution {

        /**
         * This function takes a string and performs basic string compression using the counts of repeated characters.
         *
         * @param s the string
         * @return the result of operation
         */
        public static String compress(String s) {
            String compressedString = "";
            int countConsecutive = 0;
            for (int i = 0; i < s.length(); i++) {
                countConsecutive++;

                /* If next character is different than current, append this char to result.*/
                if (i + 1 >= s.length() || s.charAt(i) != s.charAt(i + 1)) {
                    compressedString += "" + s.charAt(i) + countConsecutive;
                    countConsecutive = 0;
                }
            }

            return compressedString.length() < s.length() ? compressedString : s;
        }
    }

    /**
     * Second solution
     */
    static class SecondSolution {

        /**
         * This function takes a string and performs basic string compression using the counts of repeated characters.
         *
         * @param s the string
         * @return the result of operation
         */
        public static String compress(String s) {
            StringBuilder compressed = new StringBuilder();
            int countConsecutive = 0;
            for (int i = 0; i < s.length(); i++) {
                countConsecutive++;

                /* If next character is different than current, append this char to result.*/
                if (i + 1 >= s.length() || s.charAt(i) != s.charAt(i + 1)) {
                    compressed.append(s.charAt(i));
                    compressed.append(countConsecutive);
                    countConsecutive = 0;
                }
            }

            return compressed.length() < s.length() ? compressed.toString() : s;
        }
    }

    /**
     * Third solution
     */
    static class ThirdSolution {

        /**
         * This function takes a string and performs basic string compression using the counts of repeated characters.
         *
         * @param s the string
         * @return the result of operation
         */
        public static String compress(String s) {
            int finalLength = countCompression(s);
            if (finalLength >= s.length()) {
                return s;
            }

            StringBuilder compressed = new StringBuilder(finalLength); // initialize capacity
            int countConsecutive = 0;
            for (int i = 0; i < s.length(); i++) {
                countConsecutive++;

                /* If next character is different than current, append this char to result.*/
                if (i + 1 >= s.length() || s.charAt(i) != s.charAt(i + 1)) {
                    compressed.append(s.charAt(i));
                    compressed.append(countConsecutive);
                    countConsecutive = 0;
                }
            }

            return compressed.toString();
        }

        private static int countCompression(String s) {
            int compressedLength = 0;
            int countConsecutive = 0;
            for (int i = 0; i < s.length(); i++) {
                countConsecutive++;

                /* If next character is different than current, append this char to result.*/
                if (i + 1 >= s.length() || s.charAt(i) != s.charAt(i + 1)) {
                    compressedLength += 1 + String.valueOf(countConsecutive).length();
                    countConsecutive = 0;
                }
            }

            return compressedLength;
        }
    }
}
