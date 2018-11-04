public class IncrementElement {

    public static void main(String[] args) {

        int[] t = {1, 2, 3, 4, 5};
        int a = 5;
        t[2] = t[2] + a;
        System.out.println("The incremented value of the 3rd element of our array 't' is : " + t[2]);
    }
}
