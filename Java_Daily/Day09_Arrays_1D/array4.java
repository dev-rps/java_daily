package Java_Daily.Day09_Arrays_1D;

public class array4 {
    public static void main(String[] args) {
        int[] grades = {10, 20, 30};
        System.out.println("1. Before : " + grades[0]);
        // passing reference to the method
        // sending address of the array not the copy of the array elements
        curveGrades(grades);
        System.out.println("4. After : " + grades[0]);
    }
    public static void curveGrades(int[] arr) {
        // changing data in the heap memory
        arr[0] = arr[0] + 50;
        System.out.println("2. Adding extra credit...");
        System.out.println("3. Inside method: " + arr[0]);

    }
    
}
