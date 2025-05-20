/**
 * Fibonacci Sequence Generator
 * 
 * Problem: Generate the nth Fibonacci number where each number is the sum of the previous two
 * Example: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, ...
 * 
 * Current Implementation: Recursive approach
 * Time Complexity: O(2^n) - exponential due to recursive calls
 * Space Complexity: O(n) due to recursive call stack
 * 
 * Note: This implementation is not optimal for large numbers.
 * Better approaches:
 * 1. Iterative (O(n) time, O(1) space)
 * 2. Dynamic Programming with memoization
 * 3. Matrix exponentiation for very large numbers
 */
public class Fibonacci {
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        int n = 10;
        System.out.println("First " + n + " Fibonacci numbers:");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }
}
