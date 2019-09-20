import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CircleTest {
    Circle circle;

    @Test
    void getArea() {
        assertEquals(Math.PI*1, circle.getArea());
    }

    @Test
    void getPerimeter() {
        assertEquals(2*Math.PI*1, circle.getPerimeter());
    }
}