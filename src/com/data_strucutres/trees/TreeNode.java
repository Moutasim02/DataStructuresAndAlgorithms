package com.data_strucutres.trees;

public class TreeNode<E> {
    protected E element;
    protected TreeNode<E> left;
    protected TreeNode<E> right;

    public TreeNode(E element) {
        this.element = element;
    }

    public TreeNode(E element, TreeNode<E> left, TreeNode<E> right) {
        this.element = element;
        this.left = left;
        this.right = right;
    }

    @Override
    public String toString() {
        return element.toString();
    }
}
