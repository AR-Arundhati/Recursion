public class Elements {
    public static void printElements(int[] arr, int index) {
        if (index == arr.length) {
            return;
        }
        System.out.print(arr[index] + " ");
        printElements(arr, index + 1);
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50}; // Example input
        printElements(arr, 0);
    }
}
