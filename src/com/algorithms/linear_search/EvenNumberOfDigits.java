package com.algorithms.linear_search;

public class EvenNumberOfDigits {

    // This solution is slow, we can use (return (int)(Math.log10(num)) + 1) instead
    public static void main(String[] args) {
        int[] arr = {1,4,65,23,12};
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println("\nEven number of digits in the array: " + findNumbers(arr));
    }

    private static int findNumbers(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (String.valueOf(num).length() % 2 == 0) {
                count++;
            }
        }
        return count;
    }
}
