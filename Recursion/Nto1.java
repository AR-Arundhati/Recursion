public class Nto1 {
    static void printNto1(int n) {
        if (n == 0) return;
        System.out.print(n + " ");
        printNto1(n - 1);
    }
    public static void main(String[] args) {
        int N = 5; // You can change N to any number you like
        printNto1(N);
}
}
