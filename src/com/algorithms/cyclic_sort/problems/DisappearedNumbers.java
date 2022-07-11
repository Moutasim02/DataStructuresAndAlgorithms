package com.algorithms.cyclic_sort.problems;

import java.util.ArrayList;
import java.util.List;

public class DisappearedNumbers {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int expectedPosition = nums[i] - 1;
            if (nums[i] != nums[i]) {
                swap(nums, i, expectedPosition);
            } else {
                i++;
            }
        }

        List<Integer> ans = new ArrayList<>();
        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != index + 1) {
                ans.add(index + 1);
            }
        }
        return ans;
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
