public class Digits {
    public static int sumDigits(int n) {
        if (n == 0) {
            return 0;
        }
        return (n % 10) + sumDigits(n / 10);
    }

    public static void main(String[] args) {
        int number = 1234; // Example input
        System.out.println("Sum of digits = " + sumDigits(number));
    }
}

