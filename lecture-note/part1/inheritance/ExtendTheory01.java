public class ExtendTheory01 {
    public static void main(String[] args) {
        E e = new E(); // C name d name e E
    }
}

class C {
    public C() {
        System.out.println("Constructor of class C");
    }
}

class D extends C {
    public D() {
        System.out.println("Constructor of class D");
    }
    public D(String name) {
        System.out.println("name d");
    }
}

class E extends D {
    public E() {
        this("Hello");
        System.out.println("Constructor of class E");
    }
    public E(String name) {
        super("hahaha");
        System.out.println("name e");
    }
}
