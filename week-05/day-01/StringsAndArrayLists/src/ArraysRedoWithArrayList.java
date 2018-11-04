import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArraysRedoWithArrayList {

    public static void main(String[] args) {

        //Third
        ArrayList<Integer> q = new ArrayList<>(Arrays.asList(4, 5, 6, 7));
        System.out.println("The third element is : " + q.get(2));

        //CompareLength
        ArrayList<Integer> p1 = new ArrayList<>(Arrays.asList(1, 2, 3));
        ArrayList<Integer> p2 = new ArrayList<>(Arrays.asList(4, 5));

        if (p2.size() > p1.size()) {
            System.out.println("P2 has more elements");
        } else {
            System.out.println("P1 has more elements");
        }

        //SumElements
        ArrayList<Integer> r = new ArrayList<>(Arrays.asList(54, 23, 66, 12));
        Integer sumNum = 0;
        for (int i = 0; i < r.size(); i++) {
            sumNum = r.get(2) + r.get(3);
        }
        System.out.println("The sum of the 2nd and 3rd element is : " + sumNum);

        System.out.println("Easier printout : " + r.get(2) + r.get(3));

        //ChangeElement
        ArrayList<Integer> s = new ArrayList<>(Arrays.asList(1, 2, 3, 8, 5, 6));
        s.set(3, 4);
        System.out.println("Changing 8 to 4 in the arraylist and print the 4th element : " + s.get(3));

        //IncrementElement
        ArrayList<Integer> t = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        Integer a = 5;
        System.out.println(t.get(2) + a);

        //PrintElements
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(4, 5, 6, 7));
        for (Integer numList : numbers) {
            System.out.print(numList + ", ");
        }
        System.out.println();
        System.out.println("Or with one single line");
        System.out.println(numbers);

        //DoubleItems
        ArrayList<Integer> numList = new ArrayList<>(Arrays.asList(3, 4, 5, 6, 7));
        ArrayList<Integer> numListDouble = new ArrayList<>();
        for (int i = 0; i < numList.size(); i++) {
            numListDouble.add(i, (numList.get(i) * 2));
        }
        System.out.println("Print the double of the original arraylist! " + "Original : " + numList + " Double : " + numListDouble);

        //AppendA
        List<String> animals = Arrays.asList("koal", "pand", "zebr");
        System.out.println("Original list : " + animals);
        System.out.println("New, appendA list : " + appendA(animals));

        //SwapElements
        ArrayList<String> abc = new ArrayList<>(Arrays.asList("first", "second", "third"));
        System.out.println("Arraylist before swap: ");
        System.out.println(abc);

        Collections.swap(abc,0,2);
        System.out.println("Arraylist after swap: ");
        for(String temp : abc){
            System.out.print(Arrays.asList(temp));
        }
    }

    public static List<String> appendA(List<String> list){
        for (int i = 0; i < list.size() ; i++) {
            list.set(i, list.get(i) + "a");
        }
        return list;
    }
}
