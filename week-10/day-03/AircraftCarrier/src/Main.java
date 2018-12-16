public class Main {
  public static void main(String[] args) {

    Carrier nationalFleet = new Carrier("National Fleet", 300, 500);
    nationalFleet.add(new F16());
    nationalFleet.add(new F16());
    nationalFleet.add(new F16());
    nationalFleet.add(new F35());
    nationalFleet.add(new F35());
    System.out.println("National Fleet status report");
    System.out.println(nationalFleet.getStatus());
    System.out.println();

    Carrier enemyFleet = new Carrier("Enemey Fleet", 500, 400);
    enemyFleet.add(new F35());
    enemyFleet.add(new F35());
    enemyFleet.add(new F35());
    enemyFleet.add(new F35());
    enemyFleet.add(new F16());
    enemyFleet.add(new F16());
    enemyFleet.add(new F16());
    System.out.println("Enemy Fleet status report");
    System.out.println(enemyFleet.getStatus());
    System.out.println();

    System.out.println("Filling the carriers before fight");
    nationalFleet.fill();
    enemyFleet.fill();
    System.out.println(nationalFleet.getStatus());
    System.out.println(enemyFleet.getStatus());
    System.out.println();

    System.out.println("Let the fight begin!");
    nationalFleet.fight(enemyFleet);
    System.out.println(nationalFleet.getStatus());
    System.out.println(enemyFleet.getStatus());
    System.out.println();

    System.out.println("Trying to refill the carriers for a 2nd battle");
    enemyFleet.fill();
    nationalFleet.fill();
    enemyFleet.fight(nationalFleet);
    System.out.println();
    System.out.println(enemyFleet.getStatus());
    System.out.println(nationalFleet.getStatus());
  }

}
