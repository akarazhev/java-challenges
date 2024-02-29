# Happy Number

## Statement

Write an algorithm to determine if a number _n_ is a happy number.

We use the following process to check if a given number is a happy number:

- Starting with the given number _n_, replace the number with the sum of the squares of its digits.
- Repeat the process until:
  - The number equals 1, which will depict that the given number _n_ is a happy number.
  - It enters a cycle, which will depict that the given number _n_ is not a happy number.

Return TRUE if _n_ is a happy number, and FALSE if not.

### Constraints:

- 1 ≤ **n** ≤ 2^31 - 1

## Examples

**Input**: n = 23

**Output**: TRUE

**Input**: n = 2

**Output**: FALSE

## Solution

The solution is here: [HappyNumber.java](../../src/main/java/com/github/akarazhev/challenge/fastandslowpointers/HappyNumber.java "HappyNumber.java").
Tests are here: [HappyNumberTest.java](../../src/test/java/com/github/akarazhev/challenge/fastandslowpointers/HappyNumberTest.java "HappyNumberTest.java").

## Complexity

### Time complexity

The total time complexity comes out to be _O_(1 + log _n_), which is _O_(log _n_)

### Space complexity

The space complexity for this algorithm is _O_(1).

<hr>

Go to [README](../../README.md "README.me")