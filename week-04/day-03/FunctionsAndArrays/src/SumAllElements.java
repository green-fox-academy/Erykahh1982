import java.util.Arrays;

public class SumAllElements {
    public static void main(String[] args) {
        int[] ai = {3, 4, 5, 6, 7};
        System.out.println("My array is : " + Arrays.toString(ai));
        System.out.println("The sum of all array elements is : " + sumAll(ai));
    }

    public static int sumAll(int[] array){
    int sum = 0;
    for (int x: array){
        sum += x;
        }
        return sum;
    }
}

