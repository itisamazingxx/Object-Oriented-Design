import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class ObjectOutputStream_ {
    public static void main(String[] args) {
        String filePath = "/Users/beauwen/Desktop/Object-Oriented-Design/lecture-note/advanced/IO/outputstream/outputstream.txt";
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(filePath))) {
            objectOutputStream.writeInt(100);
            objectOutputStream.writeBoolean(false);
            objectOutputStream.writeDouble(0.7);
            objectOutputStream.writeUTF("Awesome!!");
            objectOutputStream.writeObject(new Dog("ariel", 8));
            
            System.out.println("Serialized Success!!");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Serialization failed with IOException.");
        }
    }

}

class Dog implements Serializable {
    private String name;
    private int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }
}