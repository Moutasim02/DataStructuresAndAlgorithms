package com.algorithms.linear_search;

public class SearchInStrings {
    public static void main(String[] args) {
        String name = "Moutasim";
        char target = 'm';
        System.out.println(search(name, target)); // returns true, last index
    }

    static boolean search(String str, char target) {

        if (str.length() == 0) {
            return false;
        }

        for (char ch:str.toCharArray()) {
            if (ch == target) {
                return true;
            }
        }
        return false;
    }
}
