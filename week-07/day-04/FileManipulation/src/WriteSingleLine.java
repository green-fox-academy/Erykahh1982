import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class WriteSingleLine {
  public static void main(String[] args) {
    ArrayList<String> newName = new ArrayList<>();
    newName.add("Kovács-Posta Erika");

    try {
      Path filePath = Paths.get("Assets/my-file.txt");
      Files.write(filePath, newName);
    } catch (IOException e) {
      System.out.println("Unable to write file: my-file.txt");
    }
  }
}
