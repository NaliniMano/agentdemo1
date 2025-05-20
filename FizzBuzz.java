/**
 * FizzBuzz - Classic Interview Question
 * 
 * Problem: Print numbers from 1 to n, but:
 * - For multiples of 3, print "Fizz"
 * - For multiples of 5, print "Buzz"
 * - For multiples of both 3 and 5, print "FizzBuzz"
 * 
 * Example Output for n=15:
 * 1, 2, Fizz, 4, Buzz, Fizz, 7, 8, Fizz, Buzz, 11, Fizz, 13, 14, FizzBuzz
 * 
 * Approach: Simple conditional checks
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 * 
 * Interview Tips:
 * - Discuss extensibility (what if we add more rules?)
 * - Consider string concatenation vs string builder
 * - Think about divisibility rule optimization
 */
public class FizzBuzz {
    public static void fizzBuzz(int n) {
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("FizzBuzz from 1 to 15:");
        fizzBuzz(15);
    }
}
