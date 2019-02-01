public class RubberDuck implements Duck{

    String type;

    public Duck(){
        type = "Rubber Duck";
    }

    public void quack(){
        System.out.println("I am Quacking");
    }

    public void fly(){
        System.out.println("I am Flying");
    }

}