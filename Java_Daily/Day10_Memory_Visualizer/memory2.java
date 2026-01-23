package Java_Daily.Day10_Memory_Visualizer;

public class memory2 {
    public static void main(String[] args) {
        System.out.println("Recursion with base case...");
        printNumbers(10000);
    }
    public static void printNumbers(int n) {
        if (n == 0) {
            System.out.println("BOOOOM!");
            return;
        }
        System.out.println(n);
        printNumbers(n - 1);

    }
    
}
