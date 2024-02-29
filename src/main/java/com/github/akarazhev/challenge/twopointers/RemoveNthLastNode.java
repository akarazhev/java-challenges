package com.github.akarazhev.challenge.twopointers;

/**
 * Provides <code>Remove nth Node from End of List</code> solution.
 */
public class RemoveNthLastNode {

    /**
     * This function takes a head pointer of the list, and n as the position to remove from end of the list.
     *
     * @param head the begging og the list.
     * @param n    the position.
     * @return the final list.
     */
    public static LinkedListNode removeNthLastNode(LinkedListNode head, int n) {
        LinkedListNode right = head;
        for (int i = 0; i < n; i++) {
            right = right.next;
        }

        if (right == null) {
            return head != null ? head.next : null;
        }

        LinkedListNode left = head;
        while (right.next != null) {
            right = right.next;
            left = left.next;
        }

        left.next = left.next.next;
        return head;
    }
}
