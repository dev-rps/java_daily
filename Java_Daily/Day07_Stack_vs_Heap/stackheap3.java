package Java_Daily.Day07_Stack_vs_Heap;

public class stackheap3 {
    public static void main(String[] args) {
        // ==========================================
        // 1. STACK MEMORY
        // ==========================================
        // WHAT GOES HERE: Primitive variables (int, double, boolean) and Method calls.
        // LIFETIME: Short. Destroyed as soon as the closing curly brace '}' is reached.
        // SPEED: Very Fast (LIFO - Last In, First Out).
        
        // [A primitive variable example here]
        int simpleNumber = 50; 
        System.out.println("Stack: " + simpleNumber);


        // ==========================================
        // 2. HEAP MEMORY
        // ==========================================
        // WHAT GOES HERE: Objects (anything created with 'new').
        // LIFETIME: Long. Lives until 'Garbage Collector' deletes it.
        // SPEED: Slower. Requires complex memory management.
        
        // [Write an Object creation example here]
        // 'arr' is the Reference (lives on Stack)
        // '{1, 2, 3}' is the Object (lives on Heap)
        int[] data = new int[] {1, 2, 3}; 
        System.out.println("Heap Reference: " + data);
        System.out.println("Heap Object first element: " + data[0]);


        // ==========================================
        // 3. THE "LINK" (Reference)
        // ==========================================
        // The variable 'data' above acts as a remote control.
        // It sits on the Stack but points to the Heap.
    }
    
}
