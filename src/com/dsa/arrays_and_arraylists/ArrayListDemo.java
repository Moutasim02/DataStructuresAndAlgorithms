package com.dsa.arrays_and_arraylists;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListDemo {
    public static void main(String[] args) {
        // Syntax
        ArrayList<Integer> list = new ArrayList<>(10);

        Scanner in = new Scanner(System.in);

        /*
        list.add(67);
        list.add(6234);
        list.add(6435);
        list.add(67564);
        list.add(6743); // No limit to add
        System.out.println(list);
        System.out.println(list.contains(67));
        list.set(0,99);
        System.out.println(list);
        */

//        list.remove(2);
//        System.out.println(list);
//

        //input
        for (int i = 0; i < 5; i++){
            list.add(in.nextInt());
        }

        //output
        for (int i = 0; i < 5; i++){
            System.out.println(list.get(i));
        }
    }
}
