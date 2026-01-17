package Java_Daily.Day06_Loops;
import java.util.Scanner;

public class loops1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = scan.nextInt();
        System.out.println("Numbers from 1 to " + num + ":");
        for (int i = 1; i <= num; i++) {
            System.out.print(i + " ");
        }
        System.out.println("\nNumbers from " + num + " to 1:");
        for (int i = num; i >= 1; i--) {
            System.out.print(i + " ");
        }
    }
}
