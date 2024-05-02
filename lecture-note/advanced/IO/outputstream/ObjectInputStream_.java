import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectInputStream_ {

    // 反序列化需要和序列化的顺序一致
    public static void main(String[] args) {
        String filePath = "/Users/beauwen/Desktop/Object-Oriented-Design/lecture-note/advanced/IO/outputstream/outputstream.ser";
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(filePath))) {
            System.out.println(objectInputStream.readInt());
            System.out.println(objectInputStream.readBoolean());
            System.out.println(objectInputStream.readDouble());
            System.out.println(objectInputStream.readUTF());
            try {
                System.out.println(objectInputStream.readObject());
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
            System.out.println("Unserialized Success!!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
}
