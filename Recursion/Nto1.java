public class Nto1 {
    static void printNto1(int n) {
        if (n == 0){
            return;
        }   
        System.out.println(n);
        printNto1(n - 1);
    }
    public static void main(String[] args) {
        int n = 5; // You can change N to any number you like
        System.out.println("N to 1 numbers:" + n);
        printNto1(n);
}
}
