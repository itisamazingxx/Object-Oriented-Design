package datastructure.array;

/**
 * 演示创建一个动态的二维数组
 */
public class TwoDimensionalArrExample {

    public static void main(String[] args) {
        int[][] array = new int[3][];
        for (int i = 0; i < array.length; i++) {
            array[i] = new int[i+1];
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = i + 1;
            }
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]);
            }
            System.out.println("\n");
        }

    }

    
    
}