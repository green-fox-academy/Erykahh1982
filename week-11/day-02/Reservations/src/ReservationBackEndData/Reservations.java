package ReservationBackEndData;

public class Reservations implements ReservationInterface {

  private String getDowBooking;
  private String getCodeBooking;

  public Reservations() {
    this.getCodeBooking = null;
    this.getDowBooking = null;
  }

  public String reservationCode() {
    String reservation = "";
    for (int i = 0; i < 8; i++) {
      if ((int) (Math.random() * 36) > 9) {                            // total character pool is 36 (numbers + letters)
        reservation += (char) (65 + (int) (Math.random() * 26));      //26 characters in the alphabet from A-Z
      } else {
        reservation += (char) (48 + (int) (Math.random() * 10));      //10 characters from 1-10
      }
    }
    return reservation;
  }

  String reset = "\u001B[0m";   //black colored letters | default
  String red = "\u001B[31m";    //red colored letters

  @Override
  public String getDowBooking() {
    String[] days = {"MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"};
    return red + " for " + reset + days[(int) (Math.random() * 7)];     //after using a color we should reset it to the default
  }

  @Override
  public String getCodeBooking() {
    return "Booking# " + reservationCode();
  }

}
