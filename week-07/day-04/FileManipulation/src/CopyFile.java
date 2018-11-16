import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class CopyFile {
  public static void main(String[] args) {
    String fileName1 = "my-file.txt";
    String fileName2 = "new-file.txt";
    copyFiles(fileName1, fileName2);
    System.out.println(copyFiles(fileName1, fileName2));

  }

  public static boolean copyFiles(String fileName1, String fileName2) {
    Path fileName1Path = Paths.get("Asset/" + fileName1);
    Path fileName2Path = Paths.get("Asset/" + fileName2);
    ArrayList<String> fileContent = null;

    try {
      fileContent = (ArrayList<String>) Files.readAllLines(fileName1Path);
    } catch (IOException e) {
      e.printStackTrace();
    }

    try {
      Files.write(fileName2Path, fileContent);
    } catch (IOException e) {
      e.printStackTrace();
      return false;
    }
    return true;
  }
}
