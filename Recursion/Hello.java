public class Hello {
    
    static void printHello(int n) {
        if (n == 0) return; // base case
        System.out.println("Hello my dear");
        printHello(n - 1);  // recursive call
    }

    public static void main(String[] args) {
        int N = 5; // You can change N to any number you like
        printHello(N);
    }
}
