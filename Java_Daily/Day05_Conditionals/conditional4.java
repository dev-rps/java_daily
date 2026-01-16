package Java_Daily.Day05_Conditionals;
import java.util.Scanner;

public class conditional4 {
    public static void main(String[] args) {
        System.out.println("Enter a day number (1-7) to get the corresponding day of the week:");
        Scanner read = new Scanner(System.in);
        int day = read.nextInt();
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day number. Please enter a number between 1 and 7.");
        }
    }
    
}
