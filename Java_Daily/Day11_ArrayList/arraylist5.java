package Java_Daily.Day11_ArrayList;
import java.util.ArrayList;
// Managing entry for VIP party.

public class arraylist5 {
    public static void main(String[] args) {
        //initializing
        ArrayList<String> vips = new ArrayList<>();
        //populating (adding elements)
        vips.add("Batman");
        vips.add("Super Man");
        vips.add("Joker");
        System.out.println("--Intial List--");
        System.out.println(vips);
        System.out.println("Running Security Check!");
        securityCheck(vips);
        // A new guest aarives 
        vips.add("Wonder Woman");
        System.out.println("Entry: Added Wonder Woman.");
        //final display
        System.out.println("-Final VIP list-");
        int count = 1;
        for (String guest : vips ) {
            System.out.println(count + ". "+ guest);
            count++;
        }
        
              
    }
    public static void securityCheck(ArrayList<String> people) {
        //removing by name not index
        if (people.contains("Joker")) {
            people.remove("Joker"); // Java finds and deletes it automatically
            System.out.println("[Security] Kicked out Joker.");
        }
    }
    
}
