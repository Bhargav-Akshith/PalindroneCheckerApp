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
import java.util.Stack;
import java.util.ArrayDeque;
import java.util.Deque;

// Strategy Interface
interface PalindromeStrategy {
    boolean checkPalindrome(String input);
}

// Stack-based Strategy
class StackStrategy implements PalindromeStrategy {

    public boolean checkPalindrome(String input) {

        String normalized = input.replaceAll("\\s+", "").toLowerCase();

        Stack<Character> stack = new Stack<>();

        for (char c : normalized.toCharArray()) {
            stack.push(c);
        }

        for (char c : normalized.toCharArray()) {
            if (c != stack.pop()) {
                return false;
            }
        }

        return true;
    }
}

// Deque-based Strategy
class DequeStrategy implements PalindromeStrategy {

    public boolean checkPalindrome(String input) {

        String normalized = input.replaceAll("\\s+", "").toLowerCase();

        Deque<Character> deque = new ArrayDeque<>();

        for (char c : normalized.toCharArray()) {
            deque.add(c);
        }

        while (deque.size() > 1) {
            if (deque.removeFirst() != deque.removeLast()) {
                return false;
            }
        }

        return true;
    }
}

// Main Application
public class PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string:");
        String input = scanner.nextLine();

        System.out.println("Choose Strategy:");
        System.out.println("1. Stack Strategy");
        System.out.println("2. Deque Strategy");

        int choice = scanner.nextInt();

        PalindromeStrategy strategy;

        if (choice == 1) {
            strategy = new StackStrategy();
        } else {
            strategy = new DequeStrategy();
        }

        boolean result = strategy.checkPalindrome(input);

        if (result) {
            System.out.println("The given string is a palindrome.");
        } else {
            System.out.println("The given string is NOT a palindrome.");
        }

        scanner.close();
    }
}