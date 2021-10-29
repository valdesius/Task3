package valdes.inc.com.company;

import valdes.inc.com.company.figures.HorizontalParabola;
import valdes.inc.com.company.figures.Line;
import valdes.inc.com.company.figures.Parabola;

public class Picture {
    private final Line L1;
    private final Parabola P1;
    private final Parabola P2;
    private final HorizontalParabola HP1;

    public Picture(Line L1, Parabola P1, Parabola P2, HorizontalParabola HP1) {
        this.L1 = L1;
        this.P1 = P1;
        this.P2 = P2;
        this.HP1 = HP1;
    }

    public SimpleColor getColor(double x, double y) {
        if (P1.isPointDownOfParabola(x, y)) {
            return SimpleColor.YELLOW;
        }
        if (!L1.isPointAboveLine(x, y)) {
            return SimpleColor.BLUE;
        }
        if (y < 6 && y > 3 && x > -2 && x < 4) {
            return SimpleColor.BLUE;
        }
        if (!P2.isPointDownOfParabola(x, y)) {
            return SimpleColor.WHITE;
        }
        if (HP1.isPointRightOfParabola(x, y)) {
            return SimpleColor.WHITE;
        }
        return SimpleColor.WHITE;
    }
}
