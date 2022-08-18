package com.algorithms.sorting.cyclic_sort.problems;

public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {4, 0, 2, 1}; // 3 is missing
        System.out.println(missingNumber(arr));
    }
// https://leetcode.com/problems/missing-number/

    public static int missingNumber(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int expectedPosition = nums[i];
            if (nums[i] < nums.length && nums[i] != nums[expectedPosition]) {
                swap(nums, i, expectedPosition);
            } else {
                i++;
            }
        }

        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != index) {
                return index;
            }
        }
        // NOT IN ARRAY
        return nums.length;
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
