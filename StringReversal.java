/**
 * String Reversal - Common interview question
 * 
 * Problem: Reverse a given string
 * Approach: Use StringBuilder for efficient string manipulation
 * Time Complexity: O(n) where n is the length of the string
 * Space Complexity: O(n) to store the reversed string
 * 
 * Alternative approaches (not implemented):
 * 1. Convert to char array and swap
 * 2. Use two pointers from start and end
 * 3. Use recursion (but less efficient)
 */
public class StringReversal {
    public static String reverse(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }
        StringBuilder reversed = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed.append(str.charAt(i));
        }
        return reversed.toString();
    }

    public static void main(String[] args) {
        String test = "Hello, World!";
        System.out.println("Original: " + test);
        System.out.println("Reversed: " + reverse(test));
    }
}
