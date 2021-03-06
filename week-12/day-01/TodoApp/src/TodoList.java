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
    if (listOfTasks.isEmpty()) {
      System.out.println("Hooray, no tasks for today! :-)");
    }
  }

  public void remove(String index) {
    listOfTasks = FileIOManipulation.readFile();
    try {
      int indexToRemove = Integer.parseInt(index);
      listOfTasks.remove(indexToRemove - 1);
    } catch (IndexOutOfBoundsException e) {
      System.out.println("Unable to remove: index is out of bound");
    } catch (NumberFormatException e) {
      System.out.println("The entered index to complete a task is not in the expected format, please enter a number");
    }
    FileIOManipulation.writeFile(listOfTasks);
  }

  public void toComplete(String index) {
    listOfTasks = FileIOManipulation.readFile();
    try {
      int indexToComplete = Integer.parseInt(index);
      if (!listOfTasks.get(indexToComplete - 1).isCompleted()) {
        listOfTasks.get(indexToComplete - 1).setCompleted(true);
      } else {
        System.out.println(listOfTasks.get(indexToComplete - 1).getTask() + ": is already completed, no need to redo that");
      }
    } catch (IndexOutOfBoundsException e) {
      System.out.println("Unable to complete: index is out of bound");
    } catch (NumberFormatException e) {
      System.out.println("The entered index to complete a task is not in the expected format");
    } catch (Exception e) {
      System.out.println("Unable to check: no index provided");
    }
    FileIOManipulation.writeFile(listOfTasks);
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