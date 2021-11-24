package valdes.inc.com.company;

import valdes.inc.com.company.figures.HorizontalParabola;
import valdes.inc.com.company.figures.Line;
import valdes.inc.com.company.figures.Parabola;

public class Picture {
    private final Line line;
    private final Parabola parabola1;
    private final Parabola parabola2;
    private final HorizontalParabola horizontalParabola;

    public Picture(Line line, Parabola parabola1, Parabola parabola2, HorizontalParabola horizontalParabola) {
        this.line = line;
        this.parabola1 = parabola1;
        this.parabola2 = parabola2;
        this.horizontalParabola = horizontalParabola;
    }

    public SimpleColor getColor(double x, double y) {
        if (parabola1.isPointDownOfParabola(x, y)) {
            return SimpleColor.YELLOW;
        }
        if (!line.isPointAboveLine(x, y)) {
            return SimpleColor.BLUE;
        }
        if (y < 6 && y > 3 && x > -2 && x < 4) {
            return SimpleColor.BLUE;
        }
        if (!parabola2.isPointDownOfParabola(x, y)) {
            return SimpleColor.WHITE;
        }
        if (horizontalParabola.isPointRightOfParabola(x, y)) {
            return SimpleColor.WHITE;
        }
        return SimpleColor.WHITE;
    }
}
