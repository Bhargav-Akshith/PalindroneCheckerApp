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

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.print("Input : ");
        String input=sc.nextLine();

        char[] chars=input.toCharArray();

        int start=0;
        int end=chars.length - 1;

        boolean isPalindrome=true;

        while(start<end){
            if (chars[start]!=chars[end]) {
                isPalindrome=false;
                break;
            }
            start++;
            end--;
        }

        System.out.println("Is Palindrome?"+isPalindrome);

        sc.close();
    }
}