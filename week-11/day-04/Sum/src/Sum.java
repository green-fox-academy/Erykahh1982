import java.util.ArrayList;

public class Sum {

  private ArrayList<Integer> numbers = new ArrayList<>();

  public Sum() {
    this.numbers = numbers;
  }

  public static int sumNumbers(ArrayList<Integer> numbers) {

    int sum = 0;
    if(numbers == null){
      return 0;
    }

    for (Integer i : numbers) {
      sum += i;
    }
    return sum;
  }

}
