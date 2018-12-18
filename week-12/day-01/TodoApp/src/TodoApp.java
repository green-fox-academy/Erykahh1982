import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class TodoApp implements Serializable {
  public static void main(String[] args) {

    TodoList todoList = new TodoList();

    if (args.length == 0) {
      System.out.println(todoList.usage());

    } else if (args[0].equals("-l")) {
      todoList.list();
      System.out.println(todoList);

    } else if ((args[0].equals(("-a")))) {
      if (args.length == 1) {
        System.out.println("Oooops, unable to execute command, as no task has been entered");
      } else {
        todoList.add(new Todo(args[1]));
      }

    } else if (args[0].equals("-r")) {
      if (args.length == 1) {
        System.out.println("Oooops, unable to execute command, as no list item has been selected");
      } else {
        todoList.remove(args[1]);
      }

    } else if (args[0].equals("-c")) {
      if (args.length == 1) {
        System.out.println("Oooops, unable to execute command, as no list item has been selected");
      } else {
        todoList.toComplete(args[1]);
      }
    }
  }

}
