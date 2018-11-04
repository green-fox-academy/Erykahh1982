import java.util.Arrays;

public class SwapElements {

    public static void main(String[] args) {

        String  abc [] = {"first", "second", "third"};
        String toChange = abc [0];
        abc [0] = abc [2];
        abc [2] = toChange;
        System.out.println("The new order of our array is");
        System.out.println(Arrays.toString(abc));
    }
}
