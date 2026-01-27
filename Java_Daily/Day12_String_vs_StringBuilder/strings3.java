package Java_Daily.Day12_String_vs_StringBuilder;

public class strings3 {
    public static void main(String[] args) {
        //method 1 - string way
        String str = "";
        //memory disaster
        //this loops runs 1000 times
        //slower
        for (int i =0; i < 1000; i++) {
            str = str + "a";
        }
        System.out.println("String final length: " + str.length());
        //method 2 - sb way
        StringBuilder sb = new StringBuilder();
        //memory saves
        //faster 
        //no new object created
        for (int i =0; i < 1000; i++) {
            sb.append("a");
        }
        System.out.println("String Builder final length: " + sb.length());
    }
    
}
