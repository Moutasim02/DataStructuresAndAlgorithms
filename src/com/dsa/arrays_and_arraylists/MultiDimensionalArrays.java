package com.dsa.arrays_and_arraylists;

public class MultiDimensionalArrays {
    public static void main(String[] args) {
        /* Looks like this (Matrix)
            1 2 3
            4 5 6
            7 8 9
        */
        int [][] arr = new int[3][3]; // (Rows first) Columns not mandatory to specify

        int [][] twoDArray = {
                {1,2,3}, //0th index
                {4,5,6}, // 1st index
                {7,8,9} //2nd index -> {6,7,8,9}
        }; // look into 2.1 in the notes
    }
}
