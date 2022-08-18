package com.algorithms.searching.linear_search;

import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int [][] arr = {
                {23, 4, 1},
                {18, 12, 3, 9},
                {78, 99, 34, 56},
                {18, 12}
        };
        int target = 34;
        int[] min = minimum(arr, target);
        int max = maximum(arr);
        System.out.println(Arrays.toString(min));
        System.out.println(max);
    }

    static int[] minimum(int[][] arr, int target) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == target) {
                    return new int[]{row, col};
                }
            }
        }
        return new int[]{-1};
    }

    static int maximum(int[][] arr) {
        int max = Integer.MIN_VALUE;
        for (int[] ints : arr ) {
            for (int element : ints) {
                if (element > max) {
                    max = element;
                }
            }
        }
        return max;
    }

}
