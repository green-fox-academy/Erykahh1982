import java.util.ArrayList;

public class SharpieMain {
  public static void main(String[] args) {
    Sharpie sharpie01 = new Sharpie("blue", 10f, 2f);
    Sharpie sharpie02 = new Sharpie("yellow", 15f, 30f);
    Sharpie sharpie03 = new Sharpie("red", 78f, 50f);

    SharpieSet collectionOfSharpies = new SharpieSet();
    collectionOfSharpies.add(sharpie01);
    collectionOfSharpies.add(sharpie02);
    collectionOfSharpies.add(sharpie03);

    collectionOfSharpies.display();
    System.out.println();
    sharpie01.use();
    sharpie01.use();
    collectionOfSharpies.countUsable();
    System.out.println();
    collectionOfSharpies.display();
    System.out.println();
    collectionOfSharpies.removeTrash();
    collectionOfSharpies.display();


  }
}
