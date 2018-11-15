import java.lang.reflect.Array;
import java.util.ArrayList;

public class SubInt {

    public static void main(String[] args) {
        int a = 1;
        int [] b = {1, 11, 34, 52, 61};
        int c = 9;
        int [] d = {1, 11, 34, 52, 61};

        System.out.println(subInt(a, b));
        System.out.println(subInt(c, d));

    }

    public static ArrayList<Integer> subInt (int num, int[] numArray){
        ArrayList<Integer> result =  new ArrayList<Integer>();

        ArrayList<Integer> numList = new ArrayList<Integer>();

        for (int i = 0; i < numArray.length ; i++) {
            Integer numInt = Integer.valueOf(numArray[i]); // ArrayListben csak nagy Integereket kezelhetünk, ezért átkonvertáljuk az Array i.-ik elemét int-ből Integer-é
            numList.add(numInt); // ezzel a for loop-al konvertálom az Array elemeimet ArrayList-é és adom hozzá az Arrayhez
        }


        for (int i = 0; i < numList.size() ; i++) {

            if (numList.get(i) == num) {
                result.add(numList.indexOf(numList.get(i)));
            }
        }

        // karaktereket fel kell darabolni hogy a többi elemen is menjen végig
        return result;
    }
 }
