public class AdapterApp {

    public static void main(String[] args) {

        StandardTurkey standard = new StandardTurkey();

        Duck transformedGobble = new TurkeyToDuck(standard);
        transformedGobble.quack();
        transformedGobble.fly();
        
    }

}