package Java_Daily.Day14_Wrapper_Classes;

import java.util.ArrayList;

public class wrapclass3 {
    public static void main(String[] args) {
        // we cant use arraylist with primitives
        // ArrayList<int> =  new ArrayList<>(); wrong!
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        System.out.println("Initial Numbers: " +numbers);
        // math reading
        int firstVal = numbers.get(0);
        System.out.println("First value + 5 = " + (firstVal + 5));
        // removing 
        // ways - removing by index or value
        numbers.remove(1);
        numbers.add(40);
        System.out.println("Final Numbers" +numbers);
        numbers.remove(Integer.valueOf(30));
        System.out.println("Modified: "+numbers);

    }
    
}
