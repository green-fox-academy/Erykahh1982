public class PrintArguments {
    public static void main(String[] args) {
        printParams ("bird", "fish", "mammal", "reptile", "insect");
    }

    private static void printParams(String... strings){
        for (String animals: strings) {
            System.out.println(animals + ", ");
        }
    }
}
