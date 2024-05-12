package com.github.akarazhev.challenge.interview.arraysandstrings;

/**
 * Statement: Implement a method to perform basic string compression using the counts of repeated characters.
 * For example, the string aabcccccaaa would become a2blc5a3. If the "compressed" string would not become smaller than
 * the original string, your method should return the original string. You can assume the string has only uppercase and
 * lowercase letters (a - z).
 */
public final class StringCompression {

    /**
     * First solution
     */
    static final class FirstSolution {

        /**
         * This function takes a string and performs basic string compression using the counts of repeated characters.
         */
        public static String compress(final String str) {
            String compressedString = "";
            int countConsecutive = 0;
            for (int i = 0; i < str.length(); i++) {
                countConsecutive++;

                /* If next character is different from current, append this char to result.*/
                if (i + 1 >= str.length() || str.charAt(i) != str.charAt(i + 1)) {
                    compressedString += "" + str.charAt(i) + countConsecutive;
                    countConsecutive = 0;
                }
            }

            return compressedString.length() < str.length() ? compressedString : str;
        }
    }

    /**
     * Second solution
     */
    static final class SecondSolution {

        /**
         * This function takes a string and performs basic string compression using the counts of repeated characters.
         */
        public static String compress(final String str) {
            StringBuilder compressed = new StringBuilder();
            int countConsecutive = 0;
            for (int i = 0; i < str.length(); i++) {
                countConsecutive++;

                /* If next character is different from current, append this char to result.*/
                if (i + 1 >= str.length() || str.charAt(i) != str.charAt(i + 1)) {
                    compressed.append(str.charAt(i));
                    compressed.append(countConsecutive);
                    countConsecutive = 0;
                }
            }

            return compressed.length() < str.length() ? compressed.toString() : str;
        }
    }

    /**
     * Third solution
     */
    static class ThirdSolution {

        /**
         * This function takes a string and performs basic string compression using the counts of repeated characters.
         */
        public static String compress(String string) {
            int finalLength = countCompression(string);
            if (finalLength >= string.length()) {
                return string;
            }

            StringBuilder compressed = new StringBuilder(finalLength); // initialize capacity
            int countConsecutive = 0;
            for (int i = 0; i < string.length(); i++) {
                countConsecutive++;

                /* If next character is different from current, append this char to result.*/
                if (i + 1 >= string.length() || string.charAt(i) != string.charAt(i + 1)) {
                    compressed.append(string.charAt(i));
                    compressed.append(countConsecutive);
                    countConsecutive = 0;
                }
            }

            return compressed.toString();
        }

        private static int countCompression(String string) {
            int compressedLength = 0;
            int countConsecutive = 0;
            for (int i = 0; i < string.length(); i++) {
                countConsecutive++;

                /* If next character is different from current, append this char to result.*/
                if (i + 1 >= string.length() || string.charAt(i) != string.charAt(i + 1)) {
                    compressedLength += 1 + String.valueOf(countConsecutive).length();
                    countConsecutive = 0;
                }
            }

            return compressedLength;
        }
    }
}
