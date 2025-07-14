import java.util.Scanner;

public class Even {
    static void printEven(int n) {
        if (n <= 0) return;
        printEven(n - 1);
        if (n % 2 == 0) System.out.print(n + " ");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter N: ");
        int n = sc.nextInt();
        printEven(n);
    }
    
}
