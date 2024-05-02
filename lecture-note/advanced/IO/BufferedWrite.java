package IO;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * 演示BufferedWriter的使用
 */
public class BufferedWrite {

    public static void main(String[] args) {
        BufferedWriteExample file = new BufferedWriteExample();
        file.write();
    }
    
}

class BufferedWriteExample {

    public void write() {
        File file = new File("/Users/beauwen/Desktop/final-hw4-5004/tasks.csv");
        // 创建BufferedReader (装饰器流)
        BufferedWriter bufferedWriter = null;
        try {
            bufferedWriter = new BufferedWriter(new FileWriter(file, true)); // bufferedReader包装了一个节点流
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            bufferedWriter.write("awesome");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

}
