package com.data_strucutres.random_collections;

import java.util.*;

/**
 * Cannot contain any duplicate items
 * Hashset: removes duplicates and return fined version
 */
public class HashsetsDemo {
    public static void main(String[] args) {
        String[] things = {"apple", "bob", "ham", "bob", "bacon"};
        List<String> list = Arrays.asList(things);

        System.out.printf("%s", list + "\n");
        Set<String> set = new HashSet<>(list);
        System.out.printf("%s", set);
    }
}
