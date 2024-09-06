import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
        scanner.close();
        
        boolean isPalindrome = isPalindrome(str);
        if (isPalindrome) {
            System.out.println(str + " is a palindrome.");
        } else {
            System.out.println(str + " is not a palindrome.");
        }
    }

    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;
        
        // Continue checking characters from both ends until they meet in the middle
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false; // If characters at current positions don't match, it's not a palindrome
            }
            left++;
            right--;
        }
        return true; // If the loop completes without returning false, it's a palindrome
    }
}
