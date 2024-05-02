public class Clone {
    public static void main(String[] args) {
        Person p = new Person();
        p.name = "Ariel";
        p.age = 20;
        MyTool tool = new MyTool();
        Person p2 = tool.copyPerson(p);
    }
}

class Person {
    String name;
    int age;
}

class MyTool {
    public Person copyPerson(Person p) {
        Person p2 = new Person();
        p2.name = p.name;
        p2.age = p.age;
        return p2;
    }
}

