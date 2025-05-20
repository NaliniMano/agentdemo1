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
