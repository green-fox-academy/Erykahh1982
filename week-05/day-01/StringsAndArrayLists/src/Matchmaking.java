import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Matchmaking {

    public static void main(String[] args) {

        ArrayList<String> girls = new ArrayList<String>(Arrays.asList("Eve", "Ashley", "Claire", "Kat", "Jane"));
        ArrayList<String> boys = new ArrayList<String>(Arrays.asList("Joe", "Fred", "Tom", "Todd", "Neef", "Jeff"));
        System.out.println("Print original arrays :");
        System.out.println(girls);
        System.out.println(boys);


       ArrayList<String> girlsAndBoys = new ArrayList<String>();
       girlsAndBoys.addAll(girls);
       girlsAndBoys.addAll(boys);
        System.out.println("Print mixed list of girls and boys : ");
        System.out.println(girlsAndBoys);

        int length = girls.size();

        ArrayList<String> makingMatches = new ArrayList<String>(length);
        for (int i = 0; i < length ; i++) {
            makingMatches.add(girls.get(i) + ", " + boys.get(i));
        }
        System.out.println("Print matches :");
        System.out.println(makingMatches);
    }
}
