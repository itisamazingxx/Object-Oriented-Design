package IO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * Shows buffered reader
 */
public class BufferedRead {
    
    public static void main(String[] args) {

        BufferedReadExample file = new BufferedReadExample();
        file.read();

    }
}

class BufferedReadExample {

    public void read() {
        File file = new File("/Users/beauwen/Desktop/Object-Oriented-Design/lecture-note/advanced/IO/task.csv");
        // 创建BufferedReader (装饰器流)
        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(new FileReader(file)); // bufferedReader包装了一个节点流
        } catch (IOException e) {
            e.printStackTrace();
        }

        // 读取
        String line; // 按行读取

        try {
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            } // 返回空时表示读取完毕点流
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (bufferedReader != null) {
                    bufferedReader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        // 只需要关闭bufferedReader 节点流会自动关闭
    }

}
