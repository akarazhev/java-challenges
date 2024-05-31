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

## Question 1

```java
public final class Question01 {

    /**
     * The following code computes the product of a and b. What is its runtime?
     * O(b). The for loop just iterates through b.
     */
    public static int product(final int a, final int b) {
        int sum = 0;
        for (int i = 0; i < b; i++) {
            sum += a;
        }

        return sum;
    }
}
```

## Question 2

```java
public final class Question02 {

    /**
     * The following code computes a^b. What is its runtime?
     * O(b). The recursive code iterates through b calls, since it subtracts one at each level.
     */
    public static int power(final int a, final int b) {
        if (b < 0) {
            return 0; // error
        } else if (b == 0) {
            return 1;
        } else {
            return a * power(a, b - 1);
        }
    }
}
```

## Question 3

```java
public final class Question03 {

    /**
     * The following code computes a % b. What is its runtime?
     * O(1). It does a constant amount of work.
     */
    public static int mod(final int a, final int b) {
        if (b <= 0) {
            return -1;
        }

        int div = a / b;
        return a - div * b;
    }
}
```

## Question 4

```java
public final class Question04 {

    /**
     * The following code performs integer division. What is its runtime (assume a and b are both positive)?
     * O(a/b). The variable count will eventually equal a/b. The while loop iterates count times. Therefore,
     * it iterates a/b times.
     */
    public static int div(final int a, final int b) {
        int count = 0;
        int sum = b;
        while (sum <= a) {
            sum += b;
            count++;
        }

        return count;
    }
}
```

## Question 5

```java
public final class Question05 {

    /**
     * The following code computes the [integer] square root of a number. If the number is not a perfect square
     * (there is no integer square root), then it returns -1. It does this by successive guessing. If n is 100,
     * it first guesses 50. Too high? Try something lower - halfway between 1 and SO. What is its runtime?
     * O(log n). This algorithm is essentially doing a binary search to find the square root. Therefore, the runtime is
     * O(log n).
     */
    public static int sqrt(final int n) {
        return sqrtHelper(n, 1, n);
    }

    private static int sqrtHelper(final int n, final int min, final int max) {
        if (max < min) {
            return -1; // no square root
        }

        int guess = (min + max) / 2;
        if (guess * guess == n) { // found it!
            return guess;
        } else if (guess * guess < n) { // too low
            return sqrtHelper(n, guess + 1, max); // try higher
        } else { // too high
            return sqrtHelper(n, min, guess - 1); // try lower
        }
    }
}
```

## Question 6

```java
public final class Question06 {

    /**
     * The following code computes the [integer] square root of a number. If the number is not a perfect square
     * (there is no integer square root), then it returns -1. It does this by trying increasingly large numbers
     * until it finds the right value (or is too high). What is its runtime?
     * O(sqrt(n)). This is just a straightforward loop that stops when guess * guess > n (or, in other words, when
     * guess > sqrt(n)).
     */
    public static int sqrt(final int n) {
        for (int guess = 1; guess * guess <= n; guess++) {
            if (guess * guess == n) {
                return guess;
            }
        }

        return -1;
    }
}
```

## Question 7

If a binary search tree is not balanced, how long might it take (worst case) to find an element in it?
O(n), where n is the number of nodes in the tree. The max time to find an element is the depth tree. The tree could be 
a straight list downwards and have depth n.

## Question 8

You are looking for a specific value in a binary tree, but the tree is not a binary search tree. What is the time complexity of this?
O(n). Without any ordering property on the nodes, we might have to search through all the nodes.

## Question 9

```java
public final class Question09 {

    /**
     * The appendToNew method appends a value to an array by creating a new, longer array and returning this longer array.
     * You've used the appendToNew method to create a copyArray function that repeatedly calls appendToNew.
     * How long does copying an array take?
     * O(n^2), where n is the number of elements in the array. The first call to appendToNew takes 1 copy. The second
     * call takes 2 copies. The third call takes 3 copies. And so on. The total time will be the sum of 1 through n,
     * which is O(n^2).
     */
    public static int[] copyArray(final int[] array) {
        int[] copy = new int[0];
        for (int value : array) {
            copy = appendToNew(copy, value);
        }

        return copy;
    }

    private static int[] appendToNew(final int[] array, final int value) {
        // copy all elements over to new array
        int[] bigger = new int[array.length + 1];
        for (int i = 0; i < array.length; i++) {
            bigger[i] = array[i];
        }

        // add new element
        bigger[bigger.length - 1] = value;
        return bigger;
    }
}
```

## Question 10

```java
public final class Question10 {

    /**
     * The following code sums the digits in a number. What is its big O time?
     * O(log n). The runtime will be the number of digits in the number. A number with d digits can have a value up to
     * 10^d. If n = 10^d, then d = log n. Therefore, the runtime is O(log n).
     */
    public static int sumDigits(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }

        return sum;
    }
}
```

## Question 11

```java
public final class Question11 {

    public static int numChars = 26;

    /**
     * The following code prints all strings of length k where the characters are in sorted order. It does this by
     * generating all strings of length k and then checking if each is sorted. What is its runtime?
     * O(kc^k), where k is the length of the string and c is the number of characters in the alphabet. It takes O(c^k)
     * time to generate each string. Then, we need to check that each of these is sorted, which takes O(k) time.
     */
    public static void printSortedStrings(final int remaining) {
        printSortedStrings(remaining, "");
    }

    private static void printSortedStrings(final int remaining, final String prefix) {
        if (remaining == 0) {
            System.out.println(prefix);
        } else {
            for (int i = 0; i < numChars; i++) {
                char c = ithLetter(i);
                printSortedStrings(remaining - 1, prefix + c);
            }
        }
    }

    private static boolean isInOrder(final String s) {
        for (int i = 1; i < s.length(); i++) {
            int prev = ithLetter(s.charAt(i - 1));
            int curr = ithLetter(s.charAt(i));
            if (prev > curr) {
                return false;
            }
        }

        return true;
    }

    private static char ithLetter(final int i) {
        return (char) (((int) 'a') + i);
    }
}
```

## Question 12

```java
public final class Question12 {

    private static int binarySearch(final int[] a, final int x) {
        int low = 0;
        int high = a.length - 1;
        int mid;
        while (low <= high) {
            mid = (low + high) / 2;
            if (a[mid] < x) {
                low = mid + 1;
            } else if (a[mid] > x) {
                high = mid - 1;
            } else {
                return mid;
            }
        }

        return -1;
    }

    private static void mergesort(final int[] array) {
        int[] helper = new int[array.length];
        mergesort(array, helper, 0, array.length - 1);
    }

    private static void mergesort(final int[] array, final int[] helper, final int low, final int high) {
        if (low < high) {
            int middle = (low + high) / 2;
            mergesort(array, helper, low, middle); // Sort left half
            mergesort(array, helper, middle + 1, high); // Sort right half
            merge(array, helper, low, middle, high); // Merge them
        }
    }

    private static void merge(final int[] array, final int[] helper, final int low, final int middle, final int high) {
        /* Copy both halves into a helper array */
        for (int i = low; i <= high; i++) {
            helper[i] = array[i];
        }

        int helperLeft = low;
        int helperRight = middle + 1;
        int current = low;
        /* Iterate through helper array. Compare the left and right
         * half, copying back the smaller element from the two halves
         * into the original array. */
        while (helperLeft <= middle && helperRight <= high) {
            if (helper[helperLeft] <= helper[helperRight]) {
                array[current] = helper[helperLeft];
                helperLeft++;
            } else { // If right element is smaller than left element
                array[current] = helper[helperRight];
                helperRight++;
            }
            current++;
        }
        /* Copy the rest of the left side of the array into the
         * target array */
        int remaining = middle - helperLeft;
        for (int i = 0; i <= remaining; i++) {
            array[current + i] = helper[helperLeft + i];
        }
    }

    /**
     * The following code computes the intersection (the number of elements in common) of two arrays.
     * It assumes that neither array has duplicates. It computes the intersection by sorting one array (array b) and
     * then iterating through array a checking (via binary search) if each value is in b. What is its runtime?
     * O(b log b + a log b). First, we have to sort array b,which takes O(b log b) time.Then, for each element in a,
     * we do binary search in O(log b) time. The second part takes O(a log b) time.
     */
    public static int intersection(final int[] a, final int[] b) {
        mergesort(b);
        int intersect = 0;
        for (int x : a) {
            if (binarySearch(b, x) >= 0) {
                intersect++;
            }
        }

        return intersect;
    }
}
```