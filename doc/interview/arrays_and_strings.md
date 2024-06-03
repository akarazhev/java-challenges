# Arrays and Strings

## Is Unique

### Statement

Implement an algorithm to determine if a string has all unique characters. What if you cannot use additional data structures?

#### Hints

- Try a hash table.
- Could a bit vector be useful?
- Can you solve it in O(N log N) time? What might a solution like that look like?

#### Solution

Solutions are here:
[IsUnique.java](../../src/main/java/com/github/akarazhev/challenge/interview/arraysandstrings/IsUnique.java
"IsUnique.java").
Tests are here:
[IsUniqueTest.java](../../src/test/java/com/github/akarazhev/challenge/interview/arraysandstrings/IsUniqueTest.java
"IsUniqueTest.java").

### Complexity

The time complexity for this code is O(n), where n is the length of the string. The space complexity is O(1).
(You could also argue the time complexity is O(1), since the for loop will never iterate through more than 128 characters.)
If you didn't want to assume the character set is fixed, you could express the complexity as O(c) space and
O(min(c, n)) or O(c) time, where c is the size of the character set.

If we can't use additional data structures, we can do the following:
1. Compare every character of the string to every other character of the string. This will take O(n^2) time and O(1) space.
2. If we are allowed to modify the input string, we could sort the string in O(n log(n)) time and then linearly check
   the string for neighboring characters that are identical. Careful, though: many sorting algorithms take up extra space.

## Check Permutation

### Statement

Given two strings, write a method to decide if one is a permutation of the other.

#### Hints

- Describe what it means for two strings to be permutations of each other. Now, look at that definition you provided.
  Can you check the strings against that definition?
- There is one solution that is O(N log N) time. Another solution uses some space, but is O(N) time.
- Could a hash table be useful?
- Two strings that are permutations should have the same characters, but in different orders. Can you make the orders the same?

#### Solution

Solutions are here:
[CheckPermutation.java](../../src/main/java/com/github/akarazhev/challenge/interview/arraysandstrings/CheckPermutation.java
"CheckPermutation.java").
Tests are here:
[CheckPermutationTest.java](../../src/test/java/com/github/akarazhev/challenge/interview/arraysandstrings/CheckPermutationTest.java
"CheckPermutationTest.java").

## URLify

### Statement

Write a method to replace all spaces in a string with '%20'. You may assume that the string has sufficient space at the
end to hold the additional characters, and that you are given the "true" length of the string. (Note: Please use a 
character array so that you can perform this operation in place.)

#### Hints

- It's often easiest to modify strings by going from the end of the string to the beginning.
- You might find you need to know the number of spaces. Can you just count them?

#### Solution

Solutions are here:
[URLify.java](../../src/main/java/com/github/akarazhev/challenge/interview/arraysandstrings/URLify.java "URLify.java").
Tests are here:
[URLifyTest.java](../../src/test/java/com/github/akarazhev/challenge/interview/arraysandstrings/URLifyTest.java "URLifyTest.java").

## Palindrome Permutation

### Statement

Given a string, write a function to check if it is a permutation of a palindrome. A palindrome is a word or phrase that
is the same forwards and backwards. A permutation is a rearrangement of letters. The palindrome does not need to be
limited to just dictionary words.

#### Hints

- You do not have to-and should not-generate all permutations. This would be very inefficient.
- What characteristics would a string that is a permutation of a palindrome have?
- Have you tried a hash table? You should be able to get this down to O(N) time.
- Can you reduce the space usage by using a bit vector?

#### Solution

Solutions are here:
[PalindromePermutation.java](../../src/main/java/com/github/akarazhev/challenge/interview/arraysandstrings/PalindromePermutation.java
"PalindromePermutation.java").
Tests are here:
[PalindromePermutationTest.java](../../src/test/java/com/github/akarazhev/challenge/interview/arraysandstrings/PalindromePermutationTest.java
"PalindromePermutationTest.java").

### Complexity

This algorithm takes O(N) time, where N is the length of the string.

## One Away

### Statement

There are three types of edits that can be performed on strings: insert a character, remove a character, or replace
a character. Given two strings, write a function to check if they are one edit (or zero edits) away.

#### Hints

- Start with the easy thing. Can you check each of the conditions separately?
- What is the relationship between the "insert character" option and the "remove character" option? Do these need to be 
  two separate checks?
- Can you do all three checks in a single pass?

#### Solution

Solutions are here:
[OneAway.java](../../src/main/java/com/github/akarazhev/challenge/interview/arraysandstrings/OneAway.java
"OneAway.java").
Tests are here:
[OneAwayTest.java](../../src/test/java/com/github/akarazhev/challenge/interview/arraysandstrings/OneAwayTest.java
"OneAwayTest.java").

### Complexity

This algorithm (and almost any reasonable algorithm) takes O (n) time, where n is the length of the shorter string.

## String Compression

### Statement

Implement a method to perform basic string compression using the counts of repeated characters. For example, the string
aabcccccaaa would become a2blc5a3. If the "compressed" string would not become smaller than the original string,
your method should return the original string. You can assume the string has only uppercase and lowercase letters (a - z).

#### Hints

- Do the easy thing first. Compress the string, then compare the lengths.
- Be careful that you aren't repeatedly concatenating strings together. This can be very inefficient.

#### Solution

Solutions are here:
[StringCompression.java](../../src/main/java/com/github/akarazhev/challenge/interview/arraysandstrings/StringCompression.java "StringCompression.java").
Tests are here:
[StringCompressionTest.java](../../src/test/java/com/github/akarazhev/challenge/interview/arraysandstrings/StringCompressionTest.java "StringCompressionTest.java").

### Complexity

The runtime is O(p + k^2), where p is the size of the original string and k is the l number of character sequences. 
For example, if the string is aabccdeeaa, then there are six characte sequences. It's slow because string concatenation 
operates in O(n^2) time.

## Rotate Matrix

### Statement

Given an image represented by an NxN matrix, where each pixel in the image is 4 bytes, write a method to rotate the
image by 90 degrees. Can you do this in place?

#### Hints

- Try thinking about it layer by layer. Can you rotate a specific layer?
- Rotating a specific layer would just mean swapping the values in four arrays. If you were asked to swap the values 
  in two arrays, could you do this? Can you then extend it to four arrays?

#### Solution

Solutions are here:
[RotateMatrix.java](../../src/main/java/com/github/akarazhev/challenge/interview/arraysandstrings/RotateMatrix.java "RotateMatrix.java").
Tests are here:
[RotateMatrixTest.java](../../src/test/java/com/github/akarazhev/challenge/interview/arraysandstrings/RotateMatrixTest.java "RotateMatrixTest.java").

### Complexity

This algorithm is O(N^2), which is the best we can do since any algorithm must touch all N^2 elements.

## Zero Matrix

### Statement

Write an algorithm such that if an element in an MxN matrix is 0, its entire row and column are set to 0.

#### Hints

- If you just cleared the rows and columns as you found Os, you'd likely wind up clearing the whole matrix. 
  Try finding the cells with zeros first before making any changes to the matrix.
- Can you use O(N) additional space instead of O(N2 )? What information do you really need from the list of cells that 
  are zero?
- You probably need some data storage to maintain a list of the rows and columns that need to be zeroed. Can you reduce 
  the additional space usage to 0(1) by using the matrix itself for data storage?

#### Solution

Solutions are here:
[ZeroMatrix.java](../../src/main/java/com/github/akarazhev/challenge/interview/arraysandstrings/ZeroMatrix.java "ZeroMatrix.java").
Tests are here:
[ZeroMatrixTest.java](../../src/test/java/com/github/akarazhev/challenge/interview/arraysandstrings/ZeroMatrixTest.java "ZeroMatrixTest.java").

### Complexity

One way around this is to keep a second matrix which flags the zero locations. We would then do a second pass through 
the matrix to set the zeros.This would take O(MN) space.

To make this somewhat more space efficient we could use a bit vector instead of a boolean array. It would still be O(N) space.
We can reduce the space to 0(1) by using the first row as a replacement for the row array and the first column as a 
replacement for the column array.

## String Rotation

### Statement

Assume you have a method isSubstring which checks if one word is a substring of another. Given two strings, sl and s2,
write code to check if s2 is a rotation of sl using only one call to isSubstring (e.g.,"waterbottle" is a rotation of 
"erbottlewat").

#### Hints

- If a string is a rotation of another, then it's a rotation at a particular point. For example, a rotation of
  waterbottle at character 3 means cutting waterbottle at character 3 and putting the right half (erbottle) before the left
  half (wat).
- We are essentially asking if there's a way of splitting the first string into two parts, x and y, such that the first
  string is xy and the second string is yx. For example, x = wat and y = erbottle. The first string is xy = waterbottle.
  The second string is yx = erbottlewat.
- Think about the earlier hint. Then think about what happens when you concatenate erbottlewat to itself.
  You get erbottlewaterbottlewat.

#### Solution

Solutions are here:
[StringRotation.java](../../src/main/java/com/github/akarazhev/challenge/interview/arraysandstrings/StringRotation.java
"StringRotation.java").
Tests are here:
[StringRotationTest.java](../../src/test/java/com/github/akarazhev/challenge/interview/arraysandstrings/StringRotationTest.java
"StringRotationTest.java").

### Complexity

The runtime of this varies based on the runtime of isSubstring. But if you assume that isSubstring runs in O(A+B) time 
(on strings of length A and B), then the runtime of isRotation is O(N).

<hr>

Go to [README](../../README.md "README.me")