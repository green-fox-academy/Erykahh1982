import java.util.ArrayList;
import java.util.Arrays;

public class ElementFinder {

    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 7));
        System.out.println("Result with solution 1:");
        System.out.println(containsSeven(arrayList));
        System.out.println("Result with solution 2:");
        System.out.println(containsSeven2(arrayList));
        System.out.println("Result with solution 3:");
        System.out.println(containsSeven3(arrayList));
        System.out.println("Result with solution 4:");
        System.out.println(containsSeven4(arrayList));

    }

    public static String containsSeven (ArrayList<Integer> list){
        for( Integer number : list){
            if (number.equals(7)){
                return "Hoorray";
            }
        }
        return "Nooooo!";
    }

    public static String containsSeven2 (ArrayList<Integer> list){
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(7));
            return "Hoorray!";
        }
        return "Nooooo!";
    }

    public static String containsSeven3 (ArrayList<Integer> list){
        if(list.contains(7)){
            return "Hoorray!";
        } else {
            return "Nooooo!";
        }
    }

    public static String containsSeven4 (ArrayList<Integer> list){
        boolean returnValue = list.contains(7);
        if(returnValue == true) {
            System.out.println("7 is contained in the list");
        } else {
            System.out.println("7 is not contained in the list");
        }
        return "Statelement is : " + returnValue;
    }
}
