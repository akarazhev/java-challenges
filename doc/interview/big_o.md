# Big O

Big O time is the language and metric we use to describe the efficiency of algorithms. Not understanding it thoroughly 
can really hurt you in developing an algorithm. Not only might you be judged harshly for not really understanding big 0, 
but you will also struggle to judge when your algorithm is getting faster or slower. Master this concept.

Time is not the only thing that matters in an algorithm. We might also care about the amount of memory - or 
space-required by an algorithm.

Space complexity is a parallel concept to time complexity. If we need to create an array of size n, this will 
require 0(n) space. If we need a two-dimensional array of size nxn, this will require O(n^2) space.

Stack space in recursive calls counts, too.

## Example 1

```java
public final class Example01 {

    /**
     * This would take O(n) time and O(n) space.
     */
    public static int sum(final int n) {
        if (n <= 0) {
            return 0;
        }

        return n + sum(n - 1);
    }
}
```

## Example 2

```java
public final class Example02 {

    private static int pairSum(final int a, final int b) {
        return a + b;
    }

    /**
     * There will be roughly O(n) calls to pairSum. However, those calls do not exist simultaneously on the call stack,
     * so you only need O(1) space.
     */
    public static int pairSumSequence(final int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += pairSum(i, i + 1);
        }

        return sum;
    }
}
```