public class OnetoN {
    static void print1toN(int n) {
        if (n == 0) return;
        print1toN(n - 1);
        System.out.print(n + " ");
    }
    public static void main(String[] args) {
        int N = 5; // You can change N to any number you like
        print1toN(N);
}
}