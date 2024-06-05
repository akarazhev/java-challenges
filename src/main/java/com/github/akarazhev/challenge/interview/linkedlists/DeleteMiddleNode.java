package com.github.akarazhev.challenge.interview.linkedlists;

import com.github.akarazhev.challenge.interview.util.LinkedListNode;

/**
 * Statement:
 */
public final class DeleteMiddleNode {

    /**
     * This function
     */
    public static boolean deleteNode(final LinkedListNode n) {
        if (n == null || n.next == null) {
            return false; // Failure
        }

        LinkedListNode next = n.next;
        n.data = next.data;
        n.next = next.next;
        return true;
    }
}
