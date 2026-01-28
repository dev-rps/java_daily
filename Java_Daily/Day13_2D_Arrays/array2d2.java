package Java_Daily.Day13_2D_Arrays;

public class array2d2 {
    public static void main(String[] args) {
        // creating a 3*2 matrix
        int[][] grid = {
            {10, 20},
            {30, 40},
            {50, 60}
        };
        System.out.println("--array gps coordinates--");
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                int value = grid[i][j];
                System.out.println("value " + value + " is at [" + i + "][" + j + "] ");
            }
        }


    }
    
}
