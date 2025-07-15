public class Count {
    public static int countDigits(int n) {
        if (n == 0) {
            return 0;
        }
        return 1 + countDigits(n / 10);
    }

    public static void main(String[] args) {
        int number = 12345; // Example input
        System.out.println("Number of digits = " + countDigits(number));
    }
}
