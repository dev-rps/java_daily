package Java_Daily.Day14_Wrapper_Classes;

public class wrapclass4 {
    public static void main(String[] args) {
        // primitive nature
        // int x = null; not applicable
        // they cannot be null
        // wrapper are objects like boxes it can be empty
        Integer y = null;
        System.out.println("Wrapper Value: " + y);
        //Dangerous unboxing
        System.out.println("trying to unboxing null....");
        try {
            @SuppressWarnings("null")
            int z = y;
        }   catch (NullPointerException e) {
            System.out.println("Boom! null pointer exception occured!");
            System.out.println("we cannot turn 'null' into a number");

        }
    }
    
}
