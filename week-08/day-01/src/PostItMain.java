public class PostItMain {
  public static void main(String[] args) {
    PostIt postit01 = new PostIt("orange", "Idea", "blue");
    PostIt postIt02 = new PostIt("pink", "Awesome", "black");
    PostIt postIt03 = new PostIt("yellow", "Superb", "green");

    System.out.println(postit01.getBackgroundColor() + postit01.getTextColor() + postit01.getText());
    System.out.println(postIt02.getBackgroundColor() + postIt02.getTextColor() + postIt02.getText());
    System.out.println(postIt03.getBackgroundColor() + postIt03.getTextColor() + postIt03.getText());
  }
}
