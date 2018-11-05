import java.util.*;

public class StudentCalculator {
    public static void main(String... args) {

        ArrayList<Map<String, Object>> arrayListOfMaps = new ArrayList<Map<String, Object>>();

        // Given this list of hashmaps...

        Map<String, Object> row0 = new HashMap<String, Object>();
        row0.put("name", "Theodor");
        row0.put("age", 9.5);
        row0.put("candies", 2);
        arrayListOfMaps.add(row0);

        Map<String, Object> row1 = new HashMap<String, Object>();
        row1.put("name", "Paul");
        row1.put("age", 10);
        row1.put("candies", 1);
        arrayListOfMaps.add(row1);

        Map<String, Object> row2 = new HashMap<String, Object>();
        row2.put("name", "Mark");
        row2.put("age", 7);
        row2.put("candies", 3);
        arrayListOfMaps.add(row2);

        Map<String, Object> row3 = new HashMap<String, Object>();
        row3.put("name", "Peter");
        row3.put("age", 12);
        row3.put("candies", 5);
        arrayListOfMaps.add(row3);

        Map<String, Object> row4 = new HashMap<String, Object>();
        row4.put("name", "Olaf");
        row4.put("age", 12);
        row4.put("candies", 7);
        arrayListOfMaps.add(row4);

        Map<String, Object> row5 = new HashMap<String, Object>();
        row5.put("name", "George");
        row5.put("age", 3);
        row5.put("candies", 2);
        arrayListOfMaps.add(row5);

        for (int i = 0; i < arrayListOfMaps.size(); i++) {

            int numberOfCandies = (int)arrayListOfMaps.get(i).get("candies");
            if (numberOfCandies > 4){
                System.out.print(arrayListOfMaps.get(i).get("name") + ", ");
            }
        }

        System.out.println();
        
        double sumAge = 0;

        for (int i = 0; i < arrayListOfMaps.size() ; i++) {

            int numberOfCandies = (int)arrayListOfMaps.get(i).get("candies");

            if(numberOfCandies < 5) {
                String age = arrayListOfMaps.get(i).get("age").toString();
                sumAge = sumAge + Double.valueOf(age);
            }
        }
        System.out.println(sumAge);
    }
}
