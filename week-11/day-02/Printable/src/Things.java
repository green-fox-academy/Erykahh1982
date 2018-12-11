public class Things implements Printable {
  private String name;
  private boolean completed;
  private Iterable<? extends Things> things;

  public Things(String name) {
    this.name = name;
  }

  public void complete() {
    this.completed = true;
  }

  @Override
  public String toString() {
    return (completed ? "[x] " : "[ ] ") + name;
  }

  public String getName() {
    return name;
  }

  public boolean isCompleted() {
    return completed;
  }

  @Override
  public void printAllFields() {
    System.out.println((completed ? "[x] " : "[ ] ") + name);
  }

}
