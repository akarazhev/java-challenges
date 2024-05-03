package com.github.akarazhev.challenge.interview.util;

public final class BitVector {
    private static final int DATA_SIZE = 32;
    private final int length;
    private final int[] vector;

    public BitVector(final int length) {
        this.length = length;
        if (length % DATA_SIZE == 0) {
            vector = new int[length / DATA_SIZE];
        } else {
            vector = new int[length / DATA_SIZE + 1];
        }
    }

    public int length() {
        return length;
    }

    public boolean get(final int index) {
        int bit = vector[index / DATA_SIZE];
        int bit_index = index % DATA_SIZE;
        return ((bit >> bit_index) & 1) == 1;
    }

    public void print() {
        for (final int k : vector) {
            for (int i = 0; i < DATA_SIZE; i++) {
                if ((k >> i & 1) == 1) {
                    System.out.print(1);
                } else {
                    System.out.print(0);
                }
            }

            System.out.println();
        }
    }

    public void set(final int index, final boolean flag) {
        if (index >= 0 && index < length) {
            int mask = ~(1 << index);
            int bit = vector[index / DATA_SIZE] & mask;
            if (flag) {
                vector[index / DATA_SIZE] = bit | (1 << index);
            } else {
                vector[index / DATA_SIZE] = bit;
            }
        }
    }
}
