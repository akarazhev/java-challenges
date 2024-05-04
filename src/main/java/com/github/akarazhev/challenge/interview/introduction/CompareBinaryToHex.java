package com.github.akarazhev.challenge.interview.introduction;

public final class CompareBinaryToHex {

    private static int digitToValue(final char character) {
        if (character >= '0' && character <= '9') {
            return character - '0';
        } else if (character >= 'A' && character <= 'F') {
            return 10 + character - 'A';
        } else if (character >= 'a' && character <= 'f') {
            return 10 + character - 'a';
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
        final int n1 = convertFromBase(binary, 2);
        final int n2 = convertFromBase(hex, 16);
        if (n1 < 0 || n2 < 0) {
            return false;
        }

        return n1 == n2;
    }
}
