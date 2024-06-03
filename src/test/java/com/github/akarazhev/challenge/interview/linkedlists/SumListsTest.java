package com.github.akarazhev.challenge.interview.linkedlists;

import com.github.akarazhev.challenge.interview.util.LinkedListNode;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Provides tests for the statement:
 */
@DisplayName("Sum Lists Test")
public final class SumListsTest {

    @Test
    @DisplayName("Test First Solution")
    void testFirstSolution() {
        LinkedListNode lA1 = new LinkedListNode(9, null, null);
        LinkedListNode lA2 = new LinkedListNode(9, null, lA1);
        LinkedListNode lA3 = new LinkedListNode(9, null, lA2);

        LinkedListNode lB1 = new LinkedListNode(1, null, null);
        LinkedListNode lB2 = new LinkedListNode(0, null, lB1);
        LinkedListNode lB3 = new LinkedListNode(0, null, lB2);

        LinkedListNode list3 = SumLists.FirstSolution.addLists(lA1, lB1);

        assertEquals("  9->9->9", "  " + lA1.printForward());
        assertEquals("+ 1->0->0", "+ " + lB1.printForward());
        assertEquals("= 0->0->0->1", "= " + list3.printForward());

        int l1 = SumLists.FirstSolution.linkedListToInt(lA1);
        int l2 = SumLists.FirstSolution.linkedListToInt(lB1);
        int l3 = SumLists.FirstSolution.linkedListToInt(list3);

        assertEquals("999 + 1 = 1000", l1 + " + " + l2 + " = " + l3);
        assertEquals("999 + 1 = 1000", l1 + " + " + l2 + " = " + (l1 + l2));
    }

    @Test
    @DisplayName("Test Second Solution")
    void testSecondSolution() {
        LinkedListNode lA1 = new LinkedListNode(3, null, null);
        LinkedListNode lA2 = new LinkedListNode(1, null, lA1);

        LinkedListNode lB1 = new LinkedListNode(5, null, null);
        LinkedListNode lB2 = new LinkedListNode(9, null, lB1);
        LinkedListNode lB3 = new LinkedListNode(1, null, lB2);

        LinkedListNode list3 = SumLists.SecondSolution.addLists(lA1, lB1);

        assertEquals("  3->1", "  " + lA1.printForward());
        assertEquals("+ 5->9->1", "+ " + lB1.printForward());
        assertEquals("= 6->2->2", "= " + list3.printForward());

        int l1 = SumLists.SecondSolution.linkedListToInt(lA1);
        int l2 = SumLists.SecondSolution.linkedListToInt(lB1);
        int l3 = SumLists.SecondSolution.linkedListToInt(list3);

        assertEquals("31 + 591 = 622", l1 + " + " + l2 + " = " + l3);
        assertEquals("31 + 591 = 622", l1 + " + " + l2 + " = " + (l1 + l2));
    }
}
