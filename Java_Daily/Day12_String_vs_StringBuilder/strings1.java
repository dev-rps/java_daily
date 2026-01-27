package Java_Daily.Day12_String_vs_StringBuilder;

public class strings1 {
    public static void main(String[] args) {
         //creating the first object
         String text = "Java";
         System.out.println("Original String: " +text);
         System.out.println("Memory address = " + System.identityHashCode(text));
         // trying to modify it (concatenation)
         //actually java creates a new object and old one is abandoned 
         text = text + " is FUN! ";
         //new object created in heap
         System.out.println("\nModified String: " + text);
         System.out.println("New Memory Address = " + System.identityHashCode(text));
         text = text + "Really";
         System.out.println("\nFinal String: " + text);
         System.out.println("New Memory Address:  " + System.identityHashCode(text));
        //3 different addresses means 3 different objects
    }
    
}
