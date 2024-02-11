package Module3;

public abstract class AbstractShape implements Shape{

    // "protected: 只允许继承的child class访问
    protected Point2D reference;

    public AbstractShape(Point2D reference) {
        this.reference = reference;
    }

    @Override
    public double distanceToOrigin() {
        return this.reference.distanceToOrigin();
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
    
}
