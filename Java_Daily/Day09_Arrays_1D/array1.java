package Java_Daily.Day09_Arrays_1D;

public class array1 {
    public static void main(String[] args) {
        //creating an array
        int [] luckyNumbers = {7, 13, 21, 42};
        //accessing array elements
        System.out.println("First lucky number: " + luckyNumbers[0]);
        System.out.println("Third lucky number:" + luckyNumbers[2]);
        // modifying array elements
        luckyNumbers[1] = 99;
        // verifying the change
        System.out.println("Updated second lucky number: " + luckyNumbers[1]);
        // printing array length
        System.out.println("Total lucky numbers: " + luckyNumbers.length);
    }
    
}
