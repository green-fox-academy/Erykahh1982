package GFA;

import java.util.ArrayList;

public class Cohort {
  private String name;
  private ArrayList<Student> students;
  private ArrayList<Mentor> mentors;

  public Cohort(String name) {
    this.name = name;
    students = new ArrayList<>();
    mentors = new ArrayList<>();
  }

  public void info() {
    System.out.println("The " + name + "cohort has " + students.size() + "students and " + mentors.size() + " mentors");
  }

  public void addMentor(Mentor mentor) {
    mentors.add(mentor);
  }

  public void addStudent(Student student) {
    students.add(student);
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ArrayList<Student> getStudents() {
    return students;
  }

  public void setStudents(ArrayList<Student> students) {
    this.students = students;
  }

  public ArrayList<Mentor> getMentors() {
    return mentors;
  }

  public void setMentors(ArrayList<Mentor> mentors) {
    this.mentors = mentors;
  }

}

