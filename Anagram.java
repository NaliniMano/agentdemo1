/**
 * Anagram Checker
 * 
 * Problem: Check if two strings are anagrams (same characters in different order)
 * Examples: "listen" and "silent", "triangle" and "integral"
 * 
 * Approach: Character counting using array
 * 1. Create count array for ASCII chars
 * 2. Increment count for first string's chars
 * 3. Decrement count for second string's chars
 * 4. Check if all counts are zero
 * 
 * Time Complexity: O(n) where n is length of strings
 * Space Complexity: O(1) - fixed size array (256 chars)
 * 
 * Alternative Approaches:
 * 1. Sort both strings and compare - O(nlogn)
 * 2. Use HashMap for counting - more flexible but more space
 */
public class Anagram {
    public static boolean isAnagram(String str1, String str2) {
        if (str1 == null || str2 == null || str1.length() != str2.length()) {
            return false;
        }
        
        int[] charCount = new int[256];
        
        for (int i = 0; i < str1.length(); i++) {
            charCount[str1.charAt(i)]++;
            charCount[str2.charAt(i)]--;
        }
        
        for (int count : charCount) {
            if (count != 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String[][] testCases = {
            {"listen", "silent"},
            {"hello", "world"},
            {"triangle", "integral"}
        };
        
        for (String[] test : testCases) {
            System.out.printf("\"%s\" and \"%s\" are %s anagrams%n", 
                test[0], test[1], 
                isAnagram(test[0], test[1]) ? "" : "not");
        }
    }
}
