package Java_Daily.Day04_Bitwise_Operators;
import java.util.Scanner;

public class operator1 {
    public static void main(String[] args) {
    System.out.println("Enter an integer number:");
    Scanner scan = new Scanner(System.in);
    int number = scan.nextInt();
    int num = number & 1;
    if (num == 0)
        System.out.println("The number is even.");
    else
        System.out.println("The number is odd.");
}
}