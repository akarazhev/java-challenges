package com.github.akarazhev.challenge.interview.linkedlists;

import com.github.akarazhev.challenge.interview.util.LinkedListNode;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

/**
 * Provides tests for the statement:
 */
@DisplayName("Loop Detection Test")
public final class LoopDetectionTest {

    @Test
    @DisplayName("Test Find Beginning")
    void testFindBeginning() {
        int listLength = 100;
        // Create linked list
        LinkedListNode[] nodes = new LinkedListNode[listLength];
        for (int i = 0; i < listLength; i++) {
            nodes[i] = new LinkedListNode(i, null, i > 0 ? nodes[i - 1] : null);
        }
        // Create loop;
        int k = 10;
        nodes[listLength - 1].next = nodes[listLength - k];
        LinkedListNode loop = LoopDetection.FindBeginning(nodes[0]);
        assertNotNull(loop);
        assertEquals(90, loop.data);
    }
}
