/**
 * Override Example
 */
public class OverRide01 {
    public static void main(String[] args) {
        
    }
    
}

class Base {
    public int num;

    public Object hi() {
        return null;
    }

    public String say() {
        return "num: " + num;
    }
}

class Layer01 extends Base {
    public String name;

    
    @Override
    // 注意与父类方法返回值的区别
    public String hi() {
        return null;
    }

    @Override
    public String say() {
        // 重写时直接super.调用父类方法
        return super.say() + " name: " + name;
    }
}
