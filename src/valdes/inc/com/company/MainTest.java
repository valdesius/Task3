package valdes.inc.com.company;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void main() {
        // First point
        Point point = new Point(5,6);
        double expectedX = 5;
        double expectedY = 6;
        double actualX  = point.x;
        double actualY = point.y;
        System.out.println("The test for the first point");
        assertEquals(expectedX, actualX);
        assertEquals(expectedY, actualY);

        // Second point
        Point point1 = new Point(5,4);
        double expectedX1 = 5;
        double expectedY1 = 8;
        double actualX1 = point1.x;
        double actualY1 = point1.y;
        System.out.println("The test for the second point");
        assertEquals(expectedX1, actualX1);
        assertEquals(expectedY1, actualY1);
    }

    @Test
    void readDouble() {
    }

    @Test
    void getColor() {


//        Point p2 = new Point(-6, 0);
//        System.out.println("(" + p2.x + ", " + p2.y + ") -->" + getColor(p2.x, p2.y));
//
//        Point p3 = new Point(0, 0);
//        System.out.println("(" + p3.x + ", " + p3.y + ") -->" + getColor(p3.x, p3.y));
//
//        Point p4 = new Point(0, 8);
//        System.out.println("(" + p4.x + ", " + p4.y + ") -->" + getColor(p4.x, p4.y));
//
//        Point p5 = new Point(-1, 4);
//        System.out.println("(" + p5.x + ", " + p5.y + ") -->" + getColor(p5.x, p5.y));
//
//        Point p6 = new Point(4, 0);
//        System.out.println("(" + p6.x + ", " + p6.y + ") -->" + getColor(p6.x, p6.y));
//
//        Point p7 = new Point(readDouble("x"), readDouble("y"));
//        System.out.println("(" + p7.x + ", " + p7.y + ") -->" + getColor(p7.x, p7.y));
    }
}