package Java_Daily.Day11_ArrayList;
import java.util.ArrayList;

public class arraylist4 {
    public static void main(String[] args) {
        // creating a song list
        ArrayList<String> songs = new ArrayList<>();
        songs.add("Mi Gente");
        songs.add("Despacito");
        songs.add("Hey Mama");
        System.out.println("1. Main Before :" + songs);
        // passing the reference
        modifyPlaylist(songs);
        //verifying the effects
        //the list is changed here even though the method returned void.
        System.out.println("Main after: " + songs);
        for (String playlist : songs) {
            System.out.println(playlist);
        }

    }
    // the parameter list points to exact same object as songs 
    public static void modifyPlaylist(ArrayList<String> list) {
        System.out.println("Method: Deleting Mi Gente, Adding Colors...");
        list.remove(0);
        list.add("Colors");
    }
    
}
