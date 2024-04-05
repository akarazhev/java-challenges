# Valid Palindrome

## Statement

Write a function that takes a string, **s**, as an input and determines whether or not it is a palindrome.

> Note: A **palindrome** is a word, phrase, or sequence of characters that reads the same backward as forward.

### Constraints

- 1 ≤ **s.length** ≤ 2 * 10^5
- The string **s** will contain English uppercase and lowercase letters, digits, and spaces.

## Solution

The solution is here: [ValidPalindrome.java](../../src/main/java/com/github/akarazhev/challenge/twopointers/ValidPalindrome.java "ValidPalindrome.java").
Tests are here: [ValidPalindromeTest.java](../../src/test/java/com/github/akarazhev/challenge/twopointers/ValidPalindromeTest.java "ValidPalindromeTest.java").

## Complexity

### Time complexity

The time complexity is O(n) where n is the number of characters in the string. However, the algorithm will only run
(n/2) times, since two pointers are traversing toward each other.

### Space complexity

The space complexity is O(1), since we use constant space to store two indexes.

<hr>

Go to [README](../../README.md "README.me")