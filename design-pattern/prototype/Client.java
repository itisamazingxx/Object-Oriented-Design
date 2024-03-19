package prototype;

public class Client {
    public static void main(String[] args) {
        Sheep sheep = new Sheep("tom", 5, "while");
        Sheep sheep2 = (Sheep) sheep.clone();
        System.out.println("Another cloned sheep name " + sheep2.getName());
    }
}