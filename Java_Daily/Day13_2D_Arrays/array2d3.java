package Java_Daily.Day13_2D_Arrays;

public class array2d3 {
    public static void main(String[] args) {
        int[][] box = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9},
        };
        //a global variable 
        
        System.out.println("Calculating...");
        calc(box);
        // ___program ends___
    }
    public static void calc (int[][] data) {
        int grandTotal = 0;
        for (int i = 0; i < data.length; i++) {
            int rowSum = 0;
            for (int j = 0; j < data[i].length; j++) {
                int currentValue = data[i][j];
                grandTotal += currentValue; // grandTotal = grandTotal + currentValue
                rowSum += currentValue;
            }
            //one row finished. printing its local sum.
            System.out.println("sum of row " + i + ": " + rowSum);
        }
        // We finished the whole grid. Print the global sum.
        System.out.println("-------------------------");
        System.out.println("Grand Total: " + grandTotal);

    }
    
}
