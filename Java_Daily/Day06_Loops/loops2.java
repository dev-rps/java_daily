package Java_Daily.Day06_Loops;

import java.util.Scanner;

public class loops2 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        int secretPin = 1234;
        int attempts = 3;
        boolean loggedIn = false;

        System.out.println("- SECURE LOGIN SYSTEM -");

        while (attempts > 0 && !loggedIn) {
            System.out.println("\nAttempts remaining: " + attempts);
            System.out.print("Enter your 4-digit PIN: ");
            int userGuess = reader.nextInt();

            if (userGuess == secretPin) {
                System.out.println("Access Granted! Welcome back.");
                loggedIn = true; 
            } else {
                System.out.println("Incorrect PIN.");
                attempts--; 
            }
        }

        if (!loggedIn) {
            System.out.println("\nAccount Locked. Too many failed attempts.");
        }
        
        reader.close();
    }
}
        
    
    

