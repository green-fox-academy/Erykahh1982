import java.util.Arrays;

public class Reverse {

    public static void main(String[] args) {
        int aj [] = {3 ,4 ,5 ,6 ,7 };
        System.out.println("This is the original array list printout");
        System.out.println(Arrays.toString(aj));
        reverse(aj);
        System.out.println("This is the reverse array list printout");
        System.out.println(Arrays.toString(aj));
    }

        public static void reverse (int[] ja){
        int [] arrayReverse = Arrays.copyOf(ja, ja.length);
            for (int i = 0; i < ja.length; i++) {
                ja [i] = arrayReverse[ja.length - 1 - i];
            }
    }
}
