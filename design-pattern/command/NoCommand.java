package command;

/**
 * 空执行 用于初始化每个按钮
 * 当调用空命令时，对象什么都不做 (这也是一种设计模式，省去对空判断)
 */
public class NoCommand implements Command{

    @Override
    public void execute() {}

    @Override
    public void undo() {}
    
}
