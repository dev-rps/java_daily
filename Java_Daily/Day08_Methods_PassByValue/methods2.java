package Java_Daily.Day08_Methods_PassByValue;
// a basic calculator program using methods

public class methods2 {
    public static void main(String[] args) {
        // STEP 1: Calling the method and STORE the result
        // We need a variable to 'catch' what the method throws back.
        System.out.println("1. Main: Starting Tax Calculation");
        double myTax = calculateTax(50000, 0.2);
        // STEP 2: Use the returned value
        System.out.println("4. Main Calculated Tax bill is : " + myTax);

    }
    // NOTE: 'void' is gone. We use 'double' because we promise to return a number.
    public static double calculateTax(double income, double rate) {
        // STEP 3: Calculate the tax
        // creating a local variable to hold tax
        double result = income * rate;
        System.out.println("2. Method: Calculating tax for income: " + income + " at rate: " + rate);
        System.out.println("3. Method: Calculated tax is: " + result);
        // STEP 4: Return the result to the caller
        return result;
        // when this method ends, its stack frame is destroyed

    }
    
}
