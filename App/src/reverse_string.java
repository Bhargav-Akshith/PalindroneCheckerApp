import java.util.Scanner;
public class reverse_string{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter a string to checkout palindrome:");
        String input_string=sc.nextLine();

        String reversed_string="";
        for(int i = input_string.length()-1;i>=0;i--){
            reversed_string=reversed_string+input_string.charAt(i);

        }
        if(input_string.equals(reversed_string)){
            System.out.println("The given string is palindrome.");

        }else{
            System.out.println("The entered string is not a palindrome.");
        }
        sc.close();
    }
}

