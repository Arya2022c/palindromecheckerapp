public class PalindromeCheckerApp {

    public static void main(String[] args) {
        String input = "madam";
        String reversed = "";

        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i);
        }

        System.out.println("Original: " + input);
        System.out.println("Reversed: " + reversed);

        if (input.equalsIgnoreCase(reversed)) {
            System.out.println("Result: Palindrome");
        } else {
            System.out.println("Result: Not a Palindrome");
        }
    }
}
