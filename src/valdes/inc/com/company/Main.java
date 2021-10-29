package valdes.inc.com.company;

import valdes.inc.com.company.figures.HorizontalParabola;
import valdes.inc.com.company.figures.Line;
import valdes.inc.com.company.figures.Parabola;

import java.util.Scanner;

public class Main {
    private static final Line L1 = new Line(-5, 0, 2);
    private static final Parabola P1 = new Parabola(-6, -5, -1.0 / 4);
    private static final Parabola P2 = new Parabola(-2, 1, 1);
    private static final HorizontalParabola HP1 = new HorizontalParabola(3, -1, 1.0 / 8);

    private static Picture picture = new Picture(L1, P1, P2, HP1);
    private static MainTest test = new MainTest();

    public static void main(String[] args) {
        if (!test.testMain(picture)) {
            System.out.println("Test error");
            System.exit(1);
        } else {
            System.out.println("All tests completed");
        }

        double x = readNumber("Input X: ");
        double y = readNumber("Input Y: ");

        printColorForPoint(x, y);
    }

    private static void printColorForPoint(double x, double y) {
        System.out.printf("(%.2f, %.2f) --> ", x, y);
        System.out.println(picture.getColor(x, y));
    }

    private static double readNumber(String name) {
        int coordinate = 0;
        Scanner in = new Scanner(System.in);
        System.out.printf("input %s = ", name);

        try {
            coordinate = in.nextInt();
            if (coordinate < -10 || coordinate > 10) {
                System.out.println("Not format for task");
                coordinate = in.nextInt();
                return readNumber("Input correct x, y ");
            }
        } catch (Exception e) {
            System.out.print("Error... ");
            return readNumber("Input correct x, y ");
        }
        return coordinate;
    }
}