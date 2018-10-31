public class Reverse {

    public static void main(String[] args) {

        String reversed = ".eslaf eb t'ndluow ecnetnes siht ,dehctiws erew eslaf dna eurt fo sgninaem eht fI";
        System.out.println("Original sentence:");
        System.out.println(reversed);
        System.out.println("Reversed sentence solution1:");
        System.out.println(reverse(reversed));
        System.out.println("Reversed sentence solution2:");
        System.out.println(reverse2(reversed));

    }

    public static String reverse(String a){
        int j = a.length();
        char[] newSentence = new char[j];
        for (int i = 0; i < a.length() ; i++) {
            newSentence[--j] = a.charAt(i);
        }
        return new String(newSentence);
    }

    public static String reverse2(String b){
        String reverseWord = "";
        for (int index = b.length() - 1; index >= 0 ; index--) {
            reverseWord += b.charAt(index);
        }
        return reverseWord;
    }
}
