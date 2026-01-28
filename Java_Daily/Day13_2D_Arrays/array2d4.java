package Java_Daily.Day13_2D_Arrays;
import java.util.Arrays;

public class array2d4 {
    public static void main(String[] args) {
        int[][] grid = {
            {10, 20},
            {30, 40}
        };
        System.out.println("Before explosion " + Arrays.deepToString(grid));
        explode(grid);
        System.out.println("After explosion: " + Arrays.deepToString(grid));
        
    }
    public static void explode(int[][] calc) {
        System.out.println("BOOM!, destoying target at [1][1]...");
        //modifying
        calc[1][1] = -1;
    }
    
}
