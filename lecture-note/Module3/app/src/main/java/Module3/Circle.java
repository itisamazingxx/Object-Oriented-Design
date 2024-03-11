package Module3;

public class Circle extends AbstractShape{

    private double radius;

    // Construct a Circle object with given center and radius
    public Circle(double x, double y, double radius) {
        super(new Point2D(x, y));
        this.radius = radius;
    }

    // Construct another Circle object with radius at center (0, 0) for convenience
    public Circle(double radius) {
        super(new Point2D(0, 0));
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * this.radius * this.radius;
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * this.radius;
    }

    @Override
    public Shape resize(double factor) {
        return new Circle(reference.getX(), reference.getY(), Math.sqrt(factor) *
                radius);
    }

    // public String toString() {
    //     return String.format("Circle: center (%.3f, %.3f) radius %.3f",
    //     this.reference, this.center_y, this.radius);
    // }
    
}
