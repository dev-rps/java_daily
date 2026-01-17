package Java_Daily.Day06_Loops;
import java.util.Scanner;

public class loops4 {
    public static void main(String[] args) {
        System.out.println("number search (1-10) !");
        Scanner read = new Scanner(System.in);
        System.out.println("enter a number you dont want to be drawn:");
        int unluckyNum = read.nextInt();
        System.out.println("Enter a number you want to be drawn:");
        int luckyNum = read.nextInt();
        for (int i = 1; i <= 10; i++) {
            
            if (i == unluckyNum) {
                System.out.println(" Skipping number " + unluckyNum + "...");
                continue; 
            }

            if (i == luckyNum) {
                System.out.println(" Found number " + luckyNum + "! Stopping loop completely.");
                break; 
            }

            System.out.println("Processing number: " + i);
        }

        System.out.println("- Loop Finished -");

        
    }
    
}
