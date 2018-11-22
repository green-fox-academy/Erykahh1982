public class Teacher {
  private String name;
  private String subject;
  private int numberOfMaterialTaught;

  @Override
  public String toString() {
    return "Teacher{" +
        "Teacher named " + name + '\'' +
        ", is teaching " + subject + '\'' +
        ", and has this number of material to teach : " + numberOfMaterialTaught +
        '}';
  }

  public Teacher(String name, String subject, int numberOfMaterialTaught) {
    this.name = name;
    this.subject = subject;
    numberOfMaterialTaught = numberOfMaterialTaught;
  }

  public void teach() {
    numberOfMaterialTaught++;
  }

  public void answer() {
    numberOfMaterialTaught++;
  }

  public String getSubject() {
    return subject;
  }

  public void setSubject(String subject) {
    this.subject = subject;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAnsweredQuestions() {
    return numberOfMaterialTaught;
  }

  public void setAnsweredQuestions(int answeredQuestions) {
    this.numberOfMaterialTaught = answeredQuestions;
  }
}
