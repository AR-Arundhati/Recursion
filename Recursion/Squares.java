public class Squares {
    public static int sumSquares(int n) {
        if (n == 1) {
            return 1;
        }
        return (n * n) + sumSquares(n - 1);
    }

    public static void main(String[] args) {
        int n = 5; // Example input
        System.out.println("Sum of squares of first " + n + " numbers = " + sumSquares(n));
    }
}
