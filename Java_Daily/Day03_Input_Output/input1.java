package Java_Daily.Day03_Input_Output;
import java.util.Scanner;

public class input1 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter your name: " );
        String name = reader.nextLine();
        System.out.println("Enter your age: ");
        int age = reader.nextInt();
        // FIX: This "consumes" the leftover newline so the next input works!
        // reader.nextLine(); buffer clear karne ke liye 
        System.out.println("Hello " + name + ".");
        if (age < 18) {
            System.out.println("No, you are not eligible to play this game.");
        } else {
            System.out.println(" yes, you are eligible to play this game.");
            System.out.println("Do you want to play? (yes/no)");
            String response = reader.next();
            if (response.equalsIgnoreCase("yes")) {
                System.out.println("Great! Lets's start this game.");
            } else {
                System.out.println("okay! see you next time.");
            }
            }

        }
        }
