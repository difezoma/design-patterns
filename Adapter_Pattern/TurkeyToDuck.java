public class TurkeyToDuck implements Duck{

    Turkey turkey;

    public TurkeyToDuck(Turkey turkey){
        this.turkey = turkey;
    }

    public void quack(){
        turkey.gobble();
    }

    public void fly(){
        turkey.fly();
        turkey.fly();
        turkey.fly();
    }

}