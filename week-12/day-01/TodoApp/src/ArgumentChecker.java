public class ArgumentChecker {

  public void argumentCheckForSyntax(String[] args, TodoList todoList) {
    if (args[0] != null && !args[0].equals("-l") && !args[0].equals("-a") && !args[0].equals("-c") && !args[0].equals("-r")) {
      System.out.println("Unsupported argument");
      System.out.println(todoList.usage());
    }
  }

  public void argumentCheckWhenAdd(String[] args, TodoList todoList) {
    if (args.length == 1) {
      System.out.println("Oooops, unable to execute command, as no task has been entered");
    } else {
      todoList.add(new Todo(args[1]));
    }
  }

  public void argumentCheckWhenRemove(String[] args, TodoList todoList) {
    if (args.length == 1) {
      System.out.println("Oooops, unable to execute command, as no list item has been selected");
    } else {
      todoList.remove(args[1]);
    }
  }

  public void argumentCheckWhenComplete(String[] args, TodoList todoList) {
    if (args.length == 1) {
      System.out.println("Oooops, unable to execute command, as no list item has been selected");
    } else {
      todoList.toComplete(args[1]);
    }
  }

  public void argumentCheckWhenList(String[] args, TodoList todoList) {
    if (args.length == 1) {
      todoList.list();
      System.out.println(todoList);
    }
  }

}