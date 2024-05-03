package com.github.akarazhev.challenge.interview.util;

/**
 * One node of a binary tree. The data element stored is a single character.
 */
public final class TreeNode {
    public int data;
    public TreeNode left;
    public TreeNode right;
    public TreeNode parent;
    private int size;

    public TreeNode(final int data) {
        this.data = data;
        size = 1;
    }

    private void setLeftChild(final TreeNode left) {
        this.left = left;
        if (left != null) {
            left.parent = this;
        }
    }

    private void setRightChild(final TreeNode right) {
        this.right = right;
        if (right != null) {
            right.parent = this;
        }
    }

    public void insertInOrder(final int data) {
        if (data <= this.data) {
            if (left == null) {
                setLeftChild(new TreeNode(data));
            } else {
                left.insertInOrder(data);
            }
        } else {
            if (right == null) {
                setRightChild(new TreeNode(data));
            } else {
                right.insertInOrder(data);
            }
        }

        size++;
    }

    public int size() {
        return size;
    }

    public boolean isBST() {
        if (left != null) {
            if (data < left.data || !left.isBST()) {
                return false;
            }
        }

        if (right != null) {
            return data < right.data && right.isBST();
        }

        return true;
    }

    public int height() {
        final int leftHeight = left != null ? left.height() : 0;
        final int rightHeight = right != null ? right.height() : 0;
        return 1 + Math.max(leftHeight, rightHeight);
    }

    public TreeNode find(final int data) {
        if (data == this.data) {
            return this;
        } else if (data <= this.data) {
            return left != null ? left.find(data) : null;
        } else {
            return right != null ? right.find(data) : null;
        }
    }

    private static TreeNode createMinimalBST(final int[] array, final int start, final int end) {
        if (end < start) {
            return null;
        }

        final int mid = (start + end) / 2;
        final TreeNode n = new TreeNode(array[mid]);
        n.setLeftChild(createMinimalBST(array, start, mid - 1));
        n.setRightChild(createMinimalBST(array, mid + 1, end));
        return n;
    }

    public static TreeNode createMinimalBST(final int[] array) {
        return createMinimalBST(array, 0, array.length - 1);
    }

    public void print() {
        BTreePrinter.printNode(this);
    }
}
