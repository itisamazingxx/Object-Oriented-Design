package IO;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileRead {

    public static void main(String[] args) {
        Read file = new Read();
        // file.readFile();
        file.readFile02();
    }
    
}

class Read {

    /**
     * 单个字符读取文件
     */
    public void readFile() {
        File file = new File("/Users/beauwen/Desktop/Object-Oriented-Design/lecture-note/advanced/IO/task.csv");
        FileReader fileReader = null;
        int data = 0;
        try {
            fileReader = new FileReader(file);
            while ((data = fileReader.read()) != -1) {
                System.out.println((char) data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fileReader != null) {
                    fileReader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * 使用字符数组读取文件
     */
    public void readFile02() {
        File file = new File("/Users/beauwen/Desktop/Object-Oriented-Design/lecture-note/advanced/IO/task.csv");
        FileReader fileReader = null;

        int readLen = 0;
        char[] buf = new char[50];

        try {
            fileReader = new FileReader(file);
            // 返回的是实际读取到的字符数
            while ((readLen = fileReader.read(buf)) != -1) {
                System.out.println(new String(buf, 0, readLen));
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fileReader != null) {
                    fileReader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
