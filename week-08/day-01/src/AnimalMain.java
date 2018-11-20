public class AnimalMain {
  public static void main(String[] args) {
    Animal animal01 = new Animal(20,10);
    Animal animal02 = new Animal(45,75);
    Animal animal03 = new Animal(50, 50);

    animal01.eat();
    animal02.drink();
    animal03.play();

    System.out.println(animal01);
    System.out.println(animal02);
    System.out.println(animal03);
  }
}

