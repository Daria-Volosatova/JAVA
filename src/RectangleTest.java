import java.awt.*;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {
    private Rectangle rectangle;


    @org.junit.jupiter.api.Test
    void getArea() {
        rectangle.getX(new Point(0, 0));
        rectangle.getY(new Point(0,1));
        assertEquals(1,rectangle.getArea());
    }

    @org.junit.jupiter.api.Test
    void getPerimeter() {
        rectangle.getX(new Point(0, 0));
        rectangle.getY(new Point(0,1));
        assertEquals(4, rectangle.getPerimeter());
    }
}