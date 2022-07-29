package com.algorithms.recursion.basic_questions;

import java.util.Scanner;

public class DigitSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(sum(n));
    }

    public static int sum(int n) {
        if (n == 0) {
            return 0;
        }
        int mod = n % 10;
        n /= 10;
        return mod + sum(n);

        /*or simply just return
            return (n%10) + sum(n/10)*/
    }
}

