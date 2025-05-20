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
