public class TodoPrint {

    public static void main(String[] args) {
        String todoText = " - Buy milk\n";

        String add1 = "My todo:\n";
        String add2 = " - Download games\n";
        String add3 = "\t - Diablo";
        String output = add1 + todoText + add2 + add3;

        System.out.println(output);
    }
}
