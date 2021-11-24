package valdes.inc.com.company;

import valdes.inc.com.company.figures.HorizontalParabola;
import valdes.inc.com.company.figures.Line;
import valdes.inc.com.company.figures.Parabola;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws MainTestNotPassedException {
        Picture picture = new Picture(new Line(-5, 0, 2),
                new Parabola(-6, -5, -1.0 / 4), new Parabola(-2, 1, 1),
                new HorizontalParabola(3, -1, 1.0 / 8));
        MainTest test = new MainTest();

        if (!test.testMain(picture)) {
            System.err.println("Test error");
            throw new MainTestNotPassedException();
        } else {
            System.out.println("All tests completed");
        }

        double x = readNumber("Input X: ");
        double y = readNumber("Input Y: ");

        SimpleColor color = picture.getColor(x, y);
        printColorForPoint(x, y, color);
    }

    private static void printColorForPoint(double x, double y, SimpleColor color) {
        System.out.printf("(%.2f, %.2f) --> ", x, y);
        System.out.println(color);
    }

    private static double readNumber(String name) {
        double number = 0;
        Scanner in = new Scanner(System.in);
        System.out.printf("input %s = ", name);

        try {
            number = in.nextDouble();
            if (number < -10 || number > 10) {
                System.err.println("Not format for task. Number must be from -10 to 10...");
                return readNumber("");
            }
        } catch (InputMismatchException ex) {
            System.err.print("Error...It is not number...");
            return readNumber("Input correct x, y ");
        }
        return number;
    }
}