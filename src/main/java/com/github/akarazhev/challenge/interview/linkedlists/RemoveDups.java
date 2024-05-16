package com.github.akarazhev.challenge.interview.linkedlists;

import com.github.akarazhev.challenge.interview.util.LinkedListNode;

import java.util.HashSet;
import java.util.Set;

public final class RemoveDups {

    /**
     * First Solution
     */
    static final class FirstSolution {

        public static void deleteDups(LinkedListNode n) {
            Set<Integer> set = new HashSet<>();
            LinkedListNode previous = null;
            while (n != null) {
                if (set.contains(n.data)) {
                    previous.next = n.next;
                } else {
                    set.add(n.data);
                    previous = n;
                }

                n = n.next;
            }
        }
    }

    /**
     * Second Solution
     */
    static final class SecondSolution {

        public static void deleteDups(final LinkedListNode head) {
            LinkedListNode current = head;
            while (current != null) {
                /* Remove all future nodes that have the same value */
                LinkedListNode runner = current;
                while (runner.next != null) {
                    if (runner.next.data == current.data) {
                        runner.next = runner.next.next;
                    } else {
                        runner = runner.next;
                    }
                }

                current = current.next;
            }
        }
    }

    /**
     * Third Solution
     */
    static final class ThirdSolution {

        public static void deleteDups(final LinkedListNode head) {
            if (head == null) {
                return;
            }

            LinkedListNode previous = head;
            LinkedListNode current = previous.next;
            while (current != null) {
                // Look backwards for dups, and remove any that you see.
                LinkedListNode runner = head;
                while (runner != current) {
                    if (runner.data == current.data) {
                        LinkedListNode tmp = current.next;
                        previous.next = tmp;
                        current = tmp;
                        /* We know we can't have more than one dup preceding
                         * our element since it would have been removed
                         * earlier. */
                        break;
                    }
                    runner = runner.next;
                }

                /* If runner == current, then we didn't find any duplicate
                 * elements in the previous for loop.  We then need to
                 * increment current.
                 * If runner != current, then we must have hit the �break�
                 * condition, in which case we found a dup and current has
                 * already been incremented.*/
                if (runner == current) {
                    previous = current;
                    current = current.next;
                }
            }
        }
    }
}
