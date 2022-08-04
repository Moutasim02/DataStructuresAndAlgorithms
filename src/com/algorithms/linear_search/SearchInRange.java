package com.algorithms.linear_search;

import java.util.Arrays;

// Searching for n in range of indexes
public class SearchInRange {
    public static void main(String[] args) {
        int[] nums = {23, 46, 54, 11, 11, 66, 88, 34, -11, 23, -15};
        int target = 66;
        boolean answer = containsDuplicate(nums);
        System.out.println(answer);
    }

    public static boolean containsDuplicate(int[] nums) {
        // [1,2,3,1]
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == nums[i + 1]) {
                return true;
            }
        }

        return false;
    }
}
