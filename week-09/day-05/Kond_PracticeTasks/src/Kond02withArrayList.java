import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Kond02withArrayList {
  public static void main(String[] args) {

    ArrayList<Integer> numList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
    System.out.println(summingNeighbourElements(numList));

  }

  private static ArrayList<Integer> summingNeighbourElements(ArrayList<Integer> numList) {
    ArrayList<Integer> result = new ArrayList<>();
    int sum = 0;
    if (numList.size() % 2 == 0) {
      for (int i = 0; i < numList.size(); i += 2) {
        sum = numList.get(i) + numList.get(i + 1);
        result.add(sum);
      }
    } else {
      for (int i = 0; i < numList.size() - 1; i += 2) {
        sum = numList.get(i) + numList.get(i + 1);
        result.add(sum);
      }
      int lastindex = numList.size() - 1;
      Integer lastElement = numList.get(lastindex);
      result.add(lastElement);
    }
    return result;
  }
}

