# Technical Questions

## Appropriate Code Reuse

Suppose you were asked to write a function to check if the value of a binary number (passed as a string) equals the 
hexadecimal representation of a string.

An elegant implementation of this problem leverages code reuse.

```java
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
```

## Modular

Writing modular code means separating isolated chunks of code out into their own methods. This helps keep the code more 
maintainable, readable, and testable.

```java
public final class SwapMinMax {

    public static int getMinIndex(final int[] array) {
        int minIndex = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[minIndex]) {
                minIndex = i;
            }
        }

        return minIndex;
    }

    public static int getMaxIndex(final int[] array) {
        int maxIndex = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] > array[maxIndex]) {
                maxIndex = i;
            }
        }

        return maxIndex;
    }

    public static void swap(final int[] array, final int m, final int n) {
        final int temp = array[m];
        array[m] = array[n];
        array[n] = temp;
    }

    public static void swapMinMaxBetter(final int[] array) {
        final int minIndex = getMinIndex(array);
        final int maxIndex = getMaxIndex(array);
        swap(array, minIndex, maxIndex);
    }

    public static void swapMinMax(final int[] array) {
        int minIndex = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[minIndex]) {
                minIndex = i;
            }
        }

        int maxIndex = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] > array[maxIndex]) {
                maxIndex = i;
            }
        }

        final int temp = array[minIndex];
        array[minIndex] = array[maxIndex];
        array[maxIndex] = temp;
    }
}
```

<hr>

Go to [README](../../README.md "README.me")