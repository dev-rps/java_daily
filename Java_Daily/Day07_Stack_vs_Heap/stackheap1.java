package Java_Daily.Day07_Stack_vs_Heap;

public class stackheap1 {
    public static void main(String[] args) {
        int var1 = 10;
        System.out.println("Start Main");
        methodA();
        System.out.println("End Main");
    }
    public static void methodA() {
        int var2 = 20;
        System.out.println("Start Method A");
        methodB();
        System.out.println("End Method A");
    }
    public static void methodB() {
        int var3 = 30;
        System.out.println("Start Method B");
        System.out.println("End Method B");
    }
    

    
}
