import javax.xml.transform.Source;
import java.sql.SQLOutput;

public class PetrolStationMain {
  public static void main(String[] args) {
    Car Volkswagen = new Car("MEH750", 30);
    Car Opel = new Car("PCG138", 45);
    Station Mol = new Station("Mol", 500);
    Station Lukoil = new Station("Lukoil", 300);

    System.out.println(Volkswagen);
    System.out.println(Mol);
    Mol.refill(Volkswagen);
    System.out.println(Volkswagen);
    System.out.println(Mol);
    System.out.println();
    System.out.println(Opel);
    System.out.println(Lukoil);
    Lukoil.refill(Opel);
    System.out.println(Opel);
    System.out.println(Lukoil);

  }
}
