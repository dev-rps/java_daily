package Java_Daily.Day07_Stack_vs_Heap;

public class stackheap4 {
    static int counter = 0;
    public static void main(String[] args) {
        System.out.println("-Starting Dangerous Loop-");
        recursiveMethod();
    }
    public static void recursiveMethod() {
        counter++;
        System.out.println("Recursion depth: " + counter);
        // WARNING: This will eventually cause a StackOverflowError
        // THE BUG: Calling the same method again with NO way to stop.
        recursiveMethod();
    }
    
}
