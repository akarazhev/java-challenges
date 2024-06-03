package com.github.akarazhev.challenge.interview.linkedlists;

import com.github.akarazhev.challenge.interview.util.LinkedListNode;

/**
 * Statement:
 */
public final class ReturnKthToLast {

    /**
     * First Solution
     */
    static final class FirstSolution {

        public static int printKthToLast(final LinkedListNode head, final int k) {
            if (head == null) {
                return 0;
            }

            int index = printKthToLast(head.next, k) + 1;
            if (index == k) {
                System.out.println(k + "th to last node is " + head.data);
            }

            return index;
        }
    }

    /**
     * Second Solution
     */
    static final class SecondSolution {

        private final static class Index {
            public int value = 0;
        }

        public static LinkedListNode kthToLast(final LinkedListNode head, final int k) {
            Index idx = new Index();
            return kthToLast(head, k, idx);
        }

        private static LinkedListNode kthToLast(final LinkedListNode head, final int k, final Index idx) {
            if (head == null) {
                return null;
            }

            LinkedListNode node = kthToLast(head.next, k, idx);
            idx.value = idx.value + 1;
            if (idx.value == k) {
                return head;
            }

            return node;
        }
    }

    /**
     * Third Solution
     */
    static final class ThirdSolution {

        public static LinkedListNode nthToLast(final LinkedListNode head, final int k) {
            LinkedListNode p1 = head;
            LinkedListNode p2 = head;

            /* Move p1 k nodes into the list.*/
            for (int i = 0; i < k; i++) {
                if (p1 == null) return null; // Out of bounds
                p1 = p1.next;
            }

            /* Move them at the same pace. When p1 hits the end,
             * p2 will be at the right element. */
            while (p1 != null) {
                p1 = p1.next;
                p2 = p2.next;
            }

            return p2;
        }
    }
}
