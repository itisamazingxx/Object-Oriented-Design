package object;

public class Object_ {

    public static void main(String[] args) {
        ObjectMethod obj = new ObjectMethod();
        obj.equalsTest();
        Object example = new Object();
        example.equals(example);
    }
}

class ObjectMethod {
    /**
     * 演示Object.equals()
     */
    public void equalsTest() {
        String str = "hello";
        str.equals("abc");
        Integer num = new Integer(5);
        Integer num2 = new Integer(5);
        System.out.println(num == num2);
        System.out.println(num.equals(num2));
    }


}




