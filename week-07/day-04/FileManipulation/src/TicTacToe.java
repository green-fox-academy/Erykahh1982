import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class TicTacToe {
  public static void main(String[] args) {

    System.out.println(ticTacResult("win-o.txt"));
    System.out.println(ticTacResult("win-x.txt"));
    System.out.println(ticTacResult("draw.txt"));
  }


  public static ArrayList<String> readFileLines(String fileName) {
    Path pathOfFile = Paths.get("Asset/" + fileName);
    ArrayList<String> lines = new ArrayList<>();
    //creating an ArrayList named lines which will have the file content per each line

    try {
      lines = (ArrayList<String>) Files.readAllLines(pathOfFile);
      //reading all the lines of the given file (reaching it through it's path) in list List format, which has been converted to ArrayList
      //in order to use the ArrayList built in methods later
    } catch (IOException e) {
      System.out.println("Unfortunately " + fileName + "is not found");
      //if the system doesn't find the file through the given path, it should return an Input/Output exception error message
    }
    return lines;
    //otherwise lines should be stored in ArrayList named lines
  }

  public static String ticTacResult(String fileName) {
    ArrayList<String> lines = readFileLines(fileName);
    //creating a new ArrayList that will contain the lines of the chosen file, via calling 'readFileLines' method
    for (String line : lines) {
      //enhanced for loop to print the content of a given file
      System.out.println(line);
    }

    for (int i = 0; i < lines.size(); i++) {
      boolean matchInRow = true;
      for (int j = 0; j < lines.size() - 1; j++) {
        matchInRow = matchInRow && lines.get(i).charAt(j) == lines.get(i).charAt(j + 1);
        //check if a character at a position equals the upcoming character in a given row
      }
      if (matchInRow) {
        return String.valueOf(lines.get(i).charAt(0));
        //if we have 3 consecutive same characters in a row, the system should print the String-character of the 1st position
      }
    }

    for (int j = 0; j < lines.size(); j++) {
      boolean matchInColumn = true;
      for (int i = 0; i < lines.size() - 1; i++) {
        matchInColumn = matchInColumn && lines.get(i).charAt(j) == lines.get(i + 1).charAt(j);
        //check if a character at a position equals the upcoming character in a given column
      }
      if (matchInColumn) {
        return String.valueOf(lines.get(0).charAt(j));
        //if we have 3 consecutive same characters in a column, the system should print the String-character of the 1st position
      }
    }

    boolean diagonalMatch01 = true;
    for (int i = 0; i < lines.size() - 1; i++) {
      diagonalMatch01 = diagonalMatch01 && lines.get(i).charAt(i) == lines.get(i + 1).charAt(i + 1);
      //checking diagonal from top left corner to down right corner
    }
    if (diagonalMatch01) {
      return String.valueOf(lines.get(0).charAt(0));
      //returning the String-character at coordinates (0,0)
    }

    boolean diagonalMatch02 = true;
    for (int i = 0; i < lines.size() - 1; i++) {
      diagonalMatch02 = diagonalMatch02 && lines.get(i).charAt(lines.size() - 1 - i) == lines.get(i + 1).charAt(lines.size() - 2 - i);
      //checking diagonal from top right corner to down left corner
    }
    if (diagonalMatch02) {
      return String.valueOf(lines.get(0).charAt(lines.size() - 1));
      //returning the String-character at coordinates (0,2)
    }
    return "Draw";
    //if there is no win situation in the game, the program should return String "Draw"
  }
}
