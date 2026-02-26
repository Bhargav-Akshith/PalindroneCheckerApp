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

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        Stack<Character> stack = new Stack<>();

        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        boolean isPalindrome = true;

        for (char c : input.toCharArray()) {
            if (c != stack.pop()) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println("input: " + input);
        System.out.println("is palindrome? " + isPalindrome);

        sc.close();
    }
}

