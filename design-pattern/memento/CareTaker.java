package memento;
import java.util.ArrayList;
import java.util.List;

public class CareTaker {
    private List<Memento> mementos = new ArrayList<Memento>();

    // 集合里会有很多备忘录对象
    public void add(Memento memento) {
        mementos.add(memento);
    }

    // 获取第index个originator的备忘录对象
    public Memento get(int index) {
        return mementos.get(index);
    }
}
