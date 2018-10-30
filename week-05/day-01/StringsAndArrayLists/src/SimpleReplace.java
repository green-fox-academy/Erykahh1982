public class SimpleReplace {

    public static void main(String[] args) {

        System.out.println("Original sentence: ");
        String example = "In a dishwasher far far away";
        System.out.println(example);

        System.out.println("Replaced sentence: ");
        String sentenceParts = example.replace("dishwasher", "galaxy");
        System.out.println(sentenceParts);
    }
}
