public class SingletonThread implements Runnable{

    public SingletonThread(){

    }

    public void run(){
        System.out.println("Enter in thread");
        Singleton.getInstance();

    }

}