package com.algorithms.sorting.cyclic_sort;

import java.util.Arrays;

// check swap move
public class CyclicSort {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
//        int[] arr = {3, 5, 2, 1, 4};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int expectedPosition = arr[i] - 1;
            if (arr[i] != arr[expectedPosition]) {
                swap(arr, i, expectedPosition);
                i--;
            }
        }
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
