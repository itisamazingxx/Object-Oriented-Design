package interface_;

/**
 * 演示接口的多态
 */
public class InterfaceExercise {
    public static void main(String[] args) {
        USBInterface phone = new Phone();
        Camera camera = new Camera();
        Computer computer = new Computer();
        computer.work(camera);
    }
}

interface USBInterface {
    public void start();
    public void close();
}

class Computer {
    // 接口的多态
    // 只要是实现了usbInterface接口的实例都可以放入形参
    public void work(USBInterface usbInterface) {
        usbInterface.start();
        usbInterface.close();
    }
}

class Phone implements USBInterface {
    @Override
    public void start() {
        System.out.println("Phone start...");
    }

    @Override
    public void close() {
        System.out.println("Phone close...");
    }
}

class Camera implements USBInterface {
    @Override
    public void start() {
        System.out.println("Camera starts...");
    }

    @Override
    public void close() {
        System.out.println("Camera close...");    }
}



