# String Rotation

## Statement

Assume you have a method isSubstring which checks if one word is a substring of another. Given two strings, sl and s2, 
write code to check if s2 is a rotation of sl using only one call to isSubstring 
(e.g.,"waterbottle" is a rotation of"erbottlewat").

### Hints

- If a string is a rotation of another, then it's a rotation at a particular point. For example, a rotation of 
waterbottle at character 3 means cutting waterbottle at character 3 and putting the right half (erbottle) before the left
half (wat).
- We are essentially asking if there's a way of splitting the first string into two parts, x and y, such that the first 
string is xy and the second string is yx. For example, x = wat and y = erbottle. The first string is xy = waterbottle. 
The second string is yx = erbottlewat.
- Think about the earlier hint. Then think about what happens when you concatenate erbottlewat to itself. 
You get erbottlewaterbottlewat.

### Solution

Solutions are here:
[StringRotation.java](../../../src/main/java/com/github/akarazhev/challenge/interview/arraysandstrings/StringRotation.java 
"StringRotation.java").
Tests are here:
[StringRotationTest.java](../../../src/test/java/com/github/akarazhev/challenge/interview/arraysandstrings/StringRotationTest.java 
"StringRotationTest.java").

## Complexity

### Time complexity

.

### Space complexity

.

<hr>

Go to [README](../../../README.md "README.me")