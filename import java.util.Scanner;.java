import java.util.Scanner;

public class ReverseString {

    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a string: ");

        // Read the input string from the user
        String inputString = scanner.nextLine();

        // Close the Scanner to avoid resource leak
        scanner.close();

        // Call the reverseString function to reverse the input string
        String reversedString = reverseString(inputString);

        // Print the reversed string
        System.out.println("Reversed string: " + reversedString);
    }

    // Function to reverse a given string
    private static String reverseString(String input) {
        // Convert the input string to a character array
        char[] charArray = input.toCharArray();

        // Initialize two pointers for swapping characters
        int start = 0;
        int end = charArray.length - 1;

        // Swap characters from the start and end until they meet in the middle
        while (start < end) {
            // Swap characters at the start and end indices
            char temp = charArray[start];
            charArray[start] = charArray[end];
            charArray[end] = temp;

            // Move the pointers towards the middle
            start++;
            end--;
        }

        // Convert the character array back to a string
        return new String(charArray);
    }
}
