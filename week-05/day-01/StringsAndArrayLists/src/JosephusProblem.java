import java.util.ArrayList;

public class JosephusProblem {
  public static void main(String[] args) {

    int numberOfPeopleInTheCircle = 41;
    int kthPersonIsKilled = 2;
    System.out.println("The winning seat according to Josephus Problem is: " + solvingJosephusProblem(numberOfPeopleInTheCircle, kthPersonIsKilled) + ". If we have " + numberOfPeopleInTheCircle + " people standing in the circle and every " + kthPersonIsKilled + " nd person is killed in the circle.");

  }

  private static int solvingJosephusProblem(int numberOfPeopleInCircle, int kthPersonIsKilled) {
    if (numberOfPeopleInCircle == 1) {
      return 1;
    } else {
      return (solvingJosephusProblem(numberOfPeopleInCircle - 1, kthPersonIsKilled) + kthPersonIsKilled - 1) % numberOfPeopleInCircle + 1;
    }
  }

}