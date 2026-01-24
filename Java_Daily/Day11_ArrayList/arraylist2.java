package Java_Daily.Day11_ArrayList;
import java.util.ArrayList;

public class arraylist2 {
    public static void main(String[] args) {
        // Create an ArrayList of Integers
        ArrayList<Integer> numbers = new ArrayList<>();

        // Add elements to the ArrayList
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        // Print the original ArrayList
        System.out.println("Original ArrayList: " + numbers);

        // Remove an element by index (e.g., remove the element at index 2)
        int removedElement = numbers.remove(2);
        System.out.println("Removed element at index 2: " + removedElement);

        // Print the ArrayList after removal
        System.out.println("ArrayList after removal: " + numbers);

        // Update an element at a specific index (e.g., update index 1 to 25)
        numbers.set(1, 25);
        System.out.println("Updated element at index 1 to 25.");

        // Print the final ArrayList
        System.out.println("Final ArrayList: " + numbers);
    }   
    
}
