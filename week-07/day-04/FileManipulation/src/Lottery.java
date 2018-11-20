import javax.sound.midi.Soundbank;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Lottery {
  public static void main(String[] args) {
    String fileName = "lottery.csv";
    ArrayList<String> lines = readFile(fileName);
    ArrayList<Integer> numbers = getLotteryNumbers(lines);
    System.out.println(numbers);
    HashMap<Integer, Integer> resultMap = countFrequency(numbers);
    for (Integer lotteryNumber : resultMap.keySet()) {
      System.out.println(lotteryNumber + " | " + resultMap.get(lotteryNumber));
    }
    System.out.println();
    System.out.println("Top lottery numbers are :");
    HashMap<Integer, Integer> topFive = sortMap(resultMap);
    for (Integer item: topFive.keySet()){
      System.out.println(item + " | " + topFive.get(item));
    }
  }

  public static ArrayList<String> readFile(String file) {
    ArrayList<String> lines = new ArrayList<>();
    try {
      Path filePath = Paths.get("Asset/" + file);
      lines = (ArrayList<String>) Files.readAllLines(filePath);

    } catch (IOException e) {
      e.printStackTrace();
    }
    return lines;
  }

  public static ArrayList<Integer> getLotteryNumbers(ArrayList<String> lines) {
    ArrayList<Integer> lotteryNumbers = new ArrayList<>();
    for (String line : lines) {
      String[] lineParts = line.split(";");
      for (int i = lineParts.length - 5; i < lineParts.length; i++) {
        lotteryNumbers.add(Integer.valueOf(lineParts[i]));
      }
    }
    return lotteryNumbers;
  }

  public static HashMap<Integer, Integer> countFrequency(ArrayList<Integer> numbers) {
    HashMap<Integer, Integer> mapping = new HashMap<>();

    for (int i = 0; i < numbers.size(); i++) {
      if (mapping.containsKey(numbers.get(i))) {
        int frequency = mapping.get(numbers.get(i));
        frequency++;
        mapping.put(numbers.get(i), frequency);

      } else {
        mapping.put(numbers.get(i), 1);
      }
    }
    return mapping;
  }

  public static HashMap<Integer, Integer> sortMap(HashMap<Integer, Integer> frequencies) {
    HashMap<Integer, Integer> topFive = new HashMap<>();
    int maxValue = frequencies.get(1);

    for (int i = 2; i < frequencies.size(); i++) {
      if (frequencies.get(i) > maxValue) {
        maxValue = frequencies.get(i);
      }
    }
    for (Map.Entry<Integer, Integer> frequency :  frequencies.entrySet()) {
      if(frequency.getValue() == maxValue){
        topFive.put(frequency.getKey(), maxValue);
      }
    }
    return topFive;
  }
}
