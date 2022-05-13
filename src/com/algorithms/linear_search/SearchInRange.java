package com.algorithms.linear_search;

// Searching for n in range of indexes
public class SearchInRange {
    public static void main(String[] args) {
        int[] nums = {23, 46, 54, 11, 44, 66, 88, 34, -11, 23, -15};
        int target = 66;
        int answer =  linearSearch(nums, target, 3, 5);
        System.out.println(answer);
    }

    static int linearSearch(int[] arr, int target, int start, int end ) {
        if (arr.length == 0) {
            return -1;
        }

        for (int i = 0; i <= end; i++) {
            int element = arr[i];
            if (element == target) {
                return i;
            }
        }
        return -1;
    }
}
