/**
 * This class illustrates the how default "super" applied under inheritant
 */
public class ExtendTheory02 {
    public static void main(String[] args) {
        B b = new B(); // a b name b
    }
    
}

class A {
    public A() {
        System.out.println("a");
    }
    public A(String name) {
        System.out.println("a name");
    }
}

class B extends A {
    public B() {
        this("abc");
        System.out.println("b");
    }

    public B(String name) {
        System.out.println("b name");
    }
}
