package com.github.akarazhev.challenge.twopointers;

/**
 * Template for linked list node class.
 */
public class LinkedListNode {
    public int data;
    public LinkedListNode next;
    // Constructor will be used to make a LinkedListNode type object
    public LinkedListNode(int data) {
        this.data = data;
        this.next = null;
    }

    public String asList() {
        StringBuilder list = new StringBuilder();
        list.append(data);
        LinkedListNode node = next;
        while (node != null) {
            list.append("->").append(node.data);
            node = node.next;
        }

        return list.toString();
    }
}
