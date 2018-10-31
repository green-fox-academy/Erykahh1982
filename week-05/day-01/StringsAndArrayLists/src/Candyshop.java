import java.util.ArrayList;
import java.util.List;

public class Candyshop {

    public static void main(String[] args) {
        ArrayList<Object> arrayList = new ArrayList<Object>();
        arrayList.add("Cupcake");
        arrayList.add(2);
        arrayList.add("Brownie");
        arrayList.add(false);

        System.out.println(sweets(arrayList));

    }
    public static ArrayList<String> sweets (ArrayList cakes){

            cakes.set(1,"Croissant");
            cakes.set(3, "Ice cream");
            return cakes;
    }
}
