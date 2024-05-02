package polymorphism;

public class PolyExample02 {

    public static void main(String[] args) {
        Animal animal = new Cat();
        Cat cat = (Cat) animal;
        cat.meow();
    }
}

class Cat extends Animal {
    public void meow() {
        System.out.println("Cats meow..");
    }

}
