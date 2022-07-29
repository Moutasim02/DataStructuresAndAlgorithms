package com.algorithms.recursion.basic_questions;

import java.util.Scanner;

/**
 * Print all numbers from N till 1 using recursion.
 *
 */
public class PrintAllNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        print(n);
    }


    public static void print(int n) {
        if (n >= 1) {
            System.out.print(n + " ");
            print(n - 1);
        }

  /* OR     if (n == 0) {
            return;
        }
        System.out.print(n);
        print(n - 1);
   */
    }
}
