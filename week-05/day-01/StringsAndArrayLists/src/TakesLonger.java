public class TakesLonger {

    public static void main(String[] args) {
        System.out.println("Print original sentence: ");
        String quote = "Hofstadter's Law: It you expect, even when you take into account Hofstadter's Law.";
        System.out.println(quote);
        String quotePart = "always takes longer than";

        String substring1 = "Hofstadter's Law: It ";
        String substring2 = " you expect, even when you take into account Hofstadter's Law.";

        System.out.println("Print new sentence: ");
        System.out.println(substring1 + quotePart + substring2);

        lines();

        stringBuilderMethod();
    }

    static void lines() {
        for (int i = 0; i < 1; i++) {
            System.out.print("-----------------------------");
            System.out.println();
        }
    }

    static void stringBuilderMethod(){

        StringBuilder sb = new StringBuilder();
        sb.append(("Hofstadter's Law: It "));
        sb.append(("always takes longer than"));
        sb.append((" you expect, even when you take into account Hofstadter's Law."));

        System.out.println(sb);
    }
}
