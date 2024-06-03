package com.github.akarazhev.challenge.interview.linkedlists;

import com.github.akarazhev.challenge.interview.util.AssortedMethods;
import com.github.akarazhev.challenge.interview.util.LinkedListNode;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Provides tests for the statement:
 */
@DisplayName("Delete Middle Node Test")
public final class DeleteMiddleNodeTest {

    @Test
    @DisplayName("test Delete Node")
    void testDeleteNode() {
        LinkedListNode head = AssortedMethods.randomLinkedList(10, 0, 10);
        System.out.println(head.printForward());
        assertTrue(DeleteMiddleNode.deleteNode(head.next.next.next.next)); // delete node 4
        System.out.println(head.printForward());
    }
}
