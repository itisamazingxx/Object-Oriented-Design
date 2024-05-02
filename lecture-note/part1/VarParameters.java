///**
// * 演示Java中的可变参数
// */
//public class VarParameters {
//
//    public static void main(String[] args) {
//        new Method().sum(5, 6, 7, 8);
//    }
//
//
//}
//
//class Method {
//
//    // OverLoad Example
//    public int sum(int n1, int n2) {
//        return n1 + n2;
//    }
//    public int sum(int n1, int n2, int n3) {
//        return n1 + n2 + n3;
//    }
//
//    // 可以引用可变参数
//    // 使用可变参数时 可以当做数组来使用
//    public int sum(int... nums) {
//        int res = 0;
//        for (int i = 0; i < nums.length; i++) {
//            res += nums[i];
//        }
//        return res;
//    }
//}
