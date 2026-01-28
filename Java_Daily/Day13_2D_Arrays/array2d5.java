package Java_Daily.Day13_2D_Arrays;

public class array2d5 {
    public static void main(String[] args) {
         int[][] matrix = {
            {1, 2},
            {3, 4}
         };
         System.out.println("Valid Access : " + matrix[1][1]);
         //--danger zone--
         System.out.println("Attempting to access row 2...");
         int crash = matrix[2][0];
         //System.out.println("Failed Access" + matrix[2][0]);
         System.out.println("this line will never run");
    }
    
}
