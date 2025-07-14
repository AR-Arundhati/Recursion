import java.util.Scanner;

public class elements {
    static void printArray(int[] arr, int n) {
        if (n <= 0) return;
        printArray(arr, n - 1);
        System.out.print(arr[n - 1] + " ");
    }
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter N: ");
        int n = sc.nextInt();
     }
}
