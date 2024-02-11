package Module3;

public class Rectangle extends AbstractShape{

    private double width, height;

    // Constructor
    public Rectangle(double width, double height, double x, double y) {
        super(new Point2D(x, y));
        this.width = width;
        this.height = height;
    }

    @Override
    public double area() {
        return this.width * this.height;
    }

    @Override
    public double perimeter() {
        return 2 * (this.height + this.width);
    }

    @Override
    public Shape resize(double factor) {
        double sqrtFactor = Math.sqrt(factor);
        return new Rectangle(
                this.reference.getX(),
                this.reference.getY(),
                sqrtFactor * this.width,
                sqrtFactor * this.height);
    }

    // public String toString() {
    //     return String.format("Rectangle: LL corner (%.3f, %.3f) width %.3f height %.3f",
    //     this.x, this.y, this.width, this.height);
    // }
    
}
