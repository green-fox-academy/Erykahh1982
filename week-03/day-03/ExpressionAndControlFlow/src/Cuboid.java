public class Cuboid {
    public static void main(String[] args) {

        double a = 12.55;
        double b = 22.55;
        double c = 33.55;

        double surfaceArea = 2*((a*b)+(a*c)+(b*c));
        double volume = a * b * c;

        System.out.println("Surface Area :" + surfaceArea);
        System.out.println("Volume : " + volume);


    }
}
