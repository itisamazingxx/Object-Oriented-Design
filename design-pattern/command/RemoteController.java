package command;

public class RemoteController {

    private Command[] onCommands;
    private Command[] offCommands;
    Command undoCommand;

    public RemoteController() {
        this.onCommands = new Command[5];
        this.offCommands = new Command[5];

        for (int i = 0; i < 5; i++) {
            this.onCommands[i] = new NoCommand();
            this.offCommands[i] = new NoCommand();
        }
    }

    public void setCommand(int no, Command onCommand, Command offCommand) {
        this.onCommands[no] = onCommand;
        this.offCommands[no] = offCommand;
    }

    public void onButtonPushed(int no) {
        this.onCommands[no].execute();
        // 记录本次操作 方便撤销
        undoCommand = this.onCommands[no];
    }

    public void offButtonPushed(int no) {
        this.offCommands[no].execute();
        undoCommand = this.offCommands[no];
    }

    public void undoButtonPushed() {
        undoCommand.undo();
    }
    
}
