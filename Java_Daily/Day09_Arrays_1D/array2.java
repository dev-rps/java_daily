package Java_Daily.Day09_Arrays_1D;

public class array2 {
    public static void main(String[] args) {
        String[] heroes = {"Iron man", "Spidey", "Thor", "Hulk"};
        System.out.println("Team size: " + heroes.length);
        // the loop
        for (int i = 0; i< heroes.length; i++) {
            System.out.println("Slot " + i + ": " + heroes[i]);
        }
    }
    
}
