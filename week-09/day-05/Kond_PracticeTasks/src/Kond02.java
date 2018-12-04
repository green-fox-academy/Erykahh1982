public class Kond02 {
  public static void main(String[] args) {

    int[] numList = {1, 2, 3, 4, 5, 6};
    int n = numList.length;
    System.out.println(summingNeighbourElements(numList));
  }

  public static int summingNeighbourElements(int[] list) {
    int sum = 0;
    for (int i = 0; i < list.length; i++) {
      if (list[i] % 2 == 0) {
        sum = list[i] + list[i + 1];
        return sum;
      } else {
        sum = list[i] + list[i + 1] + list.length;
      }
    }
    return sum;
  }
}