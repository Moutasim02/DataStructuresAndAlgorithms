package com.algorithms.sorting.insertion_sort;

import java.util.Arrays;


public class InsertionSort {
    public static void main(String[] args) {
//        int[] arr = {5, 3, 4, 1, 2};
        int[] arr = {-12, -44, 2, 0, 53, 21};
//        insertionSort(arr);
        insertionSortSecondMethod(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void insertionSortSecondMethod(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int val = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > val) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = val;
        }
    }

    static void insertionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j > 0 && arr[j] < arr[j - 1]; j--) {
                swap(arr, j, j - 1);
            }
        }
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }


}
