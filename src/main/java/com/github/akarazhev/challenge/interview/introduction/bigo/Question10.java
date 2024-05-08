package com.github.akarazhev.challenge.interview.introduction.bigo;

public final class Question10 {

    public static int sumDigits(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }

        return sum;
    }
}
