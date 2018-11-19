import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class ReversedLines {
  public static void main(String[] args) {
    String originalFile = "reversed-line.txt";
    String correctedFile = "corrected-line.txt";
    System.out.println("Original file content has been reversed : " + copyContent(originalFile, correctedFile));

  }

  public static ArrayList<String> readFile(String fileName) {
    Path pathOfFile = Paths.get("Asset/" + fileName);
    ArrayList<String> lines = new ArrayList<>();

    try {
      lines = (ArrayList<String>) Files.readAllLines(pathOfFile);
    } catch (IOException e) {
      System.out.println("Unfortunately " + fileName + "doesn't exists");
    }
    return lines;
  }

  public static ArrayList<String> reverseFileContent(ArrayList<String> lines) {
    ArrayList<String> reversedLines = new ArrayList<String>();
    for (String line : lines) {
      StringBuilder reverseLine = new StringBuilder(line);
      reverseLine.reverse();
      reversedLines.add(reverseLine.toString());
    }
    return reversedLines;
  }

  public static boolean writeFile(String correctedFile, ArrayList<String> lines) {

    try {
      Files.write(Paths.get("Asset/" + correctedFile), lines);
      return true;
    } catch (IOException e) {
      e.printStackTrace();
    }
    return false;
  }

  public static boolean copyContent(String originalFile, String correctedFile) {
    ArrayList<String> lines = readFile(originalFile);
    ArrayList<String> correctedLines = reverseFileContent(lines);
    return writeFile(correctedFile, correctedLines);
  }
}
