package com.algorithms.recursion.basics;

// fibonacci(n) = fibonacci(n-1) + fibonacci(n-2)    ->   Recurrence relation (formula)
public class FibonacciNumber {
    public static void main(String[] args) {
        System.out.println(fibonacci(50));
    }

    private static int fibonacci(int n) {
        // base condition
        if (n < 2) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
