package com.dsa.arrays_and_arraylists.practice;

public class Max {
    public static void main(String[] args) {
        int[] arr = {1, 2, 345, 45, 64};
        System.out.println(max(arr));
        System.out.println(maxRange(arr, 2, 4));

    }

    // Array isn't empty
    static int max(int[] arr) {
        int maxVal = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxVal) {
                maxVal = arr[i];
            }
        }
        return maxVal;
    }

    // If we want from specific indexes, while assuming array could be null or logical error...
    static int maxRange(int[] arr, int start, int end) {
        if (start > end) {
            return -1;
        }
        if (arr == null) {
            return -1;
        }
        int maxVal = arr[start];
        for (int i = start; i <= end; i++) {
            if (arr[i] > maxVal) {
                maxVal = arr[i];
            }
        }
        return maxVal;
    }
}
