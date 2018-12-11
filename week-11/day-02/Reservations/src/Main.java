import ReservationBackEndData.Reservations;

public class Main {
  public static void main(String[] args) {

    Reservations reservations = new Reservations();

    for (int i = 0; i < 8; i++) {
      System.out.print(reservations.getCodeBooking());
      System.out.print(reservations.getDowBooking());
      System.out.println();
    }
  }

}
