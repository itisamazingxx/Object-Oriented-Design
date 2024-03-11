package Module3;

import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import Module3.Circle;
import Module3.Rectangle;
import Module3.Shape;

public class ShapeTest {
    private Shape circle1,circle2,circle3;
    private Shape rect1,rect2;

    @BeforeEach
    public void setup() {
        circle1 = new Circle(3,4,5);
        circle2 = new Circle(10.32,10.43,10);
        circle3 = new Circle(20);
        
        rect1 = new Rectangle(2.5, 2, 5, 6);
        rect2 = new Rectangle(10, 10, 2, 3);

    }



    // @Test
    // public void testObjectData() {

    //     assertEquals("Circle: center (3.000, 4.000) radius 5.000",circle1.toString
    //             ());
    //     assertEquals("Circle: center (10.320, 10.430) radius 10.000",circle2.toString
    //             ());
    //     assertEquals("Circle: center (0.000, 0.000) radius 20.000",circle3
    //             .toString
    //             ());
    //     assertEquals("Rectangle: LL corner (5.000, 6.000) width 2.500 height 2.000",
    //             rect1.toString());
    //     assertEquals("Rectangle: LL corner (2.000, 3.000) width 10.000 height 10" +
    //             ".000",rect2
    //             .toString());

    // }

    @Test
    public void testArea() {

        assertEquals(Math.PI*25, circle1.area(), 0.001);
        assertEquals(Math.PI*100, circle2.area(), 0.001);
        assertEquals(Math.PI*400, circle3.area(), 0.001);
        assertEquals(5, rect1.area(), 0.001);
        assertEquals(100, rect2.area(), 0.001);
    }

    @Test
    public void testPerimeter() {
        assertEquals(2*Math.PI*5, circle1.perimeter());
        assertEquals(2*Math.PI*10 , circle2.perimeter());
        assertEquals(2*Math.PI*20, circle3.perimeter());
        assertEquals(2*4.5, rect1.perimeter());
        assertEquals(40, rect2.perimeter());
    }

    @Test
    public void testResizes() {
        Shape resizedCircle1, resizedCircle2 ,resizedCircle3;

        resizedCircle1 = circle1.resize(2.5);
        resizedCircle2 = circle2.resize(0);
        resizedCircle3 = circle3.resize(10);

        assertEquals(2.5 * circle1.area(), resizedCircle1.area(), 0.001);
        assertEquals(0 * circle2.area(), resizedCircle2.area(), 0.001);
        assertEquals(10 * circle3.area(),resizedCircle3.area(), 0.001);

  }

    @Test
    public void testCompare() {
        assertEquals(-1, circle1.compareTo(circle2));
        assertEquals(1, circle2.compareTo(circle1));
        assertEquals(0, circle3.compareTo(circle3));
        assertEquals(1, circle3.compareTo(rect1));
    }

}
    

    
    
