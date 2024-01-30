package interface_pc;

/*
 * This class represents a 2-D pointer (x, y)
 */
public class Point2D {

    private double x;
    private double y;

    public Point2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double distanceToOrigin() {
        return Math.sqrt(x * x + y * y);
    }

    public double getX() {
        return this.x;
    }

    public double getY() {
        return this.y;
    }
    
}
