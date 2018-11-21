public class SharpieMain {
  public static void main(String[] args) {
    Sharpie sharpie01 = new Sharpie("blue", 10f);
    Sharpie sharpie02 = new Sharpie("yellow", 15f);
    Sharpie sharpie03 = new Sharpie("red", 78f);

    sharpie01.use();
    sharpie02.use();
    sharpie03.use();

    System.out.println(sharpie01);
    System.out.println(sharpie02);
    System.out.println(sharpie03);

  }
}
