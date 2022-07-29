package com.algorithms.recursion.basic_questions;


public class ReverseNum {
    public static void main(String[] args) {
        System.out.println(reverse(1234));
    }

    public static int reverse(int n) {
        int digits = (int)(Math.log10(n)) + 1;
        return helper(n, digits);
    }

    public static int helper(int n, int digits) {
        if (n % 10 == n) {
            return n;
        }
        int remainder = n % 10;
        return remainder * (int)(Math.pow(10, digits - 1)) + helper(n / 10, digits - 1);
    }
}
