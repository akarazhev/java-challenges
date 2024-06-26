package com.github.akarazhev.challenge.interview.linkedlists;

import com.github.akarazhev.challenge.interview.util.LinkedListNode;

/**
 * Statement:
 */
public final class Intersection {

    private final static class Result {
        public final LinkedListNode tail;
        public final int size;

        public Result(final LinkedListNode tail, final int size) {
            this.tail = tail;
            this.size = size;
        }
    }

    private static Result getTailAndSize(final LinkedListNode list) {
        if (list == null) {
            return null;
        }

        int size = 1;
        LinkedListNode current = list;
        while (current.next != null) {
            size++;
            current = current.next;
        }

        return new Result(current, size);
    }

    private static LinkedListNode getKthNode(final LinkedListNode head, int k) {
        LinkedListNode current = head;
        while (k > 0 && current != null) {
            current = current.next;
            k--;
        }

        return current;
    }

    /**
     * This function
     */
    public static LinkedListNode findIntersection(final LinkedListNode list1, final LinkedListNode list2) {
        if (list1 == null || list2 == null) {
            return null;
        }
        /* Get tail and sizes. */
        Result result1 = getTailAndSize(list1);
        Result result2 = getTailAndSize(list2);
        /* If different tail nodes, then there's no intersection. */
        if (result1.tail != result2.tail) {
            return null;
        }
        /* Set pointers to the start of each linked list. */
        LinkedListNode shorter = result1.size < result2.size ? list1 : list2;
        LinkedListNode longer = result1.size < result2.size ? list2 : list1;
        /* Advance the pointer for the longer linked list by the difference in lengths. */
        longer = getKthNode(longer, Math.abs(result1.size - result2.size));
        /* Move both pointers until you have a collision. */
        while (shorter != longer) {
            shorter = shorter.next;
            longer = longer.next;
        }
        /* Return either one. */
        return longer;
    }
}
