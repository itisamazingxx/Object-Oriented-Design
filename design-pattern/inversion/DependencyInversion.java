package inversion;
/**
 * This file illustrate the old version before applied dependency inversion principle
 */
public class DependencyInversion {
    public static void main(String[] args) {
        Person person = new Person();
        Email email = new Email();
        person.receiveMessage(email);
    }
    
}

class Email {
    public String getInfo() {
        return "Email Info: Hello Awesome World!";
    }
}

class Person {
    // Person 直接依赖Email类 如后续依然有新类添加
    // (Receiving message from wechat, imessage etc...)
    // 我们需要在Person中也添加相关的方法
    // To fixed this: adding a new abstract interface IReceiver, Person类与接口类发生依赖
    public void receiveMessage(Email email) {
        System.out.println(email.getInfo());
    }
}
