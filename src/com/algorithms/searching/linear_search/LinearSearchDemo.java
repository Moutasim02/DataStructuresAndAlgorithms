package com.algorithms.searching.linear_search;

public class LinearSearchDemo {
    public static void main(String[] args) {
        int[] nums = {23, 46, 54, 11, 44, 66, 88, 34, -11, 23, -15};
        int target = 66;
        int answer =  linearSearch(nums, target);
        System.out.println(answer);

    }
    // search in the array: return the index value if item found
    // otherwise if item not found return -1
    static int linearSearch(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }

        for (int i = 0; i < arr.length; i++) {
            int element = arr[i];
            if (element == target) {
                return i;
            }
        }
        return -1;
    }
}

