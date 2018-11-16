import java.io.IOException;
import java.lang.reflect.Array;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Logs {
  public static void main(String[] args) {
    String pathOfFile = "Asset/log.txt";
    System.out.println(Arrays.toString(readAllUniques()));
    System.out.println(ratio());
  }

  public static String[] readAllUniques() {
    Path pathOfLog = Paths.get("Asset/log.txt");
    ArrayList<String> lines = null;
    ArrayList<String> uniqueList = new ArrayList<>();
    String[] uniqueIPaddress = new String[uniqueList.size()];

    try {
      lines = (ArrayList<String>) Files.readAllLines(pathOfLog);
      for (int i = 0; i < lines.size(); i++) {
        String line = lines.get(i);
        String ipAddress = line.substring(27, 38);
        if (!uniqueList.contains(ipAddress)) {
          uniqueList.add(ipAddress);
        }
      }
    } catch (IOException IOex) {
      IOex.printStackTrace();
    }
    return uniqueList.toArray(uniqueIPaddress);
  }

  public static double ratio() {
    Path pathOfLog = Paths.get("Asset/log.txt");
    ArrayList<String> lines = null;
    double sumPosts = 0;
    double sumGets = 0;
    double ratioResult = 0;

    try {
      lines = (ArrayList<String>) Files.readAllLines(pathOfLog);
      for (int i = 0; i < lines.size(); i++) {
        String line = lines.get(i);
        if (line.charAt(41) == 'P') {
          sumPosts++;
        } else {
          sumGets++;
        }
      }
      ratioResult = sumGets / sumPosts;
    } catch (IOException IOex) {
      IOex.printStackTrace();
    }
    return ratioResult;
  }
}
