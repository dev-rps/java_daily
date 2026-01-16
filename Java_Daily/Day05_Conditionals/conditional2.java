package Java_Daily.Day05_Conditionals;
import java.util.Scanner;

public class conditional2 {
    public static void main(String[] args) {
        System.out.println("Enter your marks to know your grade.");
        Scanner read = new Scanner(System.in);
        float marks = read.nextFloat();
        if (marks > 100 || marks < 0) {
            System.out.println("Invalid Input. Please enter a valid marks.");
        } else if (marks>= 90) {
            System.out.println("Your grade is O.");
        } else if (marks>= 80) {
            System.out.println("Your grade is A+.");
        } else if (marks>=70) {
            System.out.println("Your grade is A.");
        } else if (marks >= 60) {
            System.out.println("Your grade is B+.");
        } else if (marks >= 50) {
            System.out.println("your grade is B.");
        } else if (marks >= 40) {
            System.out.println("Your grade is C.");
        } else {
            System.out.println("You have failed the exam.");
        }

        
    }
    
}
