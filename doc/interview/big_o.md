# Big O

Big O time is the language and metric we use to describe the efficiency of algorithms. Not understanding it thoroughly 
can really hurt you in developing an algorithm. Not only might you be judged harshly for not really understanding big 0, 
but you will also struggle to judge when your algorithm is getting faster or slower. Master this concept.

Time is not the only thing that matters in an algorithm. We might also care about the amount of memory - or 
space-required by an algorithm.

Space complexity is a parallel concept to time complexity. If we need to create an array of size n, this will 
require O(n) space. If we need a two-dimensional array of size nxn, this will require O(n^2) space.

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

## Example 3

```java
/**
 * It is very possible for O(N) code to run faster than O( 1) code for specific inputs.
 * Big O just describes the rate of increase.
 * For this reason, we drop the constants in runtime. An algorithm that one might have described as O(2N) is actually O(N).
 * <p>
 * Big O allows us to express how the runtime scales. We just need to accept that it doesn't mean that O(N) is always
 * better than O(N^2).
 */
public final class Example03 {

    public static void minAndMax1(final int[] array) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int x : array) {
            if (x < min) {
                min = x;
            }

            if (x > max) {
                max = x;
            }
        }

        System.out.println(min + ", " + max);
    }

    public static void minAndMax2(final int[] array) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int x : array) {
            if (x < min) {
                min = x;
            }
        }

        for (int x : array) {
            if (x > max) {
                max = x;
            }
        }

        System.out.println(min + ", " + max);
    }
}
```

## Example 4

```java
public final class Example04 {

    /**
     * We do A chunks of work then B chunks of work. Therefore, the total amount of work is O(A + B).
     */
    public static void foo(final int[] arrA, final int[] arrB) {
        for (int a : arrA) {
            System.out.println(a);
        }

        for (int b : arrB) {
            System.out.println(b);
        }
    }

    /**
     * We do B chunks of work for each element in A. Therefore, the total amount of work is O(A * B).
     */
    public static void bar(final int[] arrA, final int[] arrB) {
        for (int a : arrA) {
            for (int b : arrB) {
                System.out.println(a + "," + b);
            }
        }
    }
}
```

## Example 5

```java
public final class Example05 {

    /**
     * When you have a recursive function that makes multiple calls, the runtime will often (but not always) look
     * like O(branches^depth), where branches is the number of times each recursive call branches. In this case,
     * this gives us O(2^N).
     */
    public static int f(final int n) {
        if (n <= 0) {
            return 1;
        }

        return f(n - 1) + f(n - 1);
    }
}
```

## Example 6

```java
public final class Example06 {

    /**
     * This will take O(N) time. The fact that we iterate through the array twice doesn't matter.
     */
    public static void foo(final int[] array) {
        int sum = 0;
        int product = 1;
        for (int j : array) {
            sum += j;
        }

        for (int j : array) {
            product *= j;
        }

        System.out.println(sum + ", " + product);
    }
}
```

## Example 7

```java
public final class Example07 {

    /**
     * The inner for loop has O(N) iterations, and it is called N times. Therefore, the runtime is O(N^2).
     */
    public static void printPairs(final int[] array) {
        for (int k : array) {
            for (int i : array) {
                System.out.println(k + "," + i);
            }
        }
    }
}
```

## Example 8

```java
public final class Example08 {

    /**
     * There are N^2 total pairs. Roughly half of those will have i < j and the remaining half will have i > j.
     * This code goes through roughly N^2/2 pairs, so it does O(N^2) work.
     */
    public static void printUnorderedPairs(final int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                System.out.println(array[i] + "," + array[j]);
            }
        }
    }
}
```

## Example 9

```java
public final class Example09 {

    /**
     * The if-statement within j's for loop is O(1) time since it's just a sequence of constant-time statements.
     * For each element of arrayA, the inner for loop goes through b iterations, where b = arrayB.length.
     * if a = arrayA.length, then the runtime is O(ab).
     */
    public static void printUnorderedPairs(final int[] arrayA, final int[] arrayB) {
        for (int k : arrayA) {
            for (int i : arrayB) {
                if (k < i) {
                    System.out.println(k + "," + i);
                }
            }
        }
    }
}
```

## Example 10

```java
public final class Example10 {

    /**
     * 1000 units of work is still constant, so the runtime is O(ab).
     */
    public static void printUnorderedPairs(final int[] arrayA, final int[] arrayB) {
        for (int j : arrayA) {
            for (int value : arrayB) {
                for (int k = 0; k < 1000; k++) {
                    System.out.println(j + "," + value);
                }
            }
        }
    }
}
```

## Example 11

```java
public final class Example11 {

    /**
     * This algorithm runs in O(N) time. The fact that it only goes through half of the array (in terms of iterations)
     * does not impact the big O time.
     */
    public static void reverse(final int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int other = array.length - i - 1;
            int temp = array[i];
            array[i] = array[other];
            array[other] = temp;
        }
    }
}
```

## Example 12

Which of the following are equivalent to O(N)? Why?
- O(N + P), where P < N/2
- O(2N)
- O(N + log N)
- O(N + M)

Let's go through these.
- If P < N/2, then we know that N is the dominant term so we can drop the O(P).
- O(2N) is O(N) since we drop constants.
- O(N) dominates O(log N), so we ca drop the O(log N).
- There is no established relationship between N and M, so we have to keep both variables in there.

Therefore, all but the last one are equivalent to O(N).

## Example 13

Suppose we had an algorithm that took in an array of strings, sorted each string, and then sorted the full array. 
What would the runtime be?

Let's define new terms-and use names that are logical.
- Let s be the length of the longest string.
- Let a be the length of the array.

Now we can work through this in parts:
- Sorting each string is O(s log s).
- We have to do this for every string (and there are a strings), so that's O(a*s log s).
- Now we have to sort all the strings. There are a strings,so you'll may be inclined to say that this takes O(a log a) time. 
This is what most candidates would say. You should also take into account that you need to compare the strings. 
Each string comparison takes O(s) time. There are O(a log a) comparisons, therefore this will take O(a*s log a) time.

If you add up these two parts,you get O(a*s(log a + log s)).

## Example 14

```java
public final class Example14 {

    private final static class Node {
        private Node left;
        private Node right;
        private int value;
    }

    /**
     * The following simple code sums the values of all the nodes in a balanced binary search tree. What is its runtime?
     * The runtime will be linear in terms of the number of nodes. If there are N nodes, then the runtime is O(N).
     */
    int sum(final Node node) {
        if (node == null) {
            return 0;
        }

        return sum(node.left) + node.value + sum(node.right);
    }
}
```

## Example 15

```java
public final class Example15 {

    /**
     * This runs in O(sqrt(n)) time.
     */
    public static boolean isPrime(final int n) {
        for (int x = 2; x * x <= n; x++) {
            if (n % x == 0) {
                return false;
            }
        }

        return true;
    }
}
```

## Example 16

```java
public final class Example16 {

    /**
     * It will take O(n) time.
     */
    public static int factorial(final int n) {
        if (n < 0) {
            return -1;
        } else if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
}
```

## Example 17

```java
public final class Example17 {

    /**
     * Since we are calling permutation O(n*n!) times (as an upper bound), and each one takes O(n) time,
     * the total runtime will not exceed O(n^2*n!).
     */
    public static void permutation(final String str) {
        permutation(str, "");
    }

    private static void permutation(final String str, final String prefix) {
        if (str.isEmpty()) {
            System.out.println(prefix);
        } else {
            for (int i = 0; i < str.length(); i++) {
                String rem = str.substring(0, i) + str.substring(i + 1);
                permutation(rem, prefix + str.charAt(i));
            }
        }
    }
}
```

## Example 18

```java
public final class Example18 {

    /**
     * There are 2 branches per call, and we go as deep as N, therefore the runtime is O(2^N).
     */
    public static int fib(final int n) {
        if (n <= 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }

        return fib(n - 1) + fib(n - 2);
    }
}
```

## Example 19

```java
public final class Example19 {

    /**
     * This is 2^n+1. Therefore, the runtime to compute the first n Fibonacci numbers (using this terrible algorithm)
     * is still O(2^n)
     */
    public static void allFib(final int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(i + ": " + fib(i));
        }
    }

    private static int fib(final int n) {
        if (n <= 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }

        return fib(n - 1) + fib(n - 2);
    }
}
```

## Example 20

```java
public final class Example20 {

    /**
     * We're doing a constant amount of work N times, so this is O(n) time.
     */
    public static void allFib(final int n) {
        int[] memo = new int[n + 1];
        for (int i = 0; i < n; i++) {
            System.out.println(i + ": " + fib(i, memo));
        }
    }

    private static int fib(final int n, final int[] memo) {
        if (n <= 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else if (memo[n] > 0) {
            return memo[n];
        }

        memo[n] = fib(n - 1, memo) + fib(n - 2, memo);
        return memo[n];
    }
}
```

## Example 21

```java
public final class Example21 {

    /**
     * There are log N powers of 2 between 1 and n. Therefore, the runtime is O(log n).
     */
    public static int powersOf2(final int n) {
        if (n == 1) {
            System.out.println(1);
            return 1;
        } else {
            int prev = powersOf2(n / 2);
            int curr = prev * 2;
            System.out.println(curr);
            return curr;
        }
    }
}
```