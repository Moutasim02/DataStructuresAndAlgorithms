package com.data_strucutres.stacks_and_queues;

public class StackMain {
    public static void main(String[] args) throws StackException {
        CustomStack stack = new CustomStack(5);
        stack.push(34);
        stack.push(27);
        stack.push(23);
        stack.push(25);
        stack.push(52);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
