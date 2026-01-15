package Java_Daily.Day04_Bitwise_Operators;

public class operator3 {
    public static void main(String[] args) {
        int num1 = 10; // 1010 in binary
        int num2 = 20; // 10100 in binary
        int leftShift = num1 << 2; // Left shift by 2
        int rightShift = num2 >> 1; // Right shift by 1
        System.out.println("original number 1: " + num1);
        System.out.println("original number 2: " + num2);
        System.out.println("left shift result (<< 2): " + leftShift + " (10 * 2^2 = 40)");
        System.out.println("right shift result (>> 1): " + rightShift + " (20 / 2^1 = 10)");
    }
    
}
