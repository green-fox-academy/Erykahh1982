import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class WriteMultipleLines {
  public static void main(String[] args) {
    String pathOfFile = "Asset/my-file.txt";
    String word = "Greenfox";
    int number = 10;
    writeMultipleLines(pathOfFile, word, number);
  }

  public static void writeMultipleLines(String pathOfFile, String word, int number) {
    ArrayList<String> wordToAdd = new ArrayList<>();
    for (int i = 0; i < number; i++) {
      wordToAdd.add(i, word);
    }
    for (int i = 0; i < wordToAdd.size(); i++) {
      System.out.println(wordToAdd.get(i));
    }
    try {
      Path path = Paths.get(pathOfFile);
      Files.write(path, wordToAdd);
    } catch (IOException e) {
      System.out.println("");
    }
  }
}
