public class VariableMutation {
    public static void main(String[] args) {

        int a = 3;
        a += 10;
        System.out.println("3 + 10 = " + a);

        int b = 100;
        b -= 7;
        System.out.println("100 - 7 = " + b);

        int c = 44;
        c *=2;
        System.out.println("44 * 2 = " + c);

        int d = 125;
        d /=5;
        System.out.println("125 / 5 = " + d);

        int e = 8;
        e=e*e*e;
        System.out.println("The cube of 8 = " + e);

        int f1 = 123;
        int f2 = 345;
        boolean f3 = f1>f2;
        System.out.println("If 123 is bigger than 345 : " + f3);

        int g1 = 350;
        int g2 = 200;
        boolean g3 = (g2*2)>g1;
        System.out.println("If the double of 200 is bigger than 350 : " + g3);

        int h = 135798745;
        boolean h1 = h % 11 ==0;
        System.out.println("If 135798745 has 11 as a dividor : " + h1 );

        int i1 = 10;
        int i2 = 3;
        boolean i3 = (i1>(i2*i2)) && (i1<(i2*i2*i2));
        System.out.println("If 10 > 3 squared (9) and if 10 < 3 cubed (81) : " + i3);

        int j = 1521;
        int j2 = j % 3;
        int j3 = j % 5;
        boolean j4 = (j2 == 0) || (j3 == 0);
        System.out.println("If 1521 is dividable by 3 or 5 : " + j4);

        String k = "Apple";
        k= k + k + k + k;
        System.out.println(k);




    }
}
