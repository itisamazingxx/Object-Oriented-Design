package innerclass;

public class AnonymousInnerClass {
    public static void main(String[] args) {
        Outer01 outer = new Outer01();
        outer.method();
    }
}

class Outer01 { // 外部类

    private int num = 10;
    public void method() {

        // 基于接口的匿名内部类
        // tiger的编译类型是IA接口 运行类型就是这个匿名内部类
        // 其实是在底层创建了一个接口的实现类
        IA tiger = new IA() {
            @Override
            public void cry() {
                System.out.println("Tiger cry");
            }
        };
        tiger.cry();

        // 基于类的匿名内部类
        Father father = new Father("jack") {
            @Override
            public void test() {
                System.out.println("Override test method");
            }
        };
        father.test();

        new Father("tom") {
            @Override
            public void test() {
                System.out.println("Tom is testing");
            }
        }.test(); // 也可以匿名函数后直接调用
    }
}

interface IA {
    public void cry();
}

class Father {

    public Father(String name) {}
    public void test() {
    }

}
