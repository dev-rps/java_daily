package Java_Daily.Day13_2D_Arrays;

public class array2d1 {
    public static void main(String[] args) {
        
     //declaring and initializing array 2d
     //method a : manual declaration
     //syntax:
     //int[][] grid = new int[3][3];
     //grid[0][0] =1;
     //grid[0][1] =2;
     //method b: shortcut (which is called initializer list) 
     int[][] grid = {
        {1, 2, 3},
        {4, 5, 6},
        {7, 8, 9}
     };
     System.out.println("--the matrix--");
     //printing using nested loops
     //outer loop - i
     for (int i = 0; i < grid.length; i++) {
        //inner loop - j
        for (int j = 0; j < grid[i].length; j++) {
            System.out.print(grid[i][j] + " ");
        }
        // for new row
        System.out.println();
     }
    }
    
}
