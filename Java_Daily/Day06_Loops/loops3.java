package Java_Daily.Day06_Loops;

import java.util.Scanner;

public class loops3 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n- GAME MENU -");
            System.out.println("1. Start Game");
            System.out.println("2. High Scores");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            
            choice = reader.nextInt();

            if (choice == 1) {
                System.out.println(" Loading game...");
            } else if (choice == 2) {
                System.out.println(" Current High Score: 9999");
            } else if (choice != 3) {
                System.out.println(" Invalid option, try again.");
            }

        } while (choice != 3); 

        System.out.println("Program closed. Goodbye!");
        reader.close();
        
    }
    
}
