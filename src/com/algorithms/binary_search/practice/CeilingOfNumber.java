package com.algorithms.binary_search.practice;

public class CeilingOfNumber {
    public static void main(String[] args) {
        int[] arr = {-15, -13, -12, -7, 0, 1, 5, 6, 7, 77, 99, 234, 235, 743};
        int target = -12;
        int ans = ceiling(arr, target);
        System.out.println(ans); // 2
    }

    // return start if not found, smallest number that's >= to target
    static int ceiling(int[] arr, int target) {

        int start = 0;
        int end = arr.length - 1;

        // What if target is greater than the greatest number in the array?
        if (target > arr[end]) {
            return -1;
        }

        while (start <= end) {
            int middle = start + (end - start) / 2;
            if (target < arr[middle]) {
                end = middle - 1;
            } else if (target > arr[middle]) {
                start = middle + 1;
            } else {
                return middle;
            }
        }
        return start;
    }
}