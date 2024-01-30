package interface_pc;

public class Circle implements Shape{

    private Point2D center;
    private double radius;

    // Construct a Circle object with given center and radius
    public Circle(double x, double y, double radius) {
        this.center = new Point2D(x, y);
        this.radius = radius;
    }

    // Construct another Circle object with radius at center (0, 0) for convenience
    public Circle(double radius) {
        this.center = new Point2D(0, 0);
        this.radius = radius;
    }

    @Override
    public double distanceToOrigin() {
        return this.center.distanceToOrigin();
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
        return new Circle(center.getX(), center.getY(), Math.sqrt(factor) *
                radius);
    }

    @Override
    public int compareTo(Shape s) {
        double areaThis = this.area();
        double areaOther = s.area();

        if (areaThis < areaOther) {
            return -1;
        } else if (areaThis > areaOther) {
            return 1;
        } else {
            return 0;
        }
    }

    // public String toString() {
    //     return String.format("Circle: center (%.3f, %.3f) radius %.3f",
    //     this.center_x, this.center_y, this.radius);
    // }
    
}
