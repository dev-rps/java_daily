package Java_Daily.Day08_Methods_PassByValue;

public class methods5 {
    public static void main(String[] args) {
        
        // ==========================================================
        // THE GOLDEN RULE: Java is ALWAYS "Pass-by-Value"
        // ==========================================================
        // This means Java ALWAYS copies the variable before passing it.
        // It never passes the actual "container," only the contents.

        
        // ==========================================================
        // 1. PRIMITIVES (int, double, boolean)
        // ==========================================================
        // The "Value" is the actual data (e.g., 5, 10.5, true).
        // BEHAVIOR: You get a photocopy of the number.
        // RESULT: Safe. The method cannot touch your original variable.
        int x = 10;
        modifyPrimitive(x); // Passes a COPY of 10.
        // x is still 10.
        System.out.println("x after modifyPrimitive: " + x); // Outputs 10


        // ==========================================================
        // 2. OBJECTS / REFERENCES (String, Arrays, Custom Classes)
        // ==========================================================
        // The "Value" is the ADDRESS (the Remote Control).
        // It is NOT the object itself.
        
        // BEHAVIOR: You get a photocopy of the REMOTE CONTROL.
        // RESULT: 
        //   - If you use the remote to change channel (.name = "Bob"), it changes.
        //   - If you throw the remote away (p = new Person()), my remote is safe.
        
        Person p = new Person();
        modifyObject(p); // Passes a COPY of the address (e.g., @15db9742)
        System.out.println("p.name after modifyObject: " + p.name); // Outputs "Changed"
    }

    public static void modifyPrimitive(int num) {
        num = 999; // Only changes the local copy.
    }

    public static void modifyObject(Person ref) {
        // MUTATION (Side Effect) - Affects Original
        ref.name = "Changed"; 
        
        // REASSIGNMENT (Trap) - Does NOT affect Original
        ref = new Person(); 
        ref.name = "New Object";
    }
    
}
// ==========================================================
//  COMMON INTERVIEW MYTH
// ==========================================================
// MYTH: "Primitives are pass-by-value, Objects are pass-by-reference."
// FACT: NO. Objects are "Pass-by-Reference-Value."
//       We pass a COPY of the reference. We do not pass the memory slot itself.
