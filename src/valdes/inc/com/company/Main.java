package valdes.inc.com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

    }

    public static double readDouble(String name) {
        Scanner in = new Scanner(System.in);
        System.out.printf("input %s = ", name);
        return in.nextDouble();
    }

    public static final Line L1 = new Line(-5, 0, 2);
    public static final Parabola P1 = new Parabola();
    public static final Parabola P2 = new Parabola();
    public static final HorizontalParabola HP1 = new HorizontalParabola(3, -1, 1.0 / 8);

    public static SimpleColor getColor(double x, double y) {

        return SimpleColor.WHITE;
    }


}

