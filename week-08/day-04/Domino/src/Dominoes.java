import java.util.ArrayList;
import java.util.List;

public class Dominoes {
  public static void main(String[] args) {
    List<Domino> dominoes = initializeDominoes();
    // You have the list of Dominoes
    // Order them into one snake where the adjacent dominoes have the same numbers on their adjacent sides
    // eg: [2, 4], [4, 3], [3, 5] ...
    dominoes = orderDominoes(dominoes);
    System.out.println(dominoes);
  }

  private static List<Domino> orderDominoes(List<Domino> dominoes) {
    List<Domino> orderedDominoes = new ArrayList<>();

    Domino mostRight = replaceDomino(dominoes, orderedDominoes, dominoes.get(0));

    while (dominoes.size() > 0) {
      Domino nextDomino = findNextDomino(mostRight.getRightSide(), dominoes);
      if (nextDomino == null) {
        return orderedDominoes;
      }
      mostRight = replaceDomino(dominoes, orderedDominoes, nextDomino);
    }

    return orderedDominoes;
  }

  private static Domino findNextDomino(int rightSide, List<Domino> dominoes) {
    for (Domino domino : dominoes) {
      if (domino.getLeftSide() == rightSide) {
        return domino;
      }
    }
    return null;
  }

  private static Domino replaceDomino(List<Domino> dominoes, List<Domino> orderedDominoes, Domino chosenDomino) {
    orderedDominoes.add(chosenDomino);
    dominoes.remove(chosenDomino);
    return chosenDomino;
  }

  static List<Domino> initializeDominoes() {
    List<Domino> dominoes = new ArrayList<>();
    dominoes.add(new Domino(5, 2));
    dominoes.add(new Domino(4, 6));
    dominoes.add(new Domino(1, 5));
    dominoes.add(new Domino(6, 7));
    dominoes.add(new Domino(2, 4));
    dominoes.add(new Domino(7, 1));
    return dominoes;
  }

}