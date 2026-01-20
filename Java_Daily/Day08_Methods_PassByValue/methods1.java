package Java_Daily.Day08_Methods_PassByValue;

public class methods1 {
    public static void main(String[] args) {
        // Creating a variable in main method. It lives in main method's stack frame
        int salary = 5000;
        System.out.println("1. Main: original salary: " + salary);
        // Calling addBonus method and passing salary variable to it. Copy of Salary.
        addBonus(salary);
        //Stack paused main and goes to addBonus method
        // HYPOTHESIS: If Stack memory is separate, this should still be 5000.
        System.out.println("4. Main: salary after method call: " + salary);

    }
    // this method recieves a copy of salary variable
    // salary variable lives in addBonus method's stack frame
    public static void addBonus(int salary) {
        // modifying the copy of salary variable
        salary = salary + 1000;
        System.out.println("2. Method : I added bonus, new salary: " + salary);
        System.out.println("3. Method : Ending salary value: " + salary);
        // when this method ends, its stack frame is destroyed
        
    }
    // so stack frames are separate and changes made in one method do not affect the other
    // this is called Pass By Value
    
}
