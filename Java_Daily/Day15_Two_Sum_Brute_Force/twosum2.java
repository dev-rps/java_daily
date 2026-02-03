package Java_Daily.Day15_Two_Sum_Brute_Force;
import java.util.Arrays;

public class twosum2 {
    public static void main(String[] args) {
        int[] numbers = {2, 3, 6, 4};
        int targetValue = 8;
        System.out.println("Looking for Target Value" + targetValue);
        System.out.println("Array: " + Arrays.toString(numbers));
        int [] indices = findIndices(numbers, targetValue);
        if (indices.length == 2){
            System.out.println("Indices: " + indices[0]+ " "+indices[1]);
            System.out.println("Values: "+ numbers[indices[0]] + " "+ numbers[indices[1]]);
        } else {
                System.out.println("No solution found.");
            }
        }
    
        public static int[] findIndices(int[] nums, int target) {
            int checks = 0;
            for (int i = 0; i < nums.length; i++) {
                for (int j = i+1; j < nums.length; j++) {
                    checks ++;
                    System.out.println("Checks #"+checks);
                    if (nums[i] + nums [j] == target) {
                        return new int[] {i, j};
                    }
                }
            }
            return new int[]{};
        }
    
    
    
    
    
    }



    

