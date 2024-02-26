package com.github.akarazhev.challenge.twopointers;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * Provides tests for the <code>RemoveNthLastNode</code> solution.
 */
@DisplayName("Remove Nth Last Node Test")
public class RemoveNthLastNodeTest {

    @Test
    @DisplayName("Test Valid Palindrome")
    void testValidPalindrome() {
        LinkedList linkedList = new LinkedList();
        linkedList.createLinkedList(new int[]{23, 28, 10, 5, 67, 39, 70, 28});
        LinkedListNode node = RemoveNthLastNode.removeNthLastNode(linkedList.head, 2);
    }
}
