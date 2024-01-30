package interface_pc;

public class Rectangle implements Shape{

    private double width, height;
    private Point2D lowerLeft;

    // Constructor
    public Rectangle(double width, double height, double x, double y) {
        this.width = width;
        this.height = height;
        this.lowerLeft = new Point2D(x, y);
    }

    @Override
    public double distanceToOrigin() {
        return Math.sqrt(this.lowerLeft.distanceToOrigin());
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
                this.lowerLeft.getX(),
                this.lowerLeft.getY(),
                sqrtFactor * this.width,
                sqrtFactor * this.height);
    }

    @Override
    public int compareTo(Shape s) {
        double areaThis = this.area();
        double areaOther = s.area();

        if (areaThis < areaOther) {
        return -1;
        } else if (areaOther < areaThis) {
        return 1;
        } else {
        return 0;
        }
    }

    // public String toString() {
    //     return String.format("Rectangle: LL corner (%.3f, %.3f) width %.3f height %.3f",
    //     this.x, this.y, this.width, this.height);
    // }
    
}
