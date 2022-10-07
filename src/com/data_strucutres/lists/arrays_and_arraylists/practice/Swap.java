package com.data_strucutres.lists.arrays_and_arraylists.practice;

import java.util.Arrays;

public class Swap {
    public static void main(String[] args) {
        int [] arr = {1, 2 ,345, 45, 64};
        swap(arr, 1, 3);
        System.out.println(Arrays.toString(arr));
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void swap(int [] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    // reversing
    static void reverse(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            // swap
            swap(arr, start, end);
            start++;
            end--;
        }
    }
}
