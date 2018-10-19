public class ConditionalVariableMutation {
    public static void main(String[] args) {
        //if "a" is even, increment "out" by one
        double a = 24;
        int out = 0;
        if (a % 2 ==0) {
            System.out.println((out) + (++a));
        }

        //if b is between 10 and 20 set out2 to "Sweet!"
        //if less than 10, set out2 to "Less!",
        //if more than 20, set out2 to "More!"
        int b = 13;
        String out2 = "";
        if ((b>=10) && (b<=20)) {
            out2 = "Sweet!";
            System.out.println(out2);
        } else if (b<10) {
            out2 = "Less!)";
            System.out.println(out2);
        } else if (b>20) {
            out2 = "More";
            System.out.println(out2);
        }

        //credits and bonus
        int c = 123;
        int credits = 100;
        boolean isBonus = false;
        if ((credits >= 50) && (isBonus==false)) {
            c = c-2;
            System.out.println(c);
        } else if ((credits<50) && (isBonus==false)) {
            c = c-1;
            System.out.println(c);
        } else if (isBonus=true) {
            c = c;
            System.out.println(c);
        }

        //Time out and check
        int d = 8;
        int time = 120;
        String out3 = "";
        if ((d % 4 ==0 ) && (time <= 200)) {
            out3 = "Check";
            System.out.println(out3);
        } else if (time>200) {
            out3 = "Time out";
            System.out.println(out3);
        } else {
            out3 = "Run forest Run!";
            System.out.println(out3);
        }
    }
    }

