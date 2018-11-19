import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class Doubled {
  public static void main(String[] args) {
    String originalFile = "duplicated-chars.txt";
    String correctedFile = "corrected-chars.txt";
    System.out.println("Original file content revised and copied to corrected file :" + copyContent(originalFile, correctedFile));
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

  public static ArrayList<String> decodeFile(ArrayList<String> lines) {
    ArrayList<String> decryptedLines = new ArrayList<>();

    for (String line : lines) {
      StringBuilder lineWithoutDuplications = new StringBuilder(line);

      for (int i = 1; i < lineWithoutDuplications.length(); i += 2) {
        lineWithoutDuplications.deleteCharAt(i);
        i--;
      }
      decryptedLines.add(lineWithoutDuplications.toString());
    }
    return decryptedLines;
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
    ArrayList<String> correctedLines = decodeFile(lines);
    return writeFile(correctedFile, correctedLines);
  }
}

