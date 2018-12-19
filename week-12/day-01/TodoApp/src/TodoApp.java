public class TodoApp {
  public static void main(String[] args) {

    TodoList todoList = new TodoList();
    ArgumentChecker argumentChecker = new ArgumentChecker();

    if (args.length == 0) {
      System.out.println(todoList.usage());

    } else if (args[0].equals("-l")) {
      argumentChecker.argumentCheckWhenList(args, todoList);

    } else if ((args[0].equals(("-a")))) {
      argumentChecker.argumentCheckWhenAdd(args, todoList);

    } else if (args[0].equals("-r")) {
      argumentChecker.argumentCheckWhenRemove(args, todoList);

    } else if (args[0].equals("-c")) {
      argumentChecker.argumentCheckWhenComplete(args, todoList);
    } else {
      argumentChecker.argumentCheckForSyntax(args, todoList);
    }
  }

}