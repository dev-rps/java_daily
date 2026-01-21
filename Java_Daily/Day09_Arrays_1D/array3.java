package Java_Daily.Day09_Arrays_1D;

public class array3 {
    public static void main(String[] args) {
        int [] data = {20, 5, 80, 15, 2};
        // initializing variables
        int max;
        int min;
        int sum;
        max = data[0];
        min = data[0];
        sum = 0;
        // the loop to analyze every element
        for (int i=0; i< data.length; i++) {
            //updating sum
            sum = sum + data[i];
            // checking for max
            if (data[i] > max) {
                max = data[i];
            }
            // checking for min
            if (data[i] < min) {
                min = data[i];
            }
        }
        // printing results
        System.out.println("Maximum value: " + max);
        System.out.println("Minimum value: " + min);
        System.out.println("Sum of all values: " + sum);

    }
    
}
