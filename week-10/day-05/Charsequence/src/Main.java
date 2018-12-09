public class Main {
  public static void main(String[] args) {

    Gnirts gnirt01 = new Gnirts("example");
    System.out.println(gnirt01.length());
    System.out.println((gnirt01.charAt(1)));
    System.out.println(gnirt01.subSequence(2, 6));
    System.out.println();
    Shifter shifter01 = new Shifter("example", 2);
    System.out.println(shifter01.length());
    System.out.println(shifter01.charAt(1));
    System.out.println(shifter01.subSequence(2, 6));

  }
}
