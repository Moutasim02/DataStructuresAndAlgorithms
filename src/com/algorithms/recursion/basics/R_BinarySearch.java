package com.algorithms.recursion.basics;

public class R_BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 5, 76, 77, 87, 88, 97};
        int target = 4;
        System.out.println(search(arr, target, 0, arr.length - 1));
    }

    private static int search(int[] arr, int target, int start, int end) {
        if (start > end) {
            return -1;
        }
        int middle = start + (end - start) / 2;
        if (arr[middle] == target) {
            return middle;
        }
        if (target < arr[middle]) {
            return search(arr, target, start, middle - 1);
        }
        return search(arr, target, middle + 1, end);
    }
}
