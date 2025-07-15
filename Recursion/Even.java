public class Even {
    public static void printEven(int n) {
        if (n < 2) {
            return;
        }
        printEven(n - 1);
        if (n % 2 == 0) {
            System.out.print(n + " ");
        }
    }

    public static void main(String[] args) {
        int n = 10; // Example input
        printEven(n);
    }
}