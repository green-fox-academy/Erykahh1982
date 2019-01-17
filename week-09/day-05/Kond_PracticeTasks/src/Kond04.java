import java.util.*;

public class Kond04 {
  public static void main(String[] args) {
//    Írj egy functiont, ami 3 paramétert kap:
//    - egy listát számokkal,
//    - egy számot, ami a minimum limitet jelenti,
//    - egy számot, ami a maximum limitet jelenti,
//    és visszaad egy új listát, amiben növekvő sorrendbe rendezve szerepelnek az eredeti listából azok a számok, amik a megadott minimum és maximum érték közé esnek (azokat is beleértve).
//    Pl: ([6, 3, 7, 1, 2, 4], 3, 6) » [3, 4, 6]

    List<Integer> numList = Arrays.asList(6, 3, 7, 1, 2, 4);
    int min = 3;
    int max = 6;

    System.out.println(function(numList, min, max));
  }

  private static List<Integer> function(List<Integer> numList, int min, int max) {
    List<Integer> result = new ArrayList<>();

    for (int i = 0; i < numList.size(); i++) {
      if (numList.get(i) >= min && numList.get(i) <= max) {
        result.add(numList.get(i));
      }
    }
    for (int i = 0; i < result.size() - 1; i++) {
      for (int j = i + 1; j < result.size(); j++) {
        if (result.get(i) > result.get(j)) {
          int swap = result.get(i);
          result.set(i, result.get(j));
          result.set(j, swap);
        }
      }
    }
    return result;
  }

}