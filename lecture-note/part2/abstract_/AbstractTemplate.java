package abstract_;

public class AbstractTemplate {

}

abstract class Template {
    public abstract void job();

    public long calculate() {
        long start = System.currentTimeMillis();
        job();
        long end = System.currentTimeMillis();
        return (end - start);
    }
}

// 子类继承实现不同的工作方法
