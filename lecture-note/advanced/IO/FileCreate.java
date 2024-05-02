import java.io.File;
import java.io.IOException;

public class FileCreate {

    public static void main(String[] args) {
        CreateFile file = new CreateFile();
        file.createFile01();
        file.createFile02();
    }
}

class CreateFile {

    // new File(String pathName)
    public void createFile01() {
        String filePath = "/Users/beauwen/Desktop/Object-Oriented-Design/lecture-note/advanced/IO/task.csv";
        File file = new File(filePath);
        try {
            file.createNewFile();
            System.out.println("File creates success!!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void createFile02() {
        File parentFile = new File("/Users/beauwen/Desktop/Object-Oriented-Design/lecture-note/advanced/");
        String fileName = "news2.txt";
        File file = new File(parentFile, fileName);
        try {
            file.createNewFile(); // 真正创建文件
            System.out.println("File creates success!! method2");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}


