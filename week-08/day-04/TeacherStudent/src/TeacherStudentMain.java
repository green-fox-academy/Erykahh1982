import java.sql.SQLOutput;

public class TeacherStudentMain {
  public static void main(String[] args) {
    Teacher Paul = new Teacher("Paul", "Physics", 2);
    Teacher Rose = new Teacher("Rose", "Literature", 5);
    Student Michael = new Student("Michael", 110, 5);
    Student Sarah = new Student("Sarah", 130, 3);

    System.out.println(Sarah);
    Sarah.learn();
    Sarah.question(Paul);
    Paul.answer();
    Paul.getAnsweredQuestions();
    System.out.println(Sarah);
    System.out.println(Paul);

    System.out.println(Michael);
    Rose.teach();
    Rose.getSubject();
    Michael.question(Rose);
    Michael.learn();
    System.out.println(Rose);
    System.out.println(Michael);
  }
}
