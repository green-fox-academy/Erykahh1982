public class Kond_01 {
  public static void main(String[] args) {

    //Írj egy functiont, ami a kapott számokat tartalmazó tömbből (array) visszaadja a legnagyobb elemet.

    int[] numbers = {0, 1, 2, 3, 4, 5, 6, 7, 56, 86, 102, 12, 9876,};
    System.out.println("The biggest number form the given array is : " + biggestNumber(numbers));
  }

  public static int biggestNumber(int[] listOfNumbers) {
    int maxValue = listOfNumbers[0];
    for (int i = 1; i < listOfNumbers.length; i++) {
      if (listOfNumbers[i] > maxValue) {
        maxValue = listOfNumbers[i];
      }
    }
    return maxValue;
  }
}
