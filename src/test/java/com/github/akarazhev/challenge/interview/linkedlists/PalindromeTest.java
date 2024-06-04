package com.github.akarazhev.challenge.interview.linkedlists;

import com.github.akarazhev.challenge.interview.util.LinkedListNode;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;

/**
 * Provides tests for the statement:
 */
@DisplayName("Palindrome Test")
public final class PalindromeTest {

    @Test
    @DisplayName("Test Solutions")
    void testFirstSolution() {
        int max = 11;
        for (int length = 1; length < max; length++) {
            LinkedListNode[] nodes = new LinkedListNode[length];
            for (int i = 0; i < length; i++) {
                nodes[i] = new LinkedListNode(i >= length / 2 ? length - i - 1 : i, null, null);
            }

            for (int i = 0; i < length; i++) {
                if (i < length - 1) {
                    nodes[i].setNext(nodes[i + 1]);
                }

                if (i > 0) {
                    nodes[i].setPrevious(nodes[i - 1]);
                }
            }

            for (int i = -1; i < length; i++) {
                if (i >= 0) {
                    nodes[i].data++; // Ruin palindrome
                }

                LinkedListNode head = nodes[0];
                System.out.println(head.printForward());
                boolean resultA = Palindrome.FirstSolution.isPalindrome(head);
                boolean resultB = Palindrome.SecondSolution.isPalindrome(head);
                boolean resultC = Palindrome.ThirdSolution.isPalindrome(head);
                System.out.println("A: " + resultA);
                System.out.println("B: " + resultB);
                System.out.println("C: " + resultC);
                assertFalse(resultA != resultB || resultB != resultC);
                if (i >= 0) {
                    nodes[i].data--;
                }
            }
        }
    }
}
