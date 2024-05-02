package string_;

public class StringExercise {
    public static void main(String[] args) {
        StringExample stringExample = new StringExample();
        stringExample.method01();
        String b = "hello";
        String c = "abc";
        String d = b + c;
    }

}

class StringExample {
    String a = "Ariel"; // 指向常量池的Ariel
    String b = new String("Ariel"); // 指向堆中的对象
    // 堆中的value指向常量池

    public void method01() {
        String s1 = "hello";
        s1 = "haha"; // 创建了两个对象

        String a = "hello" + "abc"; // 创建了一个对象

        String b = "hello";
        String c = "abc";
        String d = b + c;

    }

}
