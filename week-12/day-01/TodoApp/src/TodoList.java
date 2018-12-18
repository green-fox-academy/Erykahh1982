import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class TodoList {

  private ArrayList<Todo> listOfTasks;
  String fileName = "todosList.txt";

  public TodoList() {
    this.listOfTasks = new ArrayList<Todo>();
  }

  public void add(Todo todo) {
    listOfTasks = FileIOManipulation.readFile();
    listOfTasks.add(todo);
    FileIOManipulation.writeFile(listOfTasks);
  }

  public void list() {
    listOfTasks = FileIOManipulation.readFile();
  }

  public String usage() {
    return " Command Line Todo application \n" +
        " ============================= \n" +
        " Command line arguments: \n " +
        "  -l   Lists all the tasks \n " +
        "  -a   Adds a new task \n " +
        "  -r   Removes a task \n " +
        "  -c   Completes a task \n ";
  }

  /*public remove(Todo todo){}

  public complete(Todo todo) {

  }*/

  public ArrayList<Todo> getListOfTasks() {
    return listOfTasks;
  }

  @Override
  public String toString() {
    String output = "";
    for (int i = 0; i < listOfTasks.size(); i++) {
      output += (i + 1) + ". " + listOfTasks.get(i) + "\n";
    }
    return output;
  }
}

