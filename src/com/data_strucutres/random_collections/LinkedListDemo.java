package com.data_strucutres.random_collections;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/**
 * Linkedlist Inherits List
 */
public class LinkedListDemo {
    public static void main(String[] args) {
        String[] things = {"coke", "hats", "bikes", "apples", "goats"};
        List<String> list1 = new LinkedList<>();
        // add all items from things array into the list
        for (String thing : things) {
            list1.add(thing);
        }

        String[] things2 = {"sausage", "ask", "get", "what", "tool"};
        List<String> list2 = new LinkedList<>();
        // add all items from things2 array into the list
        for (String s : things2) {
            list2.add(s);
        }

        // Add list 1 with two
        list1.addAll(list2);
        list2 = null;

        printMe(list1);
        removeStuff(list1, 2, 6);
        printMe(list1);
        reverseMe(list1);
    }

    private static void reverseMe(List<String> list1) {
        ListIterator<String> iterator = list1.listIterator(list1.size());
        while (iterator.hasPrevious()) {
            System.out.printf("%s ", iterator.previous());
        }
    }

    private static void removeStuff(List<String> list1, int from, int to) {
        list1.subList(from, to).clear();
    }

    private static void printMe(List<String> list1) {
        for (String s : list1) {
            System.out.printf("%s ", s);
        }
        System.out.println();
    }
}
