package com.github.akarazhev.challenge.fastandslowpointers;

/**
 * Provides <code>Happy Number</code> solution.
 */
public class HappyNumber {

    /**
     * This function takes a number and evaluates if it's the happy number or not.
     *
     * @param n the number.
     * @return the result of operation.
     */
    public static boolean isHappyNumber(int n) {
        int slow = n;
        int fast = SumOfSquaredDigits.sumOfSquaredDigits(n);
        while (fast != 1 && fast != slow) {
            slow = SumOfSquaredDigits.sumOfSquaredDigits(slow);
            fast = SumOfSquaredDigits.sumOfSquaredDigits(SumOfSquaredDigits.sumOfSquaredDigits(fast));
        }

        return fast == 1;
    }
}
