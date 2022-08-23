package com.algorithms.recursion.arrays;

import java.util.ArrayList;

public class R_LinearSearch {
    public static void main(String[] args) {
        int[] toSearch = {1, 2, 3, 3, 5, 16, 8};
        System.out.println(linearSearch(toSearch, 0, 8));
        System.out.println(linearSearchIndex(toSearch, 0, 2));
        System.out.println(findFromLastIndex(toSearch, toSearch.length - 1, 3));
        findAllIndexes(toSearch, 0, 3);
        System.out.println(list);
    }

    private static boolean linearSearch(int[] toSearch, int pointer, int target) {
        if (pointer == toSearch.length) {
            return false;
        }
        return toSearch[pointer] == target || linearSearch(toSearch, pointer + 1, target);
    }

    // for index value
    private static int linearSearchIndex(int[] toSearch, int pointer, int target) {
        if (pointer == toSearch.length) {
            return -1;
        }
        if (toSearch[pointer] == target ) {
            return pointer;
        } else {
            return linearSearchIndex(toSearch, pointer + 1, target);
        }
    }

    // From last index
    private static int findFromLastIndex(int[] toSearch, int pointer, int target) {
        if (pointer == -1) {
            return -1;
        }
        if (toSearch[pointer] == target ) {
            return pointer;
        } else {
            return findFromLastIndex(toSearch, pointer - 1, target);
        }
    }

    // return array of multiple occurrences of the target
    static ArrayList<Integer> list = new ArrayList<>();
    private static void findAllIndexes(int[] toSearch, int pointer, int target) {
        if (pointer == toSearch.length) {
            return;
        }
        if (toSearch[pointer] == target) {
            list.add(pointer);
        }
        findAllIndexes(toSearch, pointer + 1, target);
    }
}
