package javatasks_guvi;

import java.util.*;

public class StarPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number of Rows :");
        int n = scanner.nextInt();
        scanner.close();

        // Ensure n is an odd number for a symmetric X pattern
        if (n % 2 == 0) {
            System.out.println("Please enter an odd number.");
            return;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                // Print '*' if it is on either diagonal
                if (j == i || j == n - 1 - i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
