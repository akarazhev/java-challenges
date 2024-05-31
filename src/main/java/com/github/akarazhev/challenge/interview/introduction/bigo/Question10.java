package com.github.akarazhev.challenge.interview.introduction.bigo;

public final class Question10 {

    /**
     * The following code sums the digits in a number. What is its big O time?
     * O(log n). The runtime will be the number of digits in the number. A number with d digits can have a value up to
     * 10^d. If n = 10^d, then d = log n. Therefore, the runtime is O(log n).
     */
    public static int sumDigits(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }

        return sum;
    }
}
