package com.algorithms.recursion.arrays;

public class RotatedBinarySearch {
    public static void main(String[] args) {
        int[] toCheck = {5, 6, 7, 8, 9, 1, 2, 3};
        int target = 7;
        System.out.println(rotatedBS(toCheck, target, 0, toCheck.length - 1));
    }

    private static int rotatedBS(int[] toCheck, int target, int start, int end) {
        if (start > end) {
            return -1;
        }
        int middle = start + (end - start) / 2;
        if (toCheck[middle] == target) {
            return middle;
        }
        if (toCheck[start] <= toCheck[middle]) {
            if (target >= toCheck[start] && target <= toCheck[middle]) {
                return rotatedBS(toCheck, target, start, middle - 1);
            } else {
                return rotatedBS(toCheck, target, middle + 1, end);
            }
        }

        if (target >= toCheck[middle] && target <= toCheck[end]) {
            return rotatedBS(toCheck, target, middle + 1, end);
        }
        return rotatedBS(toCheck, target, start, middle - 1);
    }
}
