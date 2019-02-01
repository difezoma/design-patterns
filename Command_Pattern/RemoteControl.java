public class RemoteControl{

    Command[] onCommands = new Command[4];
    Command[] offCommands = new Command[4];
    Command undo;

    public RemoteControl(){
        for(int i=0; i<4; i++){
            onCommands[i] = new NoCommand();
            offCommands[i] = new NoCommand();
        }
        undo = new NoCommand();
    }

    public void setOnCommand(Command command, int slot){
        onCommands[slot] = command;
    }

    public void setOffCommand(Command command, int slot){
        offCommands[slot] = command;
    }

    public void onButton(int slot){
        onCommands[slot].execute();
        undo = onCommands[slot];
    }

    public void offButton(int slot){
        offCommands[slot].execute();
        undo = offCommands[slot];
    }

    public void undoButton(){
        undo.undo();
    }


}