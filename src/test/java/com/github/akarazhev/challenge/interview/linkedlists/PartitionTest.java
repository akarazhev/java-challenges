package com.github.akarazhev.challenge.interview.linkedlists;

import com.github.akarazhev.challenge.interview.util.LinkedListNode;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Provides tests for the statement:
 */
@DisplayName("Partition Test")
public final class PartitionTest {

    @Test
    @DisplayName("Test First Solution")
    void testFirstSolution() {
        assertEquals("3->5->8->5->10->2->1", createLinkedList().printForward());
        /* Partition */
        LinkedListNode head = Partition.FirstSolution.partition(createLinkedList(), 5);
        /* Print Result */
        assertEquals("3->2->1->5->8->5->10", head.printForward());
    }

    @Test
    @DisplayName("Test Second Solution")
    void testSecondSolution() {
        assertEquals("3->5->8->5->10->2->1", createLinkedList().printForward());
        /* Partition */
        LinkedListNode head = Partition.SecondSolution.partition(createLinkedList(), 5);
        /* Print Result */
        assertEquals("1->2->3->10->5->8->5", head.printForward());
    }

    @Test
    @DisplayName("Test Third Solution")
    void testThirdSolution() {
        assertEquals("3->5->8->5->10->2->1", createLinkedList().printForward());
        /* Partition */
        LinkedListNode head = Partition.ThirdSolution.partition(createLinkedList(), 5);
        /* Print Result */
        assertEquals("1->2->3->5->8->5->10", head.printForward());
    }

    public static LinkedListNode createLinkedList() {
        /* Create linked list */
        int[] vals = {3, 5, 8, 5, 10, 2, 1};
        LinkedListNode head = new LinkedListNode(vals[0], null, null);
        LinkedListNode current = head;
        for (int i = 1; i < vals.length; i++) {
            current = new LinkedListNode(vals[i], null, current);
        }

        return head;
    }
}
