public class DiceSetMain {
  public static void main(String[] args) {
    // You have a `DiceSet` class which has a list for 6 dice
    // You can roll all of them with roll()
    // Check the current rolled numbers with getCurrent()
    // You can reroll with reroll()
    // Your task is to roll the dice until all of the dice are 6

    DiceSet diceSet = new DiceSet();
    //creating our object diceset
    System.out.println(diceSet.getCurrent());
    //printing out the current thrown numbers of all the dices
    System.out.println(diceSet.roll());
    //printing out the roll result of a throw with 6dices as an ArrayList

    for (int i = 0; i < 6; i++) {
      while (diceSet.getCurrent(i) != 6) {
        diceSet.reroll(i);
        //while all the dices does not equal to 6, we have to reroll the dices
      }
    }
    System.out.println("The result of the game is :" + diceSet.getCurrent());
    //printing out the current dice.set as an ArrayList
  }
}
