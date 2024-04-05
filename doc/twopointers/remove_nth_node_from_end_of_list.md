# Remove nth Node from End of List

## Statement

Given a singly linked list, remove the _nth_ node from the end of the list and return its head.

### Constraints

- The number of nodes in the list is **k**.
- 1 ≤ **k** ≤ 10^3
- -10^3 ≤ **Node.value** ≤ 10^3
- 1 ≤ **n** ≤ **k**

## Solution

The solution is here: [RemoveNthLastNode.java](../../src/main/java/com/github/akarazhev/challenge/twopointers/RemoveNthLastNode.java "RemoveNthLastNode.java").
Tests are here: [RemoveNthLastNodeTest.java](../../src/test/java/com/github/akarazhev/challenge/twopointers/RemoveNthLastNodeTest.java "RemoveNthLastNodeTest.java").

## Complexity

### Time complexity

The time complexity is O(n), where n is the number of nodes in the linked list.

### Space complexity

The space complexity is O(1), because we use constant space to store two pointers.

<hr>

Go to [README](../../README.md "README.me")