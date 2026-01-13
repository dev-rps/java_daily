package Java_Daily.Day02_Variables;
public class variables1 {
    public static void main(String[] args) {
        int number_of_pens = 15;
        float price_per_pen = 5.50f;
        String pen_name = "Butterflow";
        boolean ink_filled = false; 
        System.out.println("no. of pens = "+ number_of_pens);
        System.out.println("price of each pen = "+ price_per_pen);
        System.out.println("company name of the pen = "+ pen_name);
        if (ink_filled)
        System.out.println("pen is ready to use!");
        else
        System.out.println("pen is not ready to use!");
    }
    
}
