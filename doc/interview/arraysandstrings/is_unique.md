# Is Unique

## Statement

Implement an algorithm to determine if a string has all unique characters. What if you cannot use additional data structures?

### Hints

- Try a hash table.
- Could a bit vector be useful?
- Can you solve it in O(N log N) time? What might a solution like that look like?

### Solution

Solutions are here: 
[IsUnique.java](../../../src/main/java/com/github/akarazhev/challenge/interview/arraysandstrings/IsUnique.java 
"IsUnique.java").
Tests are here: 
[IsUniqueTest.java](../../../src/test/java/com/github/akarazhev/challenge/interview/arraysandstrings/IsUniqueTest.java 
"IsUniqueTest.java").

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