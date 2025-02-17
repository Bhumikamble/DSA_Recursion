import java.util.*;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String str = sc.nextLine();
        sc.close();
        System.out.println(isPalindrome(str, 0, str.length() - 1) ? "Palindrome" : "Not a Palindrome");
    }

    static boolean isPalindrome(String str, int i, int n) {
        if (i >= n) 
        return true; 
        return (str.charAt(i) == str.charAt(n)) && isPalindrome(str, i + 1, n - 1);
    }
}
