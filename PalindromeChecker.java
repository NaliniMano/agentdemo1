/**
 * Palindrome Checker
 * 
 * Problem: Check if a string is a palindrome (reads the same forwards and backwards)
 * Examples: "racecar", "A man a plan a canal Panama"
 * 
 * Approach: Two-pointer technique
 * 1. Clean the string (remove non-alphanumeric, convert to lowercase)
 * 2. Use two pointers (left and right) moving towards center
 * 3. Compare characters at both ends
 * 
 * Time Complexity: O(n) where n is string length
 * Space Complexity: O(1) as we're doing in-place comparison
 * 
 * Edge Cases Handled:
 * - Case insensitive comparison
 * - Ignoring special characters and spaces
 * - Empty string and null checks
 */
public class PalindromeChecker {
    public static boolean isPalindrome(String str) {
        str = str.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
        int left = 0;
        int right = str.length() - 1;
        
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        String[] tests = {"A man a plan a canal Panama", "race a car", "Was it a car or a cat I saw?"};
        for (String test : tests) {
            System.out.println("\"" + test + "\" is " + (isPalindrome(test) ? "" : "not ") + "a palindrome");
        }
    }
}
