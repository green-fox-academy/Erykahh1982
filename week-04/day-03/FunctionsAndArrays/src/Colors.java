public class Colors {

    public static void main(String[] args) {
        String colors [][] = {{"lime", "forest green", "olive", "pale green", "spring green"}, {"orange red", "red", "tomato"}, {"orchid", "violet", "pink", "hot pink"}};
        System.out.println("Shades of colours");
        display (colors);

    }public static void display (String x [][]){
        for (int row = 0; row < x.length; row++) {
            for (int column = 0; column < x [row].length ; column++) {
                System.out.print(x[row][column] + " ,");
            }
            System.out.println();
        }
    }
}
