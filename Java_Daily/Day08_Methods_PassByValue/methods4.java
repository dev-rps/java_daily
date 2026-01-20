package Java_Daily.Day08_Methods_PassByValue;

public class methods4 {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.name = "Rudra";
        
        System.out.println("1. Main name (Before): " + p1.name);

        // We pass the reference (Copy of the Remote Control)
        tryToReplace(p1);

        // HYPOTHESIS: Did p1 change to Bob? Or stay Rudra?
        System.out.println("3. Main (After): " + p1.name);
    }

    public static void tryToReplace(Person p) {
        // TRAP: We are NOT changing p.name.
        // We are pointing 'p' to a completely NEW object in the Heap.
        p = new Person(); 
        p.name = "Bob";
        
        System.out.println("   2. Method: I created a new person named " + p.name);
        
        // When this method ends, this 'p' (and the new Bob object) are lost!
    }
    
}
// Define the class once (or reuse the one from the previous file if in same package)
class Person {
    String name;
}
