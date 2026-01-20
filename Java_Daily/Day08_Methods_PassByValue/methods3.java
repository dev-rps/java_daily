package Java_Daily.Day08_Methods_PassByValue;

public class methods3 {
    public static void main(String[] args) {
        //2. Creating the object (Heap memory) 
        Person student = new Person();
        student.name = "Rudra";
        System.out.println("1. Main: Original name: " + student.name);
        // 3. Passing the reference (copy of the reference) to the method
        changeName(student);
        System.out.println("3. Main: Name after method call: " + student.name);
    }
    public static void changeName(Person p) {
        // p is a copy of the reference to the same Person object in Heap
        // p is a new variable in this method's stack frame
        // but it points to the same object in Heap memory
        System.out.println("2. Method: Changing name from " + p.name + " to Arya");
        // this will change the name in the original object
        p.name = "Arya";

    }   
    
}
// 1. Define the Object structure
class Person {
        String name;
    }
