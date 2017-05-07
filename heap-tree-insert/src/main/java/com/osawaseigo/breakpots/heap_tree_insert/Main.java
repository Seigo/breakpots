package com.osawaseigo.breakpots.heap_tree_insert;

/**
 * Created by seigo on 07/05/2017.
 */
public class Main {
    public static void main(String args[]) {
        BinaryHeapTree tree = new BinaryHeapTree();
        System.out.println("Inserting into Heap Tree");
        tree.insert(new int[]{5, 8, 4, 7, 3, 2, 9, 1, 6, 0});
        System.out.println("Inserted into Heap Tree");
    }
}
