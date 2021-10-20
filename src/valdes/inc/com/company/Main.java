package valdes.inc.com.company;

import java.util.Scanner;

public class Main {
    private static final Picture picture = new Picture();
    private static final MainTest test = new MainTest();

    public static void main(String[] args) {

        if (!test.testMain()) {
            System.out.println("Test error");
            System.exit(1);
        } else {
            System.out.println("All tests completed");
        }

        double x = readCoordinate("Input X: ");
        double y = readCoordinate("Input Y: ");

        printColorForPoint(x, y);


    }

    public static void printColorForPoint(double x, double y) {
        System.out.printf("(%.2f, %.2f) --> ", x, y);
        System.out.println(picture.getColor(x, y));
    }

    public static double readCoordinate(String name) {
        int coordinate = 0;
        Scanner in = new Scanner(System.in);
        System.out.printf("input %s = ", name);
        try {
            coordinate = in.nextInt();
            if (coordinate < -10 || coordinate > 10) {
                System.out.println("Not format for task");
                coordinate = in.nextInt();
            }
        } catch (Exception e) {
            System.out.print("Error... ");
            System.exit(1);
        }
        return coordinate;
    }

}