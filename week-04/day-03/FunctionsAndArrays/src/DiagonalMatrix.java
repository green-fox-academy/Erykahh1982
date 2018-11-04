public class DiagonalMatrix {

    public static void main(String[] args) {

        int firstarray [][] = {{1 ,0 ,0 ,0 }, {0 ,1 ,0 ,0 }, {0 ,0 ,1 ,0 }, {0 , 0,0 ,1 }};
        System.out.println("My first diagonal matrix");
        display (firstarray);
    }

    public static void display (int x [][]){
        for (int row = 0; row <x.length ; row++) {
            for (int column = 0; column <x[row].length ; column++) {
                System.out.print(x[row][column]);
            }
            System.out.println();
        }
    }
}
