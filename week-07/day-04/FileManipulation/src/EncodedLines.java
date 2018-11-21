import java.io.IOException;
    import java.nio.file.Files;
    import java.nio.file.Path;
    import java.nio.file.Paths;
    import java.util.ArrayList;

public class EncodedLines {
  public static void main(String[] args) {
    String originalFile = "encoded-lines.txt";
    String correctedFile = "decoded-lines.txt";
    System.out.println("Original file content has been decoded : " + copyContent(originalFile, correctedFile));

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

  public static ArrayList<String> decodeFileContent(ArrayList<String> lines) {
    ArrayList<String> decodedLines = new ArrayList<>();

    for (int i = 0; i < lines.size(); i++) {
      char[] line = lines.get(i).toCharArray();

      for (int j = 0; j < line.length; j++) {
        line[j]--;
      }
      decodedLines.add(String.valueOf(line));
    }
    return decodedLines;
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
    ArrayList<String> correctedLines = decodeFileContent(lines);
    return writeFile(correctedFile, correctedLines);
  }
}
