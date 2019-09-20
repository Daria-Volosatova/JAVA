import java.awt.*;

public class Rectangle {
    private Point x;
    private Point y;

    public Rectangle(Point x, Point y) {
        this.x = x;
        this.y = y;
    }

    public Point getX(Point point) {
        return x;
    }

    public Point getY(Point point) {
        return y;
    }

    public double getArea(){
        return (((x.x - y.x)*(x.x - y.x) + (x.y - y.y)*(x.y - y.y))/2);
    }

    public double getPerimeter(){
        return (2* Math.sqrt(2)*Math.sqrt(((x.x - y.x)*(x.x - y.x) + (x.y - y.y)*(x.y - y.y))));
    }
}
