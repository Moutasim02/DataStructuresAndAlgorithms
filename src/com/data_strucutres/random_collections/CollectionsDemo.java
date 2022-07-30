package com.data_strucutres.random_collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/**
 * Used Iterator interface, and List class
 */
public class CollectionsDemo {
    public static void main(String[] args) {
        String[] things = {"coke", "hats", "bikes"};
        List<String> list1 = new ArrayList<>();

        for (String x : things) {
            list1.add(x);
        }

        String[] more = {"hats", "bikes"};
        List<String> list2 = new ArrayList<>();
        for (String y : more) {
            list2.add(y);
        }

        // print list 1 items
        for (int i = 0; i < list1.size(); i++) {
            System.out.printf("%s ", list1.get(i));
        }

        editList(list1, list2);
        System.out.println();

        //print out list 1 again after editing/deletion
        for (int i = 0; i < list1.size(); i++) {
            System.out.printf("%s ", list1.get(i));
        }
    }

    private static void editList(Collection<String> list1, Collection<String> list2) {
        Iterator<String> iterator = list1.iterator();
        while (iterator.hasNext()) {
            if (list2.contains(iterator.next())) {
                iterator.remove();
            }
        }
    }
}
