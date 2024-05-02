package datastructure.array;

/**
 * 演示数组的应用
 * 倒序循环遍历数组
 */
public class ArrayExample {

    public static void main(String[] args) {
        double[] nums = {2, 2.6, 7, 9.3};
        Reverse reverse = new Reverse();
        reverse.method1(nums);
        System.out.println("----------");
        reverse.method2(nums);
    }

}

class Reverse {

    public Reverse() {}

    public void method1(double[] nums) {
        for (int i = 0; i < (nums.length) / 2; i++) {
            double temp = nums[nums.length-1-i];
            nums[nums.length-1-i] = nums[i];
            nums[i] = temp;
        }
        print(nums);
    }

    public void method2(double[] nums) {
        double[] nums2 = new double[nums.length];
        // 再定义一个j变量
        for (int i = nums.length - 1, j = 0; i >= 0; i--, j++) {
            nums2[j] = nums[i];
        }
        print(nums2);
    }

    public void print(double[] nums) {
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }
}
