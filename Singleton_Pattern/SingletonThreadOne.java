public class SingletonThreadOne implements Runnable{

    public SingletonThreadOne(){

    }

    public void run(){
        System.out.println("Enter in thread one");
        Singleton.getInstance();
    }

}