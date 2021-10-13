package valdes.inc.com.company;

import org.junit.jupiter.api.Test;
import static valdes.inc.com.company.Main.printColorForPoint;

class MainTest {

    @Test
    void main() {
        System.out.println("Tests: ");

        printColorForPoint(3,4);
        printColorForPoint(6,7);
        printColorForPoint(2,1);
        printColorForPoint(3,8);
        printColorForPoint(3,9);
        printColorForPoint(3,3);
        printColorForPoint(7,4);
        printColorForPoint(4,4);
    }

    @Test
    void readDouble() {
    }

    @Test
    void getColor() {
    }
}