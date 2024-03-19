
// 在这里使用到了双分派 

public class Woman extends Person {

    public void accept(Action action) {
        action.getWomanResult(this);
    }
    
}
