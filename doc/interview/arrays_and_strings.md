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
end to hold the additional characters,and that you are given the "true" length of the string.
(Note: Please use a character array so that you can perform this operation in place.)

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

#### Time complexity

.

#### Space complexity

.

## One Away

### Statement

There are three types of edits that can be performed on strings: insert a character, remove a character, or replace
a character. Given two strings, write a function to check if they are one edit (or zero edits) away.

#### Hints #23., #97., #130.

- .
- .
- .

#### Solution

Solutions are here:
[OneAway.java](../../src/main/java/com/github/akarazhev/challenge/interview/arraysandstrings/OneAway.java
"OneAway.java").
Tests are here:
[OneAwayTest.java](../../src/test/java/com/github/akarazhev/challenge/interview/arraysandstrings/OneAwayTest.java
"OneAwayTest.java").

### Complexity

#### Time complexity

.

#### Space complexity

.

## String Compression

### Statement

Implement a method to perform basic string compression using the counts of repeated characters. For example, the string
aabcccccaaa would become a2blc5a3. If the "compressed" string would not become smaller than the original string,
your method should return the original string. You can assume the string has only uppercase and lowercase letters (a - z).

#### Hints #92., #110.

- .
- .
- .

#### Solution

Solutions are here:
[StringCompression.java](../../src/main/java/com/github/akarazhev/challenge/interview/arraysandstrings/StringCompression.java "StringCompression.java").
Tests are here:
[StringCompressionTest.java](../../src/test/java/com/github/akarazhev/challenge/interview/arraysandstrings/StringCompressionTest.java "StringCompressionTest.java").

### Complexity

#### Time complexity

.

#### Space complexity

.

## Rotate Matrix

### Statement

Given an image represented by an NxN matrix, where each pixel in the image is 4 bytes, write a method to rotate the
image by 90 degrees. Can you do this in place?

#### Hints #51., #100.

- .
- .
- .

#### Solution

Solutions are here:
[RotateMatrix.java](../../src/main/java/com/github/akarazhev/challenge/interview/arraysandstrings/RotateMatrix.java "RotateMatrix.java").
Tests are here:
[RotateMatrixTest.java](../../src/test/java/com/github/akarazhev/challenge/interview/arraysandstrings/RotateMatrixTest.java "RotateMatrixTest.java").

### Complexity

#### Time complexity

.

#### Space complexity

.

## Zero Matrix

### Statement

Write an algorithm such that if an element in an MxN matrix is 0, its entire row and column are set to 0.

#### Hints #17., #74., #102.

- .
- .
- .

#### Solution

Solutions are here:
[ZeroMatrix.java](../../src/main/java/com/github/akarazhev/challenge/interview/arraysandstrings/ZeroMatrix.java "ZeroMatrix.java").
Tests are here:
[ZeroMatrixTest.java](../../src/test/java/com/github/akarazhev/challenge/interview/arraysandstrings/ZeroMatrixTest.java "ZeroMatrixTest.java").

### Complexity

#### Time complexity

.

#### Space complexity

.

## String Rotation

### Statement

Assume you have a method isSubstring which checks if one word is a substring of another. Given two strings, sl and s2,
write code to check if s2 is a rotation of sl using only one call to isSubstring
(e.g.,"waterbottle" is a rotation of"erbottlewat").

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

#### Time complexity

.

#### Space complexity

.

<hr>

Go to [README](../../README.md "README.me")