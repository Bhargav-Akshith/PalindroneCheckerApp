/**
 * ====================================================
 * MAIN CLASS -UseCase2PalindromeCheckerApp
 * ====================================================
 *
 * Use Case 2: Hardcoded Palindrome Validation
 *
 * Description:
 * This class demonstrates basic palindrome validation
 * using a hardcoded string value.
 *
 * At this stage,the application:
 * - Stores a predefined string
 * - Compares charactyers from both ends
 * - Determines whether the string is a palindrome
 * -Display the results on the console
 *
 * This use case introduces fundamental comparison logic
 * before using advanced data structures.
 *
 * @author
 * @version 4.
 *
 */

import java.util.Scanner;

// Service class that encapsulates palindrome logic
class PalindromeChecker {

    // Method to check whether a string is palindrome
    public boolean checkPalindrome(String input) {

        // Normalize the string
        String normalized = input.replaceAll("\\s+", "").toLowerCase();

        char[] arr = normalized.toCharArray();

        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            if (arr[start] != arr[end]) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }
}

// Main Application Class
public class PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string:");
        String input = scanner.nextLine();

        // Create object of PalindromeChecker
        PalindromeChecker checker = new PalindromeChecker();

        boolean result = checker.checkPalindrome(input);

        if (result) {
            System.out.println("The given string is a palindrome.");
        } else {
            System.out.println("The given string is NOT a palindrome.");
        }

        scanner.close();
    }
}