
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AppendLetter {

    public static void main(String[] args) {
        List<String> far = Arrays.asList("bo", "anacond", "koal", "pand", "zebr");
        System.out.println(toList(far));

    }
    public static ArrayList appendA (List<String> animals){
      ArrayList<String> farNew = new ArrayList<>();
            for (int i = 0; i < animals.size() ; i++) {
            farNew.add(i, animals.get(i) + "a");
        }
            return farNew;
    }

    public static List toList (List list) {
            for (int i = 0; i < list.size(); i++) {
            list.set(i, (list.get(i) + "a"));
        }
            return list;
    }
}
