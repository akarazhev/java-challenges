package com.github.akarazhev.challenge.interview.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class BTreePrinter {

    public static <T extends Comparable<?>> void printNode(final TreeNode root) {
        final int maxLevel = BTreePrinter.maxLevel(root);
        printNodeInternal(Collections.singletonList(root), 1, maxLevel);
    }

    private static <T extends Comparable<?>> void printNodeInternal(final List<TreeNode> nodes, final int level,
                                                                    final int maxLevel) {
        if (nodes.isEmpty() || BTreePrinter.isAllElementsNull(nodes)) {
            return;
        }

        final int floor = maxLevel - level;
        final int endgeLines = (int) Math.pow(2, (Math.max(floor - 1, 0)));
        final int firstSpaces = (int) Math.pow(2, (floor)) - 1;
        final int betweenSpaces = (int) Math.pow(2, (floor + 1)) - 1;

        BTreePrinter.printWhitespaces(firstSpaces);

        final List<TreeNode> newNodes = new ArrayList<>();
        for (final TreeNode node : nodes) {
            if (node != null) {
                System.out.print(node.data);
                newNodes.add(node.left);
                newNodes.add(node.right);
            } else {
                newNodes.add(null);
                newNodes.add(null);
                System.out.print(" ");
            }

            BTreePrinter.printWhitespaces(betweenSpaces);
        }

        System.out.println();
        for (int i = 1; i <= endgeLines; i++) {
            for (final TreeNode node : nodes) {
                BTreePrinter.printWhitespaces(firstSpaces - i);
                if (node == null) {
                    BTreePrinter.printWhitespaces(endgeLines + endgeLines + i + 1);
                    continue;
                }

                if (node.left != null) {
                    System.out.print("/");
                } else {
                    BTreePrinter.printWhitespaces(1);
                }

                BTreePrinter.printWhitespaces(i + i - 1);

                if (node.right != null) {
                    System.out.print("\\");
                } else {
                    BTreePrinter.printWhitespaces(1);
                }

                BTreePrinter.printWhitespaces(endgeLines + endgeLines - i);
            }

            System.out.println();
        }

        printNodeInternal(newNodes, level + 1, maxLevel);
    }

    private static void printWhitespaces(final int count) {
        for (int i = 0; i < count; i++) {
            System.out.print(" ");
        }
    }

    private static <T extends Comparable<?>> int maxLevel(final TreeNode node) {
        if (node == null) {
            return 0;
        }

        return Math.max(BTreePrinter.maxLevel(node.left), BTreePrinter.maxLevel(node.right)) + 1;
    }

    private static <T> boolean isAllElementsNull(final List<T> list) {
        for (final Object object : list) {
            if (object != null) {
                return false;
            }
        }

        return true;
    }
}
