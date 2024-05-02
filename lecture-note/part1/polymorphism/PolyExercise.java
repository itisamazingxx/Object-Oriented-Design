package polymorphism;

/**
 * 多态的练习
 */
public class PolyExercise {
    public static void main(String[] args) {
        double d = 13.14;
        long num = (long) d;
        Object str = "Hello"; // 向上转型
        Object num2 = new Integer(5);
        Integer number = (Integer) num2;

        // 创建Person类型的数组，存储不同类型的Person实例
        Person[] people = new Person[3];
        people[0] = new Teacher("Alice", 30, "Math");
        people[1] = new Student("Bob", 20, "Computer Science");
        people[2] = new Person("Charlie", 40);
        for (int i = 0; i < people.length; i++) {
            if (people[i] instanceof Student) {
                Student student = (Student) people[i]; // 向下转型
                student.study();
            } else if (people[i] instanceof Teacher) {
                Teacher teacher = (Teacher) people[i];
                teacher.teach();
            } else if (people[i] instanceof Person) {
                continue;
            } else {
                System.out.println("Invalid Type!");
            }
        }
        testPerson(people[0]);
    }

    public static void testPerson(Person p) {
        if (p instanceof Teacher) {
            ((Teacher) p).teach(); // 向下转型
        }
    }
}

class Person {
    int age;
    String name;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void say() {
        System.out.println("I am " + name + ", age " + age);
    }

}

class Teacher extends Person {

    String subject;

    Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }
    public void teach() {
        super.say();
        System.out.println("I teach " + subject);
    }
}

class Student extends Person {

    String major;

    Student(String name, int age, String major) {
        super(name, age);
        this.major = major;
    }

    public void study() {
        super.say();
        System.out.println("My major is " + major);
    }

}
