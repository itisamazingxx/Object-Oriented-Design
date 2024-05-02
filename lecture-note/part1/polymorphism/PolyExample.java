package polymorphism;

/**
 * 演示多态的应用
 */
public class PolyExample {

    public static void main(String[] args) {
        // 多态的向上转型
        // 语法: 父类类型引用名 = new 子类类型()
        Animal pig = new Pig();
        Object Pig = new Pig();
        Pig pig2 = new Pig();
        // instanceof 比较操作符 用于判断对象的类型是否为xx类型或者xx类型的子类型
        System.out.println(pig2 instanceof Pig); // true
        System.out.println(pig2 instanceof Animal);
    }

}

class Animal {
    public void eat() {};
    public void drink() {};
}

class Pig extends Animal {
}
