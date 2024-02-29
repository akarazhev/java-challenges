package com.github.akarazhev.challenge.fastandslowpointers;

/**
 * Help class for the sum of squared digits.
 */
public class SumOfSquaredDigits {

    /**
     * Helper function that calculates the sum of squared digits.
     *
     * @param number the number to be calculated.
     * @return the sum of squared digits.
     */
    public static int sumOfSquaredDigits(int number) {
        int sum = 0;
        while (number > 0) {
            int digit = number % 10;
            sum += Math.pow(digit, 2);
            number = number / 10;
        }

        return sum;
    }
}
