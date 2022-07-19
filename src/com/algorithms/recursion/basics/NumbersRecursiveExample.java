package com.algorithms.recursion.basics;

public class NumbersRecursiveExample {
    public static void main(String[] args) {
        // write a function that takes in a number and prints it
        // print first 5 numbers: 1 2 3 4 5

        print(1);
    }

    private static void print(int n) {
        // Base condition in recursion
        if (n == 5000) {
            System.out.println(n);
            return;
        }
        System.out.println(n);
        print(n + 1);
    }
}
