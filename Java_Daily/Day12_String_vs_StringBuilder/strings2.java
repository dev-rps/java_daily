package Java_Daily.Day12_String_vs_StringBuilder;

public class strings2 {
    public static void main(String[] args) {
         //creating the mutable object
         StringBuilder sb = new StringBuilder("Java");
         System.out.println("Original text: " + sb);
         System.out.println("Orignal memory address: " + System.identityHashCode(sb));
         //modifying it
         //this time it will not create a new object
         sb.append(" is Fast");
         System.out.println("Modified Text: " + sb);
         System.out.println("Now the memory address: " + System.identityHashCode(sb));
         sb.append(" really !");
         System.out.println("Modified Text final: " + sb);
         System.out.println("finally the memory address: " + System.identityHashCode(sb));
         String finalString = sb.toString(); 
    }
    
}
