public class ZooApp {
  public static void main(String[] args) {

    Lion lion01 = new Lion("Lion");
    Lion lion02 = new Lion("Liza", 3, "Male");
    Monkey monkey01 = new Monkey("Pocok", 4, "Female");
    Monkey monkey02 = new Monkey("Blackie");
    Elephant elephant01 = new Elephant("Ellie");
    Elephant elephant02 = new Elephant("Dumbó", 5, "Male");

    Worker worker01 = new Worker("John");
    Worker worker02 = new Worker("Edith");


    worker01.addAnimal(lion01);
    worker01.addAnimal(monkey01);
    worker01.addAnimal(elephant01);
    System.out.println(worker01.status());
    System.out.println();

    worker02.addAnimal(lion02);
    worker02.addAnimal(monkey02);
    worker02.addAnimal(elephant02);
    System.out.println(worker02.status());
    System.out.println();


    System.out.println(worker01.status());
    System.out.println();
    System.out.println(worker02.status());
    System.out.println();

    worker01.doDailyRoutine();
    worker02.doDailyRoutine();

  }

}