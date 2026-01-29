package Java_Daily.Day14_Wrapper_Classes;

public class wrapclass1 {
    public static void main(String[] args) {
        // primitive raw values
        // lives in stacks so they are faster
        // no methods 
        int numPrimitive = 143;
        // wrapper class
        // lives in heap 
        // wraps the value inside the object - variable gives the address
        Integer numObject = 1432;
        System.out.println("Primitive: " + numPrimitive);
        System.out.println("Wrapper: " + numObject);
        // difference - methods !
        // special built in features of wrappers 
        String text = numObject.toString();
        double decimal = numObject.doubleValue();
        //String text = numPrimitive.toString(); not allowed !
        System.out.println("Wrapper as double: " + decimal);
        // null safety
        // primitives can not be null like, int x = null;
        Integer y = null;
        System.out.println("Null Wrapper: " + y);
    }
    //int = 4 bytes
    //Integer = 16-24 bytes
    
}
