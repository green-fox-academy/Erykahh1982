import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Kond05 {
  public static void main(String[] args) {
    //    Írj egy functiont, ami megszámolja, hogy a kapott számokat tartalmazó tömbben melyik szám hányszor szerepel, és  visszaadja eredményül ezt.
    //        Pl: [3, 5, 6, 3, 1, 1, 5] » { 3: 2, 5: 2, 6: 1, 1: 2 }
    ArrayList<Integer> numList = new ArrayList<>(Arrays.asList(3, 5, 6, 3, 1, 1, 5));
    HashMap<Integer, Integer> resultMap = countFrequency(numList);
    //System.out.println(countFrequency(numList).toString());
    for (Integer number : resultMap.keySet()) {
      System.out.print(number + ": " + resultMap.get(number) + ", ");
    }
  }

  private static HashMap<Integer, Integer> countFrequency(ArrayList<Integer> numList) {
    HashMap<Integer, Integer> result = new HashMap<>();

    for (int i = 0; i < numList.size(); i++) {
      if (result.containsKey(numList.get(i))) {
        int frequency = result.get(numList.get(i));
        frequency++;
        result.put(numList.get(i), frequency);
      } else {
        result.put(numList.get(i), 1);
      }
    }
    return result;
  }

}