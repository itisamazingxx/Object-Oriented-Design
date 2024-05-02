package IO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferCopied {
    public static void main(String[] args) {
        BufferedCopy_ file = new BufferedCopy_();
        file.bufferedCopied();
    
    }
        
}

class BufferedCopy_ {

    public void bufferedCopied() {

        File srcFile = new File("/Users/beauwen/Desktop/Object-Oriented-Design/lecture-note/advanced/IO/task.csv");
        String destPath = "/Users/beauwen/Desktop/Object-Oriented-Design/lecture-note/advanced/IO/";

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(srcFile));
             BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(destPath))) {

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                bufferedWriter.write(line);
                bufferedWriter.newLine(); // 添加新行
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        
    }
}
