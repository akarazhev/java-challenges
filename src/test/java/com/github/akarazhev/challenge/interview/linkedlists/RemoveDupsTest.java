package com.github.akarazhev.challenge.interview.linkedlists;

import com.github.akarazhev.challenge.interview.util.LinkedListNode;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Provides tests for the statement:
 */
@DisplayName("Remove Dups Test")
public final class RemoveDupsTest {

    @Test
    @DisplayName("Test First Solution")
    void testFirstSolution() {
        LinkedListNode head = createList();
        assertEquals("0->1->0->1->0->1->0->1", head.printForward());
        LinkedListNode clone = head.clone();
        RemoveDups.FirstSolution.deleteDups(clone);
        assertEquals("0->1", clone.printForward());
    }

    @Test
    @DisplayName("Test Second Solution")
    void testSecondSolution() {
        LinkedListNode head = createList();
        assertEquals("0->1->0->1->0->1->0->1", head.printForward());
        LinkedListNode clone = head.clone();
        RemoveDups.SecondSolution.deleteDups(clone);
        assertEquals("0->1", clone.printForward());
    }

    @Test
    @DisplayName("Test Third Solution")
    void testThirdSolution() {
        LinkedListNode head = createList();
        assertEquals("0->1->0->1->0->1->0->1", head.printForward());
        LinkedListNode clone = head.clone();
        RemoveDups.ThirdSolution.deleteDups(clone);
        assertEquals("0->1", clone.printForward());
    }

    private LinkedListNode createList() {
        LinkedListNode first = new LinkedListNode(0, null, null); //AssortedMethods.randomLinkedList(1000, 0, 2);
        LinkedListNode head = first;
        LinkedListNode second;
        for (int i = 1; i < 8; i++) {
            second = new LinkedListNode(i % 2, null, null);
            first.setNext(second);
            second.setPrevious(first);
            first = second;
        }

        return head;
    }
}
