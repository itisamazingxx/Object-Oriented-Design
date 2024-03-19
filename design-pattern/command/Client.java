package command;

public class Client {

    public static void main(String[] args) {
        LightReceiver lightReceiver = new LightReceiver();
        LightOnCommand lightOnCommand = new LightOnCommand(lightReceiver);
        LightOffCommand lightOffCommand = new LightOffCommand(lightReceiver);

        // Needs a remoter
        RemoteController remoteController = new RemoteController();
        remoteController.setCommand(0, lightOnCommand, lightOffCommand);

        System.out.println("Press Button to open the light!");
        remoteController.onButtonPushed(0);
        remoteController.offButtonPushed(0);
        remoteController.undoButtonPushed();
    }
    
}
