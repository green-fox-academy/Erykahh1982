import java.util.Random;
import java.util.Scanner;

public class GuessMyNumber {
  public static void main(String[] args) {
    int guess = 0;
    int attempts = 0;
    int random = 0;
    guessMyNumber(random, guess, attempts);

  }

  public static void guessMyNumber(int random, int guess, int attempt) {

    Scanner input = new Scanner(System.in);
    Random generator = new Random();
    random = generator.nextInt(100) + 1;
    System.out.println("I've the number between 1-100. You have 5 attempts. Give it a try and find out what is on my mind!");
    int attempts;
    boolean guessed;

    do {
      guess = input.nextInt();
      guessed = guess == random;
      if (!guessed) {
        attempt -= 1;
        if (guess > random) {
          System.out.println("Too high! You have " + attempt + " attepmts left");
        } else {
          System.out.println("Too low! You have " + attempt + " attempts left");
        }
      }
    } while (!guessed && attempt >= 1);

    if (guessed) {
      System.out.println("Congratulations. You won!");
    } else {
      System.out.println("You lost, unfortunately you have used all your 5 lives");
    }
  }

}