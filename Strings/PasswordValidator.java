package Strings;

import java.util.Scanner;

public class PasswordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your password: ");
        String password = scanner.nextLine();
        scanner.close();
        // Check password length
        if (password.length() < 8 || password.length() > 12) {
            System.out.println("Invalid password: Length must be between 8 and 12 characters.");
            return;
        }

        int digitCount = 0;
        int specialSymbolCount = 0;

        // Check for digits and special symbols
        for (char ch : password.toCharArray()) {
            if (ch >= '0' && ch <= '9') {
                digitCount++;
            } else if (!Character.isLetterOrDigit(ch)) {
                specialSymbolCount++;
            }
        }

        // Final validation
        if (digitCount >= 2 && specialSymbolCount >= 1) {
            System.out.println("Valid password.");
        } else {
            System.out.println("Invalid password: Must contain at least 2 digits and 1 special symbol.");
        }
   }
}
