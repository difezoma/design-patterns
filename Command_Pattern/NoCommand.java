public class NoCommand implements Command{

    public NoCommand(){

    }

    public void execute(){
        System.out.println("Nothing happens...");
    }

    public void undo(){
        System.out.println("Nothing happens...");
    }

}