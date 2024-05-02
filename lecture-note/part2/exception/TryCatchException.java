import java.util.Scanner;

/**
 * 如果用户输入的输入的不是一个整数，就提醒他反复输入，直到输入一个整数为止
 */
public class TryCatchException {

    // 思路
    // 1. 创建Scanner对象
    // 2. 使用无限循环去接受一个输入
    // 3. 然后将该输入的值转换成一个int
    // (如果在这个过程中抛出了异常, 用户输入不合法)
    // 4. 如果没有抛出异常, break while
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        String inputStr = null;

        while (true) {
            System.out.print("Please input an integer num > ");
            inputStr = scanner.next();
            try {
                num = Integer.parseInt(inputStr);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Not a valid number");
            }
        }

        System.out.println("The number you entered is: " + num);
        scanner.close();
    }
    
}
