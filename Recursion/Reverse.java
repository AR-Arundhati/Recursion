public class Reverse {
    public static void printReverse(int n) {
        if (n == 0) {
            return;
        }
        System.out.print(n % 10);
        printReverse(n / 10);
    }

    public static void main(String[] args) {
        int number = 1234; // Example input
        System.out.print("Reversed number = ");
        printReverse(number);
    }
}
