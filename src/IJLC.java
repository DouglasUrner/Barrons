/**
 * Created by dlu on 10.01.2017.
 */
public class IJLC {
    public static void main(String[] args) {
        q1();
        q2();
        q3();
        q4();
    }

    private static void q1() {
        double x0 = 3.14;
        //int y0 = x0;

        double x1 = 3.14;
        int y1 = (int) x1;

        int x2 = 3;
        double y2 = x2;
    }

    private static void q2() {
        System.out.println("\\* This is not\n a comment *\\");
    }

    private static void q3() {
        int n = 0;
        int x = 1;

        if (n != 0 && x/n > 100) {
            System.out.println("statement1");
        } else {
            System.out.println("statement2");
        }
    }

    private static void q4() {
        System.out.println((double) 13 / 5);
        System.out.println(13 / (double) 5);
        System.out.println(13.0 / 5);
        System.out.println(13 / 5.0);
        System.out.println((double) (13 / 5));
    }
}
