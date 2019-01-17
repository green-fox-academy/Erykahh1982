import java.util.Arrays;

public class Kond02 {
  public static void main(String[] args) {

    int[] numList = {1, 2, 3, 4, 5, 6, 7};
    System.out.println(Arrays.toString(summingNeighbourElements(numList)));
  }

  public static int[] summingNeighbourElements(int[] list) {

    int[] result;
    if (list.length % 2 == 0) {
      result = new int[list.length / 2];
    } else {
      result = new int[list.length / 2 + 1];
    }

    int sum = 0;
    int counter = 0;
    if (list.length % 2 == 0) {
      for (int i = 0; i < list.length; i += 2) {
        sum = list[i] + list[i + 1];
        result[counter] = sum;
        counter++;
      }
    } else {
      for (int i = 0; i < list.length - 1; i += 2) {
        sum = list[i] + list[i + 1];
        result[counter] = sum;
        counter++;
      }
      result[counter] = list[list.length - 1];
    }
    return result;
  }
}
