package com.algorithms.binary_search;

// Section 1
public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {-15, -13, -12, -7, 0, 1, 5, 6, 7, 77, 99, 234, 235, 743};
        int target = -12;
        int ans = binarySearch(arr, target);
        System.out.println(ans); // 2
    }

    // return index
    // return -1 if not exist
    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            // find the middle element
            int middle = start + (end - start) / 2; // This way we don't exceed int range.

            if (target < arr[middle]) {
                end = middle - 1;
            } else if (target > arr[middle]) {
                start = middle + 1;
            } else {
                return middle;
            }
        }
        return -1;
    }
}
