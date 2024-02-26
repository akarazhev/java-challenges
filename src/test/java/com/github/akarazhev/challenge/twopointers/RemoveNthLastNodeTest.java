package com.github.akarazhev.challenge.twopointers;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

/**
 * Provides tests for the <code>RemoveNthLastNode</code> solution.
 */
@DisplayName("Remove Nth Last Node Test")
public class RemoveNthLastNodeTest {

    @Test
    @DisplayName("Test Remove 1th Last Node")
    void testRemove1thLastNode() {
        LinkedList linkedList = new LinkedList();
        linkedList.createLinkedList(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9});
        LinkedListNode node = RemoveNthLastNode.removeNthLastNode(linkedList.head, 1);
        assertNotNull(node);
        assertEquals("1->2->3->4->5->6->7->8", node.asList());
    }

    @Test
    @DisplayName("Test Remove 2th Last Node")
    void testRemove2thLastNode() {
        LinkedList linkedList = new LinkedList();
        linkedList.createLinkedList(new int[]{23, 28, 10, 5, 67, 39, 70, 28});
        LinkedListNode node = RemoveNthLastNode.removeNthLastNode(linkedList.head, 2);
        assertNotNull(node);
        assertEquals("23->28->10->5->67->39->28", node.asList());
    }

    @Test
    @DisplayName("Test Remove 3th Last Node")
    void testRemove3thLastNode() {
        LinkedList linkedList = new LinkedList();
        linkedList.createLinkedList(new int[]{34, 53, 6, 95, 38, 28, 17, 63, 16, 76});
        LinkedListNode node = RemoveNthLastNode.removeNthLastNode(linkedList.head, 3);
        assertNotNull(node);
        assertEquals("34->53->6->95->38->28->17->16->76", node.asList());
    }

    @Test
    @DisplayName("Test Remove 4th Last Node")
    void testRemove4thLastNode() {
        LinkedList linkedList = new LinkedList();
        linkedList.createLinkedList(new int[]{288, 224, 275, 390, 4, 383, 330, 60, 193});
        LinkedListNode node = RemoveNthLastNode.removeNthLastNode(linkedList.head, 4);
        assertNotNull(node);
        assertEquals("288->224->275->390->4->330->60->193", node.asList());
    }

    @Test
    @DisplayName("Test Remove 6th Last Node")
    void testRemove6thLastNode() {
        LinkedList linkedList = new LinkedList();
        linkedList.createLinkedList(new int[]{69, 8, 49, 106, 116, 112});
        LinkedListNode node = RemoveNthLastNode.removeNthLastNode(linkedList.head, 6);
        assertNotNull(node);
        assertEquals("8->49->106->116->112", node.asList());
    }
}
