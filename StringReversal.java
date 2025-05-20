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
