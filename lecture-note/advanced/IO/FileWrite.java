package IO;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWrite {
    public static void main(String[] args) {
        Write file = new Write();
        file.writeFile();
    }
    
}

class Write {

    public void writeFile() {
        File file = new File("/Users/beauwen/Desktop/Object-Oriented-Design/lecture-note/advanced/IO/task.csv");
        FileWriter fileWriter = null;

        char[] chars = {'A', 'w', 'e', 's', 'o', 'm', 'e'};

        try {
            fileWriter = new FileWriter(file, true);
            // write(int) 写入单个字符
            fileWriter.write("H");
            // write(chars) 写入字符数组
            fileWriter.write(chars);
            // write(char[], len, off)
            fileWriter.write("awsome world!".toCharArray(), 0, 8);
            // write(string)
            fileWriter.write("Hi Seattle!");

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                // write后必须关闭
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
