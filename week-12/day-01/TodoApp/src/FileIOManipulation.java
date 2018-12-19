import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class FileIOManipulation {

  public static ArrayList<Todo> readFile() {
    Path filePath = Paths.get("todosList.txt");
    ArrayList<String> content = new ArrayList<String>();

    try {
      content = (ArrayList<String>) Files.readAllLines(filePath);
    } catch (IOException e) {
      System.out.println("An error happened, unfortunately, the file is not found");
    }
    ArrayList<Todo> actualTodoList = new ArrayList<>();

    for (int i = 0; i < content.size(); i++) {
      String[] lineParts = content.get(i).split(";");
      Todo todo = new Todo();
      todo.setCompleted(lineParts[0].equals("1"));
      if (lineParts.length > 1) {
        todo.setTask(lineParts[1]);
        actualTodoList.add(todo);
      }
    }
    return actualTodoList;
  }

  public static void writeFile(ArrayList<Todo> todoList) {
    Path filePath = Paths.get("todosList.txt");
    ArrayList<String> updatedList = new ArrayList<>();

    for (int i = 0; i < todoList.size(); i++) {
      if (todoList.get(i).isCompleted()) {
        updatedList.add("1;" + todoList.get(i).getTask());
      } else {
        updatedList.add("0;" + todoList.get(i).getTask());
      }
      try {
        Files.write(filePath, updatedList);
      } catch (IOException e) {
        System.out.println("An error happened, unfortunately, the file is not found");
      }
    }
  }

}