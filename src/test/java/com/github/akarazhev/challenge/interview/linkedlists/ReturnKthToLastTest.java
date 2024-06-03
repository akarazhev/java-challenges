package com.github.akarazhev.challenge.interview.linkedlists;

import com.github.akarazhev.challenge.interview.util.AssortedMethods;
import com.github.akarazhev.challenge.interview.util.LinkedListNode;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Provides tests for the statement:
 */
@DisplayName("Return Kth To Last Test")
public final class ReturnKthToLastTest {

    @Test
    @DisplayName("Test First Solution")
    void testFirstSolution() {
        LinkedListNode head = AssortedMethods.createLinkedListFromArray(new int[]{0, 1, 2, 3, 4, 5, 6});
        assertEquals(7, ReturnKthToLast.FirstSolution.printKthToLast(head, 0));
        assertEquals(7, ReturnKthToLast.FirstSolution.printKthToLast(head, 1));
        assertEquals(7, ReturnKthToLast.FirstSolution.printKthToLast(head, 2));
        assertEquals(7, ReturnKthToLast.FirstSolution.printKthToLast(head, 3));
        assertEquals(7, ReturnKthToLast.FirstSolution.printKthToLast(head, 4));
        assertEquals(7, ReturnKthToLast.FirstSolution.printKthToLast(head, 5));
        assertEquals(7, ReturnKthToLast.FirstSolution.printKthToLast(head, 6));
        assertEquals(7, ReturnKthToLast.FirstSolution.printKthToLast(head, 7));
        assertEquals(7, ReturnKthToLast.FirstSolution.printKthToLast(head, 8));
    }

    @Test
    @DisplayName("Test Second Solution")
    void testSecondSolution() {
        LinkedListNode head = AssortedMethods.createLinkedListFromArray(new int[]{0, 1, 2, 3, 4, 5, 6});
        LinkedListNode node = ReturnKthToLast.SecondSolution.kthToLast(head, 0);
        assertEquals("0: null", 0 + ": " + (node == null ? "null" : "" + node.data));
        node = ReturnKthToLast.SecondSolution.kthToLast(head, 1);
        assertEquals("1: 6", 1 + ": " + (node == null ? "null" : "" + node.data));
        node = ReturnKthToLast.SecondSolution.kthToLast(head, 2);
        assertEquals("2: 5", 2 + ": " + (node == null ? "null" : "" + node.data));
        node = ReturnKthToLast.SecondSolution.kthToLast(head, 3);
        assertEquals("3: 4", 3 + ": " + (node == null ? "null" : "" + node.data));
        node = ReturnKthToLast.SecondSolution.kthToLast(head, 4);
        assertEquals("4: 3", 4 + ": " + (node == null ? "null" : "" + node.data));
        node = ReturnKthToLast.SecondSolution.kthToLast(head, 5);
        assertEquals("5: 2", 5 + ": " + (node == null ? "null" : "" + node.data));
        node = ReturnKthToLast.SecondSolution.kthToLast(head, 6);
        assertEquals("6: 1", 6 + ": " + (node == null ? "null" : "" + node.data));
        node = ReturnKthToLast.SecondSolution.kthToLast(head, 7);
        assertEquals("7: 0", 7 + ": " + (node == null ? "null" : "" + node.data));
        node = ReturnKthToLast.SecondSolution.kthToLast(head, 8);
        assertEquals("8: null", 8 + ": " + (node == null ? "null" : "" + node.data));
    }

    @Test
    @DisplayName("Test Third Solution")
    void testThirdSolution() {
        LinkedListNode head = AssortedMethods.createLinkedListFromArray(new int[]{0, 1, 2, 3});
        LinkedListNode node = ReturnKthToLast.ThirdSolution.nthToLast(head, 0);
        assertEquals("0: null", 0 + ": " + (node == null ? "null" : "" + node.data));
        node = ReturnKthToLast.ThirdSolution.nthToLast(head, 1);
        assertEquals("1: 3", 1 + ": " + (node == null ? "null" : "" + node.data));
        node = ReturnKthToLast.ThirdSolution.nthToLast(head, 2);
        assertEquals("2: 2", 2 + ": " + (node == null ? "null" : "" + node.data));
        node = ReturnKthToLast.ThirdSolution.nthToLast(head, 3);
        assertEquals("3: 1", 3 + ": " + (node == null ? "null" : "" + node.data));
        node = ReturnKthToLast.ThirdSolution.nthToLast(head, 4);
        assertEquals("4: 0", 4 + ": " + (node == null ? "null" : "" + node.data));
        node = ReturnKthToLast.ThirdSolution.nthToLast(head, 5);
        assertEquals("5: null", 5 + ": " + (node == null ? "null" : "" + node.data));
    }
}
