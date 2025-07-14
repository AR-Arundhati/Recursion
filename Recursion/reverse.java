import java.util.Scanner;

public class reverse {
    static void printReverse(int n) {
        if (n == 0) return;
        System.out.print(n % 10);
        printReverse(n / 10);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter N: ");
        int n = sc.nextInt();
        printReverse(n);
    }
}
