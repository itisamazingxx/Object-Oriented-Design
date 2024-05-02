import java.io.File;

public class FileDirectory {
    
    public static void main(String[] args) {
        Directory file = new Directory();
        file.deleteFile();
    }
}

class Directory {

    public void deleteFile() {
        File file = new File("/Users/beauwen/Desktop/Object-Oriented-Design/lecture-note/advanced/news2.txt");
        if (file.exists()) {
            if (file.delete()) {
                System.out.println("Delete Success!!");
            } else {
                System.out.println("Delete Failed!!");
            }
        } else {
            System.out.println("Doesn't exist!!");
        }
    }
}