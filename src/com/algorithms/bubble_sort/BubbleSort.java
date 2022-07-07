package com.algorithms.bubble_sort;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
//        int[] arr = {5, 4, 3, 2, 1};
        int[] arr = {-12, -44, 2, 0, 53, 21};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void bubbleSort(int[] arr) {
        boolean swapped;
        // run the steps n-1 times
        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            // for each step, max item will come at the last index respectively
            for (int j = 1; j < arr.length - i; j++) {
                // Check with previous item
                if (arr[j] < arr[j-1]) {
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true; // when taking place
                }
            }
            if (!swapped) {
                // if array is already sorted after particular i
                break;
            }
        }
    }
}
