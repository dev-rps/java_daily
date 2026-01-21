package Java_Daily.Day09_Arrays_1D;

public class array5 {
    public static void main(String[] args) {
        String[] colors = {"green", "blue", "red"};
        System.out.println("Array length: " + colors.length);
        System.out.println("Array last valid index: " + (colors.length - 1));
        // the crashing line
        // trying to access index 3 but the last valid index is 2
        System.out.println("touching invalid index...");
        System.out.println("3rd character: " + colors[3]);
        System.out.println("i will not be printed");
    }
}
