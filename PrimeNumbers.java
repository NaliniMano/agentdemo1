/**
 * Prime Numbers Generator
 * 
 * Problem: Find all prime numbers up to N
 * Example: Prime numbers up to 10 are [2, 3, 5, 7]
 * 
 * Approach: Optimized Trial Division
 * 1. Check divisibility only up to square root of n
 * 2. Only check odd numbers after 2
 * 
 * Time Complexity: O(n * sqrt(n)) for finding all primes up to n
 * Space Complexity: O(1) excluding the output space
 * 
 * Better Approach for Large Numbers:
 * - Sieve of Eratosthenes: O(n*log(log(n)))
 * - Segmented Sieve for very large numbers
 * 
 * Note: Current implementation is good for interviews and small numbers
 */
public class PrimeNumbers {
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    
    public static void printPrimesUpTo(int n) {
        System.out.println("Prime numbers up to " + n + ":");
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int limit = 50;
        printPrimesUpTo(limit);
    }
}
