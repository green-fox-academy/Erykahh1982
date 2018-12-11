/**
 * Created by aze on 2017.03.29..
 */
public class Thing implements Comparable<Thing> {
  private String name;
  private boolean completed;

  public Thing(String name) {
    this.name = name;
  }

  public void complete() {
    this.completed = true;
  }

  @Override
  public String toString() {
    return (completed ? "[x] " : "[ ] ") + name;
  }

  @Override
  public int compareTo(Thing otherThing) {
    if (!completed) {
      if (otherThing.isCompleted()) {
        return -1;
      } else {
        return name.compareTo(otherThing.getName());
      }
    } else {
      if (!otherThing.isCompleted()) {
        return 1;
      } else {
        return name.compareTo(otherThing.getName());
      }
    }
  }

  public String getName() {
    return name;
  }

  public boolean isCompleted() {
    return completed;
  }

}
