public class InterfaceSegregation {
    public static void main(String[] args) {
        C c = new C();
        c.depend1(new A());
        c.depend2(new A());
        D d = new D();
        d.depend5(new B());
    }
}

interface Interface1 {
    void operation1();
}

interface Interface2 {
    void operation2();
    void operation3();
}

interface Interface3 {
    void operation4();
    void operation5();
}

class A implements Interface1, Interface2 {
    public void operation1() {
        System.out.println("operation1 printing");
    }
    public void operation2() {
        System.out.println("operation2 printing");
    }
    public void operation3() {
        System.out.println("operation3 printing");
    }
}

class B implements Interface1, Interface3 {
    public void operation1() {
        System.out.println("operation1 printing");
    }
    public void operation4() {
        System.out.println("operation4 printing");
    }
    public void operation5() {
        System.out.println("operation5 printing");
    }
}

class C {
    public void depend1(Interface1 i) {
        i.operation1();
    }
    public void depend2(Interface2 i) {
        i.operation2();
    }
    public void depend3(Interface2 i) {
        i.operation3();
    }

}

class D {
    public void depend1(Interface1 i) {
        i.operation1();
    }

    public void depend4(Interface3 i) {
        i.operation4();
    }
    public void depend5(Interface3 i) {
        i.operation5();
    }
}