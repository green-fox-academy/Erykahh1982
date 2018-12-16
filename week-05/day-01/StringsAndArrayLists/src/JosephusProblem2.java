import java.util.ArrayList;

public class JosephusProblem2 {
  public static void main(String[] args) {

    int numberOfPeople = 41;
    int gap = 2;
    System.out.println(
        "The winning position of the Josephus Problem is : "
            + josephusProblem(numberOfPeople)
            + ". If we consider "
            + numberOfPeople
            + " people standing in the circle, where every "
            + gap
            + " nd of them is killed.");
  }

  private static int josephusProblem(int numberOfPeople) {

    ArrayList<Integer> listOfPeople = new ArrayList<>();
    for (int i = 1; i <= numberOfPeople; i++) {
      listOfPeople.add(i);
    }
    int index = 1;
    while (listOfPeople.size() > 1) {
      listOfPeople.remove(index);
      index = (index + 1) % listOfPeople.size();
    }
    return listOfPeople.get(0);
  }

}