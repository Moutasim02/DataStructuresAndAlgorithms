package com.algorithms.binary_search.practice;

public class InfiniteArray {
    // https://www.geeksforgeeks.org/find-position-element-sorted-array-infinite-numbers/
    public static void main (String[] args) {
        int[] arr = {3, 5, 7, 9, 10, 90,
                100, 130, 140, 160, 170};
        int target = 10;
        System.out.println(findingRange(arr, target));
    }

    static int findingRange(int[] arr, int target) {
        // Box size 2
        int start = 0;
        int end = 1;

        while (target > arr[end]) {
            // Change start position till after previous end by 1
            int temp = end + 1;
            // end = previous end + sizeOfBox * 2
            end = end + (end - start + 1) * 2; // first iteration will go to index 5
            start = temp;
        }
        return binarySearch(arr, target, start, end);
    }

    static int binarySearch(int[] arr, int target, int start, int end) {

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
