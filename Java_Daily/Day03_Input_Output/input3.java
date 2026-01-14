package Java_Daily.Day03_Input_Output;

import java.util.Scanner;

public class input3 {
    public static void main(String[] args) {
        System.out.println("Enter a decimal number: ");
        Scanner read = new Scanner(System.in);
        double deciNum = read.nextDouble();
        System.out.println("Enter an integer number: ");
        int intNum = read.nextInt();
        System.out.println("Enter a Single Word:");
        read.nextLine();
        Character word = read.next().charAt(0);
        System.out.println("Your entered decimal number is: " + deciNum + ",\ninteger number is: " + intNum + ",\nand first letter of the entered word is: " + word);
    }
    
}
