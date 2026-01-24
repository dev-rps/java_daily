package Java_Daily.Day11_ArrayList;
import java.util.ArrayList;

public class arraylist1 {
    public static void main(String[] args) {
        //old way , fixed size array
        System.out.println("-Fixed Size Array-");
        String[] cart = new String[3];
        cart[0] = "Milks";
        cart[1] = "Eggs";
        cart[2] = "Bread";
        //now lets crash it by adding one more item
        //cart[3] = "Butter";
        //ArrayIndexOutOfBoundsException
        for (String item : cart) {
            System.out.println(item);
        }
        //new way , dynamic size array using ArrayList
        System.out.println("\n-Dynamic Size ArrayList-");
        // ArrayList<Type> name = new ArrayList<>();
        ArrayList<String> cartList = new ArrayList<>();
        cartList.add("Milks");
        cartList.add("Eggs");
        cartList.add("Bread");
        cartList.add("Butter"); //no problem
        for (String item : cartList) {
            System.out.println(item);
        }
        //import java.util.Arrays; // Importing the helper to print without loop

        //System.out.println(Arrays.toString(cart)); 
        // Output: [Milk, Eggs, Bread]

        
    }
    
}
