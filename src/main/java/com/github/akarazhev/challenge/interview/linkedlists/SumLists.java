package com.github.akarazhev.challenge.interview.linkedlists;

import com.github.akarazhev.challenge.interview.util.LinkedListNode;

/**
 * Statement:
 */
public final class SumLists {

    /**
     * First Solution
     */
    static final class FirstSolution {

        public static LinkedListNode addLists(final LinkedListNode l1, final LinkedListNode l2) {
            return addLists(l1, l2, 0);
        }

        private static LinkedListNode addLists(final LinkedListNode l1, final LinkedListNode l2, final int carry) {
            if (l1 == null && l2 == null && carry == 0) {
                return null;
            }

            LinkedListNode result = new LinkedListNode();
            int value = carry;
            if (l1 != null) {
                value += l1.data;
            }

            if (l2 != null) {
                value += l2.data;
            }

            result.data = value % 10;
            if (l1 != null || l2 != null) {
                LinkedListNode more = addLists(l1 == null ? null : l1.next,
                        l2 == null ? null : l2.next,
                        value >= 10 ? 1 : 0);
                result.setNext(more);
            }

            return result;
        }

        public static int linkedListToInt(final LinkedListNode node) {
            int value = 0;
            if (node.next != null) {
                value = 10 * linkedListToInt(node.next);
            }

            return value + node.data;
        }
    }

    /**
     * Second Solution
     */
    static final class SecondSolution {

        public final static class PartialSum {
            public LinkedListNode sum = null;
            public int carry = 0;
        }

        private static int length(final LinkedListNode l) {
            if (l == null) {
                return 0;
            } else {
                return 1 + length(l.next);
            }
        }

        private static PartialSum addListsHelper(final LinkedListNode l1, final LinkedListNode l2) {
            if (l1 == null && l2 == null) {
                return new PartialSum();
            }

            PartialSum sum = addListsHelper(l1.next, l2.next);
            int val = sum.carry + l1.data + l2.data;
            sum.sum = insertBefore(sum.sum, val % 10);
            sum.carry = val / 10;
            return sum;
        }

        public static LinkedListNode addLists(LinkedListNode l1, LinkedListNode l2) {
            int len1 = length(l1);
            int len2 = length(l2);
            if (len1 < len2) {
                l1 = padList(l1, len2 - len1);
            } else {
                l2 = padList(l2, len1 - len2);
            }

            PartialSum sum = addListsHelper(l1, l2);
            if (sum.carry == 0) {
                return sum.sum;
            } else {
                return insertBefore(sum.sum, sum.carry);
            }
        }

        private static LinkedListNode padList(final LinkedListNode l, final int padding) {
            LinkedListNode head = l;
            for (int i = 0; i < padding; i++) {
                head = insertBefore(head, 0);
            }

            return head;
        }

        private static LinkedListNode insertBefore(final LinkedListNode list, final int data) {
            LinkedListNode node = new LinkedListNode(data);
            if (list != null) {
                node.next = list;
            }

            return node;
        }

        public static int linkedListToInt(LinkedListNode node) {
            int value = 0;
            while (node != null) {
                value = value * 10 + node.data;
                node = node.next;
            }

            return value;
        }
    }
}
