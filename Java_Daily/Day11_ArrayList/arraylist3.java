package Java_Daily.Day11_ArrayList;
import java.util.ArrayList;

public class arraylist3 {
    public static void main(String[] args) {
        // creating an array list
        ArrayList<Integer> scores = new ArrayList<>();
        // adding elements
        scores.add(10);
        scores.add(50);
        scores.add(25);
        scores.add(80);
        // standard traversal read only 
        System.out.println("-Original scores-");
        for (int i = 0; i < scores.size(); i++) {
            System.out.println("Score at index " + i + ": " + scores.get(i));
        }
        // modifying elements
        // goal: add 5 bonus points to each score
        for (int i = 0; i<scores.size(); i++) {
            int current = scores.get(i);
            scores.set(i, current + 5);
        }
        System.out.println("-Scores after adding bonus points-");
        System.out.println(scores); // prints the whole list
        // removing elements, dangerous if not careful with indexes
        // goal: remove scores less than 40
        // approach 1: traverse backwards
        System.out.println("removing scores less than 40");
        for  (int i = scores.size() -1 ; i >=0 ; i--) {
            if (scores.get(i) < 40) {
                scores.remove(i);
            }
        }
        System.out.println("-Scores after removal-");
        System.out.println(scores);
        // approach 2: use an auxiliary list to collect items to remove
        scores.add(30);
        scores.add(35);
        System.out.println("-Scores after adding 30 and 35-");
        System.out.println(scores);
        ArrayList<Integer> toRemove = new ArrayList<>();
        for (int i =0 ; i < scores.size(); i++) {
            if (scores.get(i) < 40) {
                toRemove.add(scores.get(i));
            }
        }
        // now remove all collected items
        for (Integer score : toRemove) {
            scores.remove(score);
        }
        System.out.println("-Scores after second removal-");
        System.out.println(scores);
        // clear the entire list
        scores.clear();
        System.out.println("-Scores after clear-");
        System.out.println(scores);
        
    }
    
}
