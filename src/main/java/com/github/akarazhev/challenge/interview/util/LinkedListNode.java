package com.github.akarazhev.challenge.interview.util;

public final class LinkedListNode {
    public LinkedListNode next;
    public LinkedListNode prev;
    public LinkedListNode last;
    public int data;

    public LinkedListNode(final int data, final LinkedListNode next, final LinkedListNode previous) {
        this.data = data;
        setNext(next);
        setPrevious(previous);
    }

    public LinkedListNode(final int data) {
        this.data = data;
    }

    public LinkedListNode() {
    }

    public void setNext(final LinkedListNode next) {
        this.next = next;
        if (this == last) {
            last = next;
        }

        if (next != null && next.prev != this) {
            next.setPrevious(this);
        }
    }

    public void setPrevious(final LinkedListNode previous) {
        this.prev = previous;
        if (previous != null && previous.next != this) {
            previous.setNext(this);
        }
    }

    public String printForward() {
        if (next != null) {
            return this.data + "->" + next.printForward();
        } else {
            return ((Integer) this.data).toString();
        }
    }

    public LinkedListNode clone() {
        LinkedListNode next2 = null;
        if (next != null) {
            next2 = next.clone();
        }

        return new LinkedListNode(this.data, next2, null);
    }
}
