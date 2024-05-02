package IO;

import java.io.File;

public class FileInfo {
    public static void main(String[] args) {
        FileInformation file = new FileInformation();
        file.getInfo();
    }
    
}

class FileInformation {

    public void getInfo() {
        // 首先获取文件对象
        File file = new File("/Users/beauwen/Desktop/Object-Oriented-Design/lecture-note/advanced/IO/task.csv");
        // 获取文件名称
        System.out.println("Gets file name: " + file.getName());
        // 获取文件绝对路径
        System.out.println("Gets file name: " + file.getAbsolutePath());
        // 获取文件父目录
        System.out.println("Gets file name: " + file.getParent());
        // 获取文件大小
        System.out.println("Gets file name: " + file.length());
    }
    
}
