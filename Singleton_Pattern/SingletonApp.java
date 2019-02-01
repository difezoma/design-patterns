public class SingletonApp{

    public static void main(String... args){
        
        Runnable singletonThread = new SingletonThread();
        Runnable singletonThreadOne = new SingletonThread();
        Thread thread = new Thread(singletonThread);
        Thread threadOne = new Thread(singletonThreadOne);
        thread.start();
        threadOne.start();

        Runnable runnable = new Runnable(){
        
            @Override
            public void run() {

                System.out.println("hey hey hey");
                
            }
        };

        Thread threadtwo = new Thread(runnable);
        threadtwo.start();
        
        
    }

}