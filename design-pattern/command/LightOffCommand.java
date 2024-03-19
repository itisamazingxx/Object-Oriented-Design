package command;

public class LightOffCommand implements Command{

    LightReceiver light;

    public LightOffCommand(LightReceiver light) {
        super();
        this.light = light;
    }

    /**
     * 聚合IReceiver
     */
    @Override
    public void execute() {
        this.light.off();
    }

    @Override
    public void undo() {
        this.light.on();
    }
    
    
}
