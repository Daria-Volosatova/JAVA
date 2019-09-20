import java.awt.*;

public class Circle {

    private int radius;
    private Point point;

    public Circle(int x, int y, int r) {
        point = new Point(x, y);
        radius = r;
    }

    public Circle() {

        this(0, 0, 1);
    }

    public int getRadius() {

        return radius;
    }

    public Point getPoint() {
        return point;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}