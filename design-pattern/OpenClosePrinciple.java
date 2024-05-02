/**
 * this file illusrate open close principle in ood
 */
public class OpenClosePrinciple {
    public static void main(String[] args) {
        GraphEditor graphEditor = new GraphEditor();
        graphEditor.drawGraph(new Rectangle());
    }
}

class GraphEditor {
    public void drawGraph(Shape s) {
        s.draw();
    }
}

abstract class Shape {
    public int type;
    public abstract void draw();
}

class Rectangle extends Shape {
    public Rectangle() {
        super.type = 1;
    }

    @Override
    public void draw() {
        System.out.println("Draw rectangle..");
    }
}

class Circle extends Shape {
    public Circle() {
        super.type = 1;
    }

    @Override
    public void draw() {
        System.out.println("Draw circle..");
    }
}