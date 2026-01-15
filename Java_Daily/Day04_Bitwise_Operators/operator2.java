package Java_Daily.Day04_Bitwise_Operators;

public class operator2 {
    public static void main(String[] args) {
        int a = 12; // 1100 in binary
        int b = 25; // 11001 in binary
        int resultOR = a | b; // Bitwise OR
        int resultXOR = a ^ b; // Bitwise XOR
        System.out.println("a in binary:  " + Integer.toBinaryString(a));
        System.out.println("b in binary: " + Integer.toBinaryString(b));
        System.out.println("OR result in binary: " + Integer.toBinaryString(resultOR));
        System.out.println("XOR result in binary: " + Integer.toBinaryString(resultXOR));
        // pattern recognition for OR and XOR
    }

}
