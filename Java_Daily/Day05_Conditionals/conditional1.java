package Java_Daily.Day05_Conditionals;
import java.util.Scanner;

public class conditional1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = scan.nextInt();
        if (num > 0){
            System.out.printf("The number %d is a positive number.", num);
        }
        else if (num < 0) {
            System.out.printf("The number %d is a negative number.", num);
        }
        else {
            System.out.println("The number is zero.");
        }

        }

    }
    

