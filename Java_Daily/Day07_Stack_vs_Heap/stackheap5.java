package Java_Daily.Day07_Stack_vs_Heap;

public class stackheap5 {
    public static void main(String[] args) {
        
    // 1. creating an object on the Heap
        // 's1' points to "I am useful data"
        String s1 = new String("I am useful data");
        System.out.println("Step 1: " + s1);

        // 2. setting the reference to null
        // logic: The link is broken. The String object still exists in Heap,
        // but NO ONE can reach it anymore. 
        s1 = null; 
        
        // AT THIS EXACT MOMENT, the "I am useful data" object is eligible for GC.
        System.out.println("Step 2: Reference is now null.");
        System.out.println("s1 points to: " + s1);


        // 3. Reassigning (Another way to create garbage)
        String s2 = new String("Object A");
        String s3 = new String("Object B");

        // Now s2 drops "Object A" and points to "Object B" instead.
        s2 = s3; 
        
        // "Object A" is now stranded on the Heap with no reference. 
        // It is now eligible for Garbage Collection.
        
        System.out.println("Step 3: Object A has been abandoned.");
        System.out.println("s2 now points to: " + s2);
        System.out.println("s3 points to: " + s3);
        System.out.println("We lost reference to \"I am useful data\" and \"Object A\" objects.");
    }
    
}
