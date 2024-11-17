package javatasks_guvi;

import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();
        
        // Convert the string to lowercase to make the check case-insensitive
        inputString = inputString.toLowerCase();
        
        // Initialize a flag to true
        boolean isPalindrome = true;
        
        // Check characters from both ends using a for loop
        for (int i = 0; i < inputString.length() / 2; i++) {
            if (inputString.charAt(i) != inputString.charAt(inputString.length() - 1 - i)) {
                isPalindrome = false;
                break; // Exit the loop if mismatch is found
            }
        }
        
        // Use if-else statement to print the result
        if (isPalindrome) {
            System.out.println("The string is a palindrome.");
        } 
        else {
            System.out.println("The string is not a palindrome.");
        }
        
        // Close the scanner
        scanner.close();
    }
}
