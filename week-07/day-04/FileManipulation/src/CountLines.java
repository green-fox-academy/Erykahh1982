import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class CountLines {
  public static void main(String[] args) {
    String fileName = "my-file.txt";
    countLines(fileName);
  }

  public static void countLines(String file) {
    Path filePath = Paths.get("/Asset" + file);
    List<String> lines = new ArrayList<>();
    int lineCount = 0;
    try {
      lines = Files.readAllLines(filePath);
      for (int i = 0; i < lines.set(); i++) {
        lineCount++;
      }
      System.out.println("Number of lines found in the file is : " + lineCount);
    } catch (IOException e) {
      System.out.println("0");
    }
  }
}
