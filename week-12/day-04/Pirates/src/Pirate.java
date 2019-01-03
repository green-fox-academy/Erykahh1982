import java.util.Random;

public class Pirate {

  private String name;
  private int rumLevel;
  private boolean isPassedOut;
  private boolean isDead;

  public Pirate() {

  }

  public void drinkSomeRum() {
    if (this.isDead) {
      System.out.println("He cannot drink rum, as he is dead");
    } else if (this.isPassedOut) {
      System.out.println("He cannot drink rum, as he is passed out");
    } else {
      rumLevel += 1;
    }
  }

  public void howItGoingMate() {
    if (this.isDead) {
      System.out.println("He is dead");
    } else if (this.isPassedOut) {
      System.out.println("He is passed out");
    } else {
      if (rumLevel <= 4) {
        System.out.println("Pour me anudder!");
        this.drinkSomeRum();
      } else {
        System.out.println("Arghh, I'ma Pirate. How d'ya d'ink its goin?");
        setPassedOut(true);
      }
    }
  }

  public void brawl(Pirate otherPirate) {
    int randomNumber = (int) (Math.random() * 3);
    if (randomNumber == 0) {
      this.setDead(true);
    }
    if (randomNumber == 1) {
      otherPirate.setDead(true);
    }
    if (randomNumber == 2) {
      this.setPassedOut(true);
      otherPirate.setPassedOut(true);
    }
  }

  public void die() {
    this.setDead(true);
  }

  public String getStatus() {
    String pirateStatus = "";
    pirateStatus += "The name of the pirate is: " + this.getName() + " ,his rum level is: " + this.getRumLevel();
    if (this.isDead()){
      pirateStatus += " | He is dead";
    } else {
      pirateStatus += " | He is alive";
    } if(this.isPassedOut()){
        pirateStatus += " | He is passed out";
      } else {
      pirateStatus += " | He is awake";
    }
    return pirateStatus;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getRumLevel() {
    return rumLevel;
  }

  public void setRumLevel(int rumLevel) {
    this.rumLevel = rumLevel;
  }

  public boolean isPassedOut() {
    return isPassedOut;
  }

  public void setPassedOut(boolean passedOut) {
    isPassedOut = passedOut;
  }

  public boolean isDead() {
    return isDead;
  }

  public void setDead(boolean dead) {
    isDead = dead;
  }
}
