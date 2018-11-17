public class HomeworkTrees {
  String type;
  String leafColor;
  int age;
  String sex;

  public HomeworkTrees() {
    this("empty", "empty", 0, "empty");
  }

  public HomeworkTrees(String type, String leafColor, int age, String sex) {
    this.type = type;
    this.leafColor = leafColor;
    this.age = age;
    this.sex = sex;
  }

  public static void main(String[] args) {
    HomeworkTrees tree1 = new HomeworkTrees("willow", "green", 15, "male");
    HomeworkTrees tree2 = new HomeworkTrees("oak", "green", 65, "male");
    HomeworkTrees tree3 = new HomeworkTrees("plum", "yellow", 45, "female");
    HomeworkTrees tree4 = new HomeworkTrees("pine", "green", 105, "female");
    HomeworkTrees tree5 = new HomeworkTrees("chestnut", "brown", 85, "female");
  }
}


