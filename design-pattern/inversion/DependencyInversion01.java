package inversion;

/**
 * This file illustrates new version after applied dependency inversion
 */
public class DependencyInversion01 {
    public static void main(String[] args) {
        Wechat wechat = new Wechat();
        IMessage iMessage = new IMessage();
        User user = new User();
        user.receiveMessage(wechat);
        user.receiveMessage(iMessage);
    }
}

interface IReceiver {
    public String getInfo();
}

class Wechat implements IReceiver {
    @Override
    public String getInfo() {
        return "Wechat Info: Hello Awesome World!";
    }

}

class IMessage implements IReceiver {
    @Override
    public String getInfo() {
        return "IMessage Info: Hello Awesome World!";
    }
    
}

class User {
    public void receiveMessage(IReceiver i) {
        System.out.println(i.getInfo());
    }
}