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
      todoList.add(new Todo(args[1]));

    } else if (args[0].equals("-r")) {


    } else if (args[0].equals("-c")) {

    }
  }
}
