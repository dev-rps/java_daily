package Java_Daily.Day05_Conditionals;
import java.util.Scanner;

public class conditional3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Do you have a Degree? (yes/no)");
        String hasDegree = scan.next();
        boolean degree = hasDegree.equalsIgnoreCase("yes");
        System.out.println("Are you a Student? (yes/no)");
        String isStudent = scan.next();
        boolean student = isStudent.equalsIgnoreCase ("yes");
        if (!degree && !student) {
            System.out.println("You are not eligible for any role.");
        } else {

        System.out.println("How many years of experience do you have?");
        int experience = scan.nextInt();

        if ( degree && experience >= 5) {
            System.out.println("You are eligible for Senior Developer role.");
        }
        else if (degree && experience >= 2 && experience < 5) {
            System.out.println("You are eligible for Junior Developer role.");
        }
        else if (student || degree ) {
            System.out.println("You are eligible for Internship role.");
        }
        
        }

    }
    }
    

