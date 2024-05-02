public class WrapperType {

    public static void main(String[] args) {
        int n1 = 100;
        // 手动装箱
        Integer integer = new Integer(n1);
        // 手动拆箱
        int i = integer.intValue();

        int n2 = 200;
        Integer integer1 = n2; // JDK5之后实现了自动装箱 底层还是new Integer()

        Integer n3 = 400;
        String str1 = n3 + "";
        String str2 = n3.toString();
    }
}
