package com.data_strucutres.lists.arrays_and_arraylists;

import java.util.Arrays;
import java.util.Scanner;

public class Looping2DArrays {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[][] arr = new int[3][3];
        System.out.println(arr.length); // No. of rows

        // 2.2
        // taking input
        for (int row = 0; row < arr.length; row++) {
            // for each col in every row
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = in.nextInt();
            }
        }

        // output
        for (int row = 0; row < arr.length; row++) {
            // for each col in every row
            for (int col = 0; col < arr[row].length; col++) {
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }


        // Another Way:
        for (int row = 0; row < arr.length; row++) {
            System.out.println(Arrays.toString(arr[row]));
        }

        // Another way:
        for (int[] a : arr) { // For arr, Datatype of every element is an int array by itself
            System.out.println(Arrays.toString(a));
        }

    }
}
