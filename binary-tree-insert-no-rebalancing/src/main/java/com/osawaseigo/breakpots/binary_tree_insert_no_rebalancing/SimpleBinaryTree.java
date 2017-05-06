package com.osawaseigo.breakpots.binary_tree_insert_no_rebalancing;

/**
 * Created by seigo on 06/05/2017.
 */
public class SimpleBinaryTree {
    private SimpleBinaryTreeNode treeRoot;

    public void insert(int[] ints) {
        for (int i : ints) {
            this.treeRoot = this.insert(i, this.treeRoot);
        }
    }

    private SimpleBinaryTreeNode insert(int i, SimpleBinaryTreeNode treeRoot) {
        if (treeRoot == null) {
            treeRoot = new SimpleBinaryTreeNode(i);
        } else if (i < treeRoot.value) {
            treeRoot.left = insert(i, treeRoot.left);
        } else if (i > treeRoot.value) {
            treeRoot.right = insert(i, treeRoot.right);
        }
        return treeRoot;
    }

    private class SimpleBinaryTreeNode {
        public int value;
        public SimpleBinaryTreeNode left;
        public SimpleBinaryTreeNode right;

        public SimpleBinaryTreeNode(int i) {
            this.value = i;
        }
    }
}
