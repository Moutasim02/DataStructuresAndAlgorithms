package com.algorithms.searching.linear_search;

public class FindMinimumNumber {
    public static void main(String[] args) {
        int[] arr = {23, 46, 54, 11, 44, 66, 88, 34, -11, 23, -15};
        System.out.println(min(arr));
    }

    // assuming arr.length != 0, returning the minimum value
    static int min(int [] arr ){
        int ans = arr[0];

        for (int i = 1; i< arr.length; i++) {
            if (arr[i] < ans) {
                ans = arr[i];
            }
        }
        return ans;
    }
}
