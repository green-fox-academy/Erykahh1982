public class DrawChessTable {

    public static void main(String[] args) {
        String odd = ("x");
        String even = (" ");

        for (int a = 0; a < 8; a++) {
            for (int b = 0; b < 4; b++) {
                if (a % 2 == 0) {
                    System.out.print(odd + even);
                } else {
                    System.out.print(even + odd);
                }
            }
            System.out.println();
        }
    }
}
