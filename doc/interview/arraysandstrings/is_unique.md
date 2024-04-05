# Is Unique

## Statement

Implement an algorithm to determine if a string has all unique characters.

### Constraints

What if you cannot use additional data structures?

### Solution

Solutions are here: 
[UniqueString.java](../../../src/main/java/com/github/akarazhev/challenge/interview/arraysandstrings/UniqueString.java 
"UniqueString.java").
Tests are here: 
[UniqueStringTest.java](../../../src/test/java/com/github/akarazhev/challenge/interview/arraysandstrings/UniqueStringTest.java 
"UniqueStringTest.java").

## Complexity

### Time complexity

The time complexity for this code is O(n), where n is the length of the string. (You could also argue the time complexity 
is 0(1), since the for loop will never iterate through more than 128 characters.) If you didn't want to assume 
the character set is fixed, you could express the complexity as O(c) space and O(min(c, n)) or O(c) time, where c is 
the size of the character set.

### Space complexity

The space complexity is O(1).

<hr>

Go to [README](../../../README.md "README.me")