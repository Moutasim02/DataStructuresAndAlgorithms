package com.data_strucutres.stacks_and_queues;

import java.util.*;

public class InBuiltExample {
    public static void main(String[] args) {
       /* Stack<Integer> stack*//*in the stack*//* = new Stack<>()*//*in the head*//*;
        stack.push(34);
        stack.push(27);
        stack.push(23);
        stack.push(25);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

        Queue<Integer> queue = new LinkedList<>();
        queue.add(3);
        queue.add(4);
        queue.add(5);
        queue.add(7);
        queue.add(19);
        System.out.println(queue.remove()); // removes 3
        System.out.println(queue.remove()); // removes 4
        */

        Deque<Integer> deque = new ArrayDeque<>()/*Faster than queue*/;
        deque.add(89);
        deque.addFirst(34);
        deque.removeFirst();
    }
}
