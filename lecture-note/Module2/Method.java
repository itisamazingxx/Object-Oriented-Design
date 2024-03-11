public class Method {
    public static void main(String[] args) {
        AA a = new AA();
        int[] res = a.getSumAndSub(10, 6);
        System.out.println("Sum = " + res[0]);
        System.out.println("Sub = " + res[1]);
    }
}

/**
 * Example: 一个方法最多有一个返回值
 */
class AA {
    public int[] getSumAndSub(int a, int b) {
        int[] arr = new int[2];
        arr[0] = a + b;
        arr[1] = a - b;
        return arr;
    }
}