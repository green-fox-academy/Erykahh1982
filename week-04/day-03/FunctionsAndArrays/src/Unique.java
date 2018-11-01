import java.util.Arrays;

public class Unique {
    public static void main(String[] args) {

        System.out.println(unique(new int[] {1, 11, 34, 11, 52, 61, 1, 34}));

    }
    public static String unique(int... numbers) {
        String uniquePrint ="";
        int uniqueCount =0;

        for (int i = 0; i < numbers.length; i++) {
            boolean isUnique = true;
            for (int j = 0; j < numbers.length; j++) {

                if (numbers[i] == numbers[j] && i > j) {
                    isUnique = false;
                }
            }
            if (isUnique) {
                uniqueCount++;
            }
        }
        int[] uniqueArray = new int[uniqueCount];
        int shift = 0;
        for (int i = 0; i < uniqueArray.length+shift; i++) {
            boolean isUnique = true;
            for (int j = 0; j < numbers.length; j++) {
                if (numbers[i] == numbers[j] && i > j) {
                    isUnique = false;
                }
            }
            if (isUnique) {
                uniqueArray[i-shift] = numbers[i];
            } else        {
                shift++;
            }
        }
        uniquePrint = Arrays.toString(uniqueArray);
        return uniquePrint;
    }
}
