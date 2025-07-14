import java.util.Scanner;

public class palindrome {
    static boolean isPalindrome(int n, int temp, int rev) {
        if (n == 0) return (temp == rev);
        rev = rev * 10 + n % 10;
        return isPalindrome(n / 10, temp, rev);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter N: ");
        int n = sc.nextInt();
        
    }
}
