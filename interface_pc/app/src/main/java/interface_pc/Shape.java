package interface_pc;

/*
 * These interface contains all operations for types of Shape.
 */
public interface Shape extends Comparable<Shape> {
    // 强制要求实现compareTo(Shape other)方法

    // In Java, interface methods are by default public 
    // because interfaces serve as a way to define public contract.

    double distanceToOrigin();

    double area();

    double perimeter();

    Shape resize(double factor);

    int compareTo(Shape s);

}