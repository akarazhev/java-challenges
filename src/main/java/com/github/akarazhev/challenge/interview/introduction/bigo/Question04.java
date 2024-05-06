package com.github.akarazhev.challenge.interview.introduction.bigo;

public class Question04 {

    public static int div(int a, int b) {
        int count = 0;
        int sum = b;
        while (sum <= a) {
            sum += b;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(div(12, 4));
    }
}
