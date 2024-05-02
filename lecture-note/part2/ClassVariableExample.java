/**
 * This class represents an example of using a class variable in Java
 * Imagine a scenario where a group of children are building a snowman.
 * As new children join in, how can we keep track of the current number of children playing the game?
 */
public class ClassVariableExample {
    public static void main(String[] args) {

        Child children1 = new Child("Ariel");
        Child children2 = new Child("Joe");

        Child.addCount(0);
        children1.addCount(0);

        System.out.println(Child.count);
        
    }
}

class Child {
    private String name;
    // 类变量（静态变量）此类下的实例共享相同的数据空间
    public static int count = 0;


    public Child(String name) {
        this.name = name;
    }

    // 当方法使用了static修饰后 该方案就是静态方法
    // 静态方法可以访问静态属性
    // 静态方法只能访问静态属性或者静态方法
    // 静态方法想要访问本类的非静态成员 需要先创建对象 再调用
    public static void addCount(int count) {
        Child.count += count;
        Child children = new Child("Bos");
        System.out.println(children.name);
    }

    public void join() {
        System.out.println(this.name + " joins the game");
    }
}

