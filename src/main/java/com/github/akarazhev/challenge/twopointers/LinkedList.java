package com.github.akarazhev.challenge.twopointers;

/**
 * Template for the linked list.
 */
public class LinkedList {
    public LinkedListNode head;
    // constructor will be used to make a LinkedList type object
    public LinkedList() {
        this.head = null;
    }
    // insertNodeAtHead method will insert a LinkedListNode at head
    // of a linked list.
    public void insertNodeAtHead(LinkedListNode node) {
        if (this.head != null) {
            node.next = this.head;
        }

        this.head = node;
    }
    // createLinkedList method will create the linked list using the
    // given integer array with the help of InsertAtHead method.
    public void createLinkedList(int[] list) {
        for (int i = list.length - 1; i >= 0; i--) {
            insertNodeAtHead(new LinkedListNode(list[i]));
        }
    }
}
