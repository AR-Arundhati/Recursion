import java.util.Scanner;

public class Nnumbers {
      static int sumN(int n) {
        if (n == 0) return 0;
        return n + sumN(n - 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter N: ");
        int n = sc.nextInt();
        sumN(n);
    }
}
