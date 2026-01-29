package Java_Daily.Day14_Wrapper_Classes;

public class wrapclass2 {
    public static void main(String[] args) {
        //autoboxing
        //behind the scenes - Integer boxed = Integer.valueof(50);
        Integer boxed = 50;
        System.out.println("Boxed value: " + boxed);
        //unboxing
        // bts - int raw = boxed.intValue();
        int raw = boxed;
        System.out.println("Raw value: " + raw);
        // mixed math
        // auto unboxing by java
        int cal = boxed * 2;
        System.out.println("math Result: " + cal);
    }
    
}
