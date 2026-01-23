package Java_Daily.Day10_Memory_Visualizer;

public class memory3 {
    public static void main(String[] args) {
        generateGarbage(1);
    }
    public static void generateGarbage(int n) {
        int [] heavyObject = new int[10000000];
        System.out.println("Generated garbage object Frame #" + n);
        System.out.println("Heavy Object size: " + heavyObject.length);
        generateGarbage(n + 1);

    }
    
    
}
