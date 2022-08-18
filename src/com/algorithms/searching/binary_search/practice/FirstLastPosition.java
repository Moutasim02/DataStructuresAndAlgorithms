package com.algorithms.searching.binary_search.practice;

public class FirstLastPosition {

    public int[] searchRange(int[] nums, int target) {
        int[] answer = {-1,-1};
        int start = search(nums, target, true);
        int end = search(nums, target, false);

        answer[0] = start;
        answer[1] = end;

        return answer;
    }

    // returns index value of target
    public int search(int[] nums, int target, boolean findStartIndex) {
        int start = 0;
        int end = nums.length - 1;
        int answer = -1; // potential answer

        while (start <= end) {
            int middle = start + (end - start) / 2;

            if (target > nums[middle]){
                start = middle + 1;
            } else if (target < nums[middle]) {
                end = middle - 1;
            } else {
                answer = middle;
                if (findStartIndex) {
                    end = middle - 1;
                } else {
                    start = middle + 1;
                }
            }
        }
        return answer;
    }
}
