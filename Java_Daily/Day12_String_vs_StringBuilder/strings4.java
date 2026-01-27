package Java_Daily.Day12_String_vs_StringBuilder;

public class strings4 {
    public static void main(String[] args) {
        // case 1 immutable
        String text = "Hello Tony";
        System.out.println("1.String Before : " + text);
        tryToChange(text);
        // it will remain hello
        System.out.println("2.String After : "+ text);
        System.out.println("------------------------------");
        // now case 2 mutable
        StringBuilder words = new StringBuilder("Hello Tony");
        System.out.println("3. Builder Before : " + words);
        reallyChange(words);
        // change will happen
        System.out.println("4. Builder after : " + words);


    }
    public static void tryToChange(String str) {
        // now variable str also points to the text
        str = str + " Stark";
    }
    public static void reallyChange(StringBuilder tempsb) {
        tempsb.append(" Stark");
    }
    
}
