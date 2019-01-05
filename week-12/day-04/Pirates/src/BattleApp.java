import java.util.ArrayList;

public class BattleApp {
  public static void main(String[] args) {

    Pirate pirate1 = new Pirate();
    System.out.println(pirate1.getRumLevel());
    pirate1.drinkSomeRum();
    pirate1.howItGoingMate();
    System.out.println(pirate1.getStatus());
    pirate1.drinkSomeRum();
    pirate1.drinkSomeRum();
    pirate1.drinkSomeRum();
    pirate1.drinkSomeRum();
    pirate1.howItGoingMate();
    pirate1.setName("Jack Sparrow");
    System.out.println(pirate1.getStatus());
    System.out.println();

    Pirate pirate2 = new Pirate();
    pirate2.setName("Captain Hook");
    pirate2.drinkSomeRum();
    pirate2.drinkSomeRum();
    pirate2.drinkSomeRum();
    pirate2.howItGoingMate();
    pirate2.drinkSomeRum();
    pirate2.howItGoingMate();
    System.out.println(pirate2.getStatus());
    System.out.println();

    Pirate pirate3 = new Pirate();
    Pirate pirate4 = new Pirate();
    pirate3.setName("Jonathan James");
    pirate4.setName("Manuel Diego");
    System.out.println(pirate3.getStatus());
    System.out.println(pirate4.getStatus());
    pirate3.brawl(pirate4);
    System.out.println(pirate3.getStatus());
    System.out.println(pirate4.getStatus());
    System.out.println();

    Ship ship1 = new Ship();
    ship1.setShipName("Black Perl");
    ship1.fillShip();
    System.out.println(ship1.getStatus());
    System.out.println();
    System.out.println("The number of awaken pirates is: " + ship1.getNrOfAwakes());
    System.out.println("The number of alive pirates is :" + ship1.getNrOfAlives());

    System.out.println();
    Ship enemyShip = new Ship();
    enemyShip.setShipName("Black Snakes");
    enemyShip.fillShip();
    System.out.println(enemyShip.getStatus());
    System.out.println();

    ship1.battle(enemyShip);
    System.out.println(ship1.getStatus());
    System.out.println(enemyShip.getStatus());
  }

}
