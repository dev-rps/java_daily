package Java_Daily.Day10_Memory_Visualizer;
//recursion example to visualize memory usage
//recursion limits
// frame one at the bottom of stack
public class memory1 { 
    public static void main(String[] args) {
        System.out.println("Lets the recursion begin...");
        // calling the recursive method
        // creates new frame in stack memory
        printNumbers(1);
    }
    public static void printNumbers(int n) {
        System.out.println(n);
        // recursive call
        // again creates new frame in stack memory
        printNumbers(n + 1);
    }
    //at the end it crashes with StackOverflowError
    // because each for each frame a container in ram is created to store variables
    // and after a certain limit the memory is full and it crashes
    
}
