public class Student {
  private String name;
  private int ig;
  private int numberOfQuestions;

  public Student(String name, int iq, int numberOfQuestions) {
    this.name = name;
    this.ig = iq;
    this.numberOfQuestions = numberOfQuestions;
  }

  public void learn() {
    ig++;
    numberOfQuestions--;
  }

  @Override
  public String toString() {
    return "Student{" +
        "Student name :'" + name + '\'' +
        ", who has an IQ of :" + ig +
        ", and who has a number of questions :" + numberOfQuestions +
        '}';
  }

  public void question(Teacher name) {
    name.answer();
    numberOfQuestions--;
  }

  public int getNumberOfQuestions() {
    return numberOfQuestions;
  }

  public void setNumberOfQuestions(int numberOfQuestions) {
    this.numberOfQuestions = numberOfQuestions;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getIg() {
    return ig;
  }

  public void setIg(int ig) {
    this.ig = ig;
  }
}
