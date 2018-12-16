import java.util.List;

public class SubStrList {
  public static void main(String[] args) {

    String[] searchArr = new String[]{"this", "is", "what", "I'm", "searching"};
    System.out.println(subStrList("ching", searchArr));
    System.out.println(subStrList("not", searchArr));

  }

  private static int subStrList(String s, String[] searchArr) {

    for (int i = 0; i < searchArr.length; i++) {
      if (searchArr[i].indexOf(s) >= 0) {
        return i;
      }
    }
    return -1;
  }

}