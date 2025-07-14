import java.util.Scanner;

public class product {
    static int productN(int n) {
        if (n == 0) return 1;
        return n * productN(n - 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter N: ");
        int n = sc.nextInt();
        productN(n);
    }
}
