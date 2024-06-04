package com.github.akarazhev.challenge.interview.linkedlists;

import com.github.akarazhev.challenge.interview.util.AssortedMethods;
import com.github.akarazhev.challenge.interview.util.LinkedListNode;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Provides tests for the statement:
 */
@DisplayName("Intersection Test")
public final class IntersectionTest {

    @Test
    @DisplayName("Test Find Intersection")
    void testFindIntersection() {
        /* Create linked list */
        LinkedListNode list1 = AssortedMethods.createLinkedListFromArray(new int[]{-1, -2, 0, 1, 2, 3, 4, 5, 6, 7, 8});
        LinkedListNode list2 = AssortedMethods.createLinkedListFromArray(new int[]{12, 14, 15});
        list2.next.next = list1.next.next.next.next;
        assertEquals("-1->-2->0->1->2->3->4->5->6->7->8", list1.printForward());
        assertEquals("12->14->2->3->4->5->6->7->8", list2.printForward());
        LinkedListNode intersection = Intersection.findIntersection(list1, list2);
        assertEquals("2->3->4->5->6->7->8", intersection.printForward());
    }
}
