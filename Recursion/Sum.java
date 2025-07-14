import java.util.Scanner;

public class Sum {
    static int sumArray(int[] arr, int n) {
        if (n <= 0) return 0;
        return sumArray(arr, n - 1) + arr[n - 1];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter N: ");
        int n = sc.nextInt();
        
    }
}
