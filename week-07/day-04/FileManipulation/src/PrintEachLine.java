import java.awt.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class PrintEachLine {
  public static void main(String[] args) {

    print("my-file.txt");

  }

  public static void print(String file) {
    try {
      Path filePath = Paths.get("C:\\Users\\Allianz\\Desktop\\A4M-JPM\\greenfox\\Erykahh1982\\week-07\\day-04\\FileManipulation\\Asset\\" + file);
      ArrayList<String> lines = (ArrayList<String>) Files.readAllLines(filePath);
      for (String line : lines) {
        System.out.println(line);
      }
    } catch (IOException e) {
      System.out.println("Unable to read file: " + file);
    }
  }
}
