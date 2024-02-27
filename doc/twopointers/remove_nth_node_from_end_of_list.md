# Remove nth Node from End of List

## Statement

Given a singly linked list, remove the _nth_ node from the end of the list and return its head.

### Constraints:

- The number of nodes in the list is **k**.
- 1 ≤ **k** ≤ 10^3
- -10^3 ≤ **Node.value** ≤ 10^3
- 1 ≤ **n** ≤ **k**

## Examples

**Input**: **n = 1**, 43 -> 68 -> 11 -> 5 -> 69 -> 37 -> 70 -> NULL

**Output**: 43 -> 68 -> 11 -> 5 -> 69 -> 37 -> NULL

**Input**: **n = 3**, 23 -> 28 -> 10 -> 5 -> 67 -> 39 -> 70 -> NULL

**Output**: 23 -> 28 -> 10 -> 5 -> 39 -> 70 -> NULL

**Input**: **n = 5**, 1 -> 2 -> 3 -> 4 -> 5 -> 6 -> 7 -> NULL

**Output**: 1 -> 2 -> 4 -> 5 -> 6 -> 7 -> NULL

**Input**: **n = 4**, 50 -> 40 -> 30 -> 20 -> NULL

**Output**: 40 -> 30 -> 20 -> NULL

## Solution

The solution is here: [RemoveNthLastNode.java](../../src/main/java/com/github/akarazhev/challenge/twopointers/RemoveNthLastNode.java "RemoveNthLastNode.java").
Tests are here: [RemoveNthLastNodeTest.java](../../src/test/java/com/github/akarazhev/challenge/twopointers/RemoveNthLastNodeTest.java "RemoveNthLastNodeTest.java").

## Complexity

### Time complexity

The time complexity is _O_(_n_), where _n_ is the number of nodes in the linked list.

### Space complexity

The space complexity is _O_(1) because we use constant space to store two pointers.