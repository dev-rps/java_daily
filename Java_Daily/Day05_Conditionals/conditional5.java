package Java_Daily.Day05_Conditionals;
import java.util.Scanner;

public class conditional5 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Enter a number between 1 and 7 to get the corresponding day of the week:");
        int day = read.nextInt();
        switch (day) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
            default -> System.out.println("Invalid day number. Please enter a number between 1 and 7.");

        }
        
    }
    
}
