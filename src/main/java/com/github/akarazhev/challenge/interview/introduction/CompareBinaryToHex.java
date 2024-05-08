package com.github.akarazhev.challenge.interview.introduction;

public final class CompareBinaryToHex {

    private static int digitToValue(final char c) {
        if (c >= '0' && c <= '9') {
            return c - '0';
        } else if (c >= 'A' && c <= 'F') {
            return 10 + c - 'A';
        } else if (c >= 'a' && c <= 'f') {
            return 10 + c - 'a';
        }

        return -1;
    }

    private static int convertFromBase(final String number, final int base) {
        if (base < 2 || (base > 10 && base != 16)) {
            return -1;
        }

        int exp, digit, value = 0;
        for (int i = number.length() - 1; i >= 0; i--) {
            digit = digitToValue(number.charAt(i));
            if (digit < 0 || digit >= base) {
                return -1;
            }

            exp = number.length() - 1 - i;
            value += (int) (digit * Math.pow(base, exp));
        }

        return value;
    }

    public static boolean compareBinToHex(final String binary, final String hex) {
        int n1 = convertFromBase(binary, 2);
        int n2 = convertFromBase(hex, 16);
        if (n1 < 0 || n2 < 0) {
            return false;
        }

        return n1 == n2;
    }
}
