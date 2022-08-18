package com.algorithms.searching.binary_search;

// Section 2
public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {
//        int[] arr = {-15, -13, -12, -7, 0, 1, 5, 6, 7, 77, 99, 234, 235, 743};
        int[] arr = {99, 80 ,75, 22, 5, 0, -2, -15};
        int target = 5;
        int ans = orderAgnosticBS(arr, target); // works in both ascending and descending order
        System.out.println(ans); // 6th index
    }

    static int orderAgnosticBS(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        // find whether the array is sorted in ascending or descending
        boolean isAcc = arr[start] < arr[end];

        while (start <= end) {
            // find the middle element
            int middle = start + (end - start) / 2; // This way we don't exceed int range.

            if (arr[middle] == target) {
                return middle;
            }

            if (isAcc) {
                if (target < arr[middle]) {
                    end = middle - 1;
                } else {
                    start = middle + 1;
                }
            } else {
                if (target > arr[middle]) {
                    end = middle - 1;
                } else {
                    start = middle + 1;
                }
            }

        }
        return -1;
    }
}
