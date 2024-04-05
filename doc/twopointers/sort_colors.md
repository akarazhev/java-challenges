# Sort Colors

## Statement

Given an array, **colors**, which contains a combination of the following three elements:
- 0 (representing red)
- 1 (representing white)
- 2 (representing blue)

Sort the array in place so that the elements of the same color are adjacent, with the colors in the order of red, white, 
and blue. The function should return the same array.

> Note: The function should only return the modified **colors** array.

### Constraints

- 1 ≤ **colors.length** ≤ 300
- **colors[i]** can only contain 0s, 1s, or 2s.

## Solution

The solution is here: [SortColors.java](../../src/main/java/com/github/akarazhev/challenge/twopointers/SortColors.java "SortColors.java").
Tests are here: [SortColorsTest.java](../../src/test/java/com/github/akarazhev/challenge/twopointers/SortColorsTest.java "SortColorsTest.java").

## Complexity

### Time complexity

The time complexity of this solution is O(n), since we’re only traversing the array once.

### Space complexity

The space complexity of this solution is O(1), since no extra space is used.

<hr>

Go to [README](../../README.md "README.me")