public class RemoteControlAction{

    public static void main(String[] args) {

        RemoteControl remoteControl = new RemoteControl();

        Light light = new Light();
        Command lightOnCommand = new LightOnCommand(light);
        Command lightOffCommand = new LightOffCommand(light);

        remoteControl.setOnCommand(lightOnCommand, 0);
        remoteControl.setOffCommand(lightOffCommand, 0);

        /* for(int i=0; i<4;i++){
            remoteControl.onButton(i);
        }

        for(int i=0; i<4;i++){
            remoteControl.offButton(i);
        } */

        remoteControl.onButton(0);
        remoteControl.offButton(0);
        remoteControl.undoButton();
        
    }

}