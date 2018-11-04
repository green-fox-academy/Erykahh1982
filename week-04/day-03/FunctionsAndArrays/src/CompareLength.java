import java.util.Arrays;

public class CompareLength {

    public static void main(String[] args) {

        int[] p1 = {1 ,2 ,3};
        int[] p2 = {4 ,4};

        if (p1.length > p2.length){
            System.out.println("p1 has more elements" + " : " + Arrays.toString(p1));
        } else{
            System.out.println("p2 has more elements" + " : " + Arrays.toString(p2));
        }
    }
}
