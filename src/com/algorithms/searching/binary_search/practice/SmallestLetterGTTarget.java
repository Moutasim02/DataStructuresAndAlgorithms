package com.algorithms.searching.binary_search.practice;

// Smallest letter greater than target
public class SmallestLetterGTTarget {
    public static void main(String[] args) {
        char[] arr = {'c', 'f', 'j'};
        char target = 'f';
        char ans = nextGreatestLetter(arr, target);
        System.out.println(ans);
    }

    public static char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;
        while (start <= end) {
            int middle = start + (end - start) / 2;
            if (target < letters[middle]) {
                end = middle - 1;
            } else {
                start = middle + 1;
            }
        }
        return letters[start % letters.length];
    }
}
