import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class QuoteSwap {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<String>(Arrays.asList("What", "I", "do", "create,", "I", "cannot", "not", "understand."));
        System.out.println("If I can make the right order of the words I'll get a nice quote : " + quoteSwap(list));

        System.out.println("Here you go with the nice quote of the day: ");
        for (Object quote : list){
            System.out.print(quote + " ");
        }
    }

    public static boolean quoteSwap (ArrayList<String> list){
        Collections.swap(list, 2, 5);
        return true;
    }
}
