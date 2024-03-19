
public class Man extends Person {

    public void accept(Action action) {
        action.getManResult(this);
    }
    
}
