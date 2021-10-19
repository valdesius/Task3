package valdes.inc.com.company;

public class Picture {
    public static final Line L1 = new Line(-5, 0, 2);
    public static final Parabola P1 = new Parabola(-6, -5, -1.0 / 4);
    public static final Parabola P2 = new Parabola(-2, 1, 1);
    public static final HorizontalParabola HP1 = new HorizontalParabola(3, -1, 1.0 / 8);

    public static SimpleColor getColor(double x, double y) {
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
