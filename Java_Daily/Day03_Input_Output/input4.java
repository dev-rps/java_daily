package Java_Daily.Day03_Input_Output;

public class input4 {
    public static void main(String[] args) {
     // Example of formatting output in a tabular form
    String product1 = "Lappy";
    String product2 = "Mouse";
    String product3 = "Keyboard";
    double price1 = 800.5066;
    double price2 = 20.459;
    double price3 = 35.99;
    int qty1 = 2;
    int qty2 = 5;
    int qty3 = 3;
    double total1 = price1 * qty1;
    double total2 = price2 * qty2;
    double total3 = price3 * qty3;
    // use of \t and \n to look like a table
    // use of formatting 
    System.out.println("\tProduct\t\tPrice\tQuantity\tTotal");
    System.out.printf("\t%s\t\t$%.2f\t%d\t\t%.2f\n", product1, price1, qty1, total1);
    System.out.printf("\t%s\t\t$%.2f\t%d\t\t%.2f\n", product2, price2, qty2, total2);
    //with fixed width formatting
    System.out.println("\t-----------------------------------------");
    System.out.printf("%-15s %-10s %-10s %-10s\n" ,"Product", "Price", "Quantity", "Total");
    System.out.printf("%-15s $%-10.2f %-9d $%-10.2f\n", product1, price1, qty1, total1);
    System.out.printf("%-15s $%-10.2f %-9d $%-10.2f\n", product2, price2, qty2, total2);
    System.out.printf("%-15s $%-10.2f %-9d $%-10.2f\n", product3, price3, qty3, total3);


}
}
