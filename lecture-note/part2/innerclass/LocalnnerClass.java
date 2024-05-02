package innerclass;

/**
 * 局部内部类的使用
 */
public class LocalnnerClass {

    public static void main(String[] args) {

    }
}

class Outer { // 外部类

    private int num = 10;
    public void m1() { // 方法
        // 局部内部类通常定义在外部类的局部位置 通常在方法中
        // 局部内部类不能再用访问修饰符
        class Inner { // 局部内部类(本质依然是一个类)
            // 可以直接访问外部类的所有成员
            public void n1() {
                System.out.println("The value of num is " + num);
            }
        }
    }
}




