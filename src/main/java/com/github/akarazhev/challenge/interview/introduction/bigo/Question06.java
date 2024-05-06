package com.github.akarazhev.challenge.interview.introduction.bigo;

public class Question06 {

    public static int sqrt(int n) {
        for (int guess = 1; guess * guess <= n; guess++) {
            if (guess * guess == n) {
                return guess;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(sqrt(26));
    }
}
