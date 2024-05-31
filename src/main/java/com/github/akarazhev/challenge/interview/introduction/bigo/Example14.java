package com.github.akarazhev.challenge.interview.introduction.bigo;

public final class Example14 {

    private final static class Node {
        private Node left;
        private Node right;
        private int value;
    }

    /**
     * The following simple code sums the values of all the nodes in a balanced binary search tree. What is its runtime?
     * The runtime will be linear in terms of the number of nodes. If there are N nodes, then the runtime is O(N).
     */
    int sum(final Node node) {
        if (node == null) {
            return 0;
        }

        return sum(node.left) + node.value + sum(node.right);
    }
}
