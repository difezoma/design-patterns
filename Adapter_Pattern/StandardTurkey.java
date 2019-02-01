public class StandardTurkey implements Turkey{

    String type;

    public StandardTurkey(){
        type = "Standard Turkey";
    }

    public void gobble(){
        System.out.println("I am gobbling");
    }

    public void fly(){
        System.out.println("Short fly");
    }

}