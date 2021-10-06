package valdes.inc.com.company;

public class Line {
    public double x0;
    public double y0;
    public double a;

    public Line(double x0, double y0, double a) {
        this.x0 = x0;
        this.y0 = y0;
        this.a = a;
    }

    /**
     * Проверяет, находится ли точка (x, y) ниже линии
     */
    public boolean isPointAboveLine(double x, double y) {
        return y < a * (x - x0) + y0;
    }
}
