package Java_Daily.Day11_ArrayList;
import java.util.ArrayList;

public class arraylist2 {
    public static void main(String[] args) {
        // creating 
        ArrayList<String> names = new ArrayList<>();
        // adding elements
        names.add("Sandip");
        names.add("Rudra");
        names.add("Ankit");
        System.out.println("After adding 3 elements array size: " + names.size());
        // accessing elements
        System.out.println("Element at index 1: " + names.get(1));
        System.out.println("Removing element at index 0: " + names.get(0));
        names.remove(0);
        System.out.println("After removing element at index 0,");
        System.out.println("Array size: " + names.size());
        System.out.println("Array elements: " + names);
        // Rudra was at index 1, now should be at index 0
        System.out.println("Element at index 0: " + names.get(0));
    }   
    
}
