package Java_Daily.Day03_Input_Output;
import java.util.Scanner;

public class input2 {
    public static void main(String[] args) {
        System.out.println("Welcome to adder and subtractor program!");
        System.out.println("Enter first number: ");
        Scanner see = new Scanner(System.in);
        int num1 = see.nextInt();
        System.out.println("Enter second number: ");
        int num2 = see.nextInt();
        see.nextLine();
        System.out.println("Do you want to add or subtract these numbers? (add/subtract)");
        String choice = see.nextLine();
        if (choice.equalsIgnoreCase("add")) {
            int sum = num1 + num2;
            System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);
        } else if (choice.equalsIgnoreCase("subtract")) {
            int difference = num1 - num2;
            System.out.println("The difference when " + num2 + " is subtracted from " + num1 + " is: " + difference);
        } else {
            System.out.println("Invalid choice! Please choose either 'add' or 'subtract'.");
        }

    }
    
}
