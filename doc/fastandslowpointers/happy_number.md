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

- 1 ≤ _n_ ≤ 2^31 - 1

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

To estimate the count of numbers in a cycle, let’s consider the following two cases:

1. **Numbers with three digits**: The largest three-digit number is 999. The sum of the squares of its digits is 243. 
Therefore, the time complexity in this case is given as _O_(243 * 3), where 243 is the maximum count of numbers in a cycle 
and 3 is the number of digits in a three-digit number. This is why the time complexity in the case of numbers with 
three digits comes out to be _O_(1).
2. **Numbers with more than three digits:** Any number with more than three digits will lose at least one digit at 
every step until it becomes a three-digit number. For example, the first four-digit number that we can get in the cycle is
1053, which is the sum of the square of the digits in 9999999999999. Therefore, the time complexity of any number with 
more than three digits can be expressed as _O_(log _n_ + log log _n_ + log log log _n_ + ...). Since _O_(log _n_) is the
dominating term, we can write the time complexity as _O_(log _n_).

Therefore, the total time complexity comes out to be _O_(1 + log _n_), which is _O_(log _n_).

### Space complexity

The space complexity for this algorithm is _O_(1).

<hr>

Go to [README](../../README.md "README.me")