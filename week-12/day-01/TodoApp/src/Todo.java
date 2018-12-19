public class Todo {
  private String task;
  private boolean isCompleted;

  public Todo() {
  }

  public Todo(String task) {
    this.task = task;
  }

  public boolean isCompleted() {
    return isCompleted;
  }

  public String getTask() {
    return task;
  }

  public void setTask(String task) {
    this.task = task;
  }

  public void setCompleted(boolean completed) {
    isCompleted = completed;
  }

  @Override
  public String toString() {
    return (isCompleted ? "[x] " : "[ ] ") + task;
  }

}