package com.data_strucutres.random_collections;

import java.util.PriorityQueue;

/**
 * First in First out, FIFO basically
 */
public class QueueDemo {
    public static void main(String[] args) {
        PriorityQueue<String> queue = new PriorityQueue<>();
        queue.offer("first");
        queue.offer("second");
        queue.offer("third");
        // print the queue
        System.out.printf("%s", queue + "\n");
        // highest priority element (first)
        System.out.printf("%s", queue.peek() + "\n");
        // remove the priority element
        System.out.printf("%s", queue.poll() + "\n");

    }
}
