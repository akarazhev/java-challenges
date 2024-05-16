# Two Pointers

## Valid Palindrome

### Statement

Write a function that takes a string, **s**, as an input and determines whether or not it is a palindrome.

> Note: A **palindrome** is a word, phrase, or sequence of characters that reads the same backward as forward.

#### Constraints

- 1 ≤ **s.length** ≤ 2 * 10^5
- The string **s** will contain English uppercase and lowercase letters, digits, and spaces.

### Solution

The solution is here: [ValidPalindrome.java](../../src/main/java/com/github/akarazhev/challenge/twopointers/ValidPalindrome.java "ValidPalindrome.java").
Tests are here: [ValidPalindromeTest.java](../../src/test/java/com/github/akarazhev/challenge/twopointers/ValidPalindromeTest.java "ValidPalindromeTest.java").

### Complexity

#### Time complexity

The time complexity is O(n) where n is the number of characters in the string. However, the algorithm will only run
(n/2) times, since two pointers are traversing toward each other.

#### Space complexity

The space complexity is O(1), since we use constant space to store two indexes.

## Remove nth Node from End of List

### Statement

Given a singly linked list, remove the _nth_ node from the end of the list and return its head.

#### Constraints

- The number of nodes in the list is **k**.
- 1 ≤ **k** ≤ 10^3
- -10^3 ≤ **Node.value** ≤ 10^3
- 1 ≤ **n** ≤ **k**

### Solution

The solution is here: [RemoveNthLastNode.java](../../src/main/java/com/github/akarazhev/challenge/twopointers/RemoveNthLastNode.java "RemoveNthLastNode.java").
Tests are here: [RemoveNthLastNodeTest.java](../../src/test/java/com/github/akarazhev/challenge/twopointers/RemoveNthLastNodeTest.java "RemoveNthLastNodeTest.java").

### Complexity

#### Time complexity

The time complexity is O(n), where n is the number of nodes in the linked list.

#### Space complexity

The space complexity is O(1), because we use constant space to store two pointers.

## Sort Colors

### Statement

Given an array, **colors**, which contains a combination of the following three elements:
- 0 (representing red)
- 1 (representing white)
- 2 (representing blue)

Sort the array in place so that the elements of the same color are adjacent, with the colors in the order of red, white,
and blue. The function should return the same array.

> Note: The function should only return the modified **colors** array.

#### Constraints

- 1 ≤ **colors.length** ≤ 300
- **colors[i]** can only contain 0s, 1s, or 2s.

### Solution

The solution is here: [SortColors.java](../../src/main/java/com/github/akarazhev/challenge/twopointers/SortColors.java "SortColors.java").
Tests are here: [SortColorsTest.java](../../src/test/java/com/github/akarazhev/challenge/twopointers/SortColorsTest.java "SortColorsTest.java").

### Complexity

#### Time complexity

The time complexity of this solution is O(n), since we’re only traversing the array once.

#### Space complexity

The space complexity of this solution is O(1), since no extra space is used.

<hr>

Go to [README](../../README.md "README.me")