public class Singleton{

    private static Singleton newInstance;

    private Singleton(){

    }

    public static synchronized Singleton getInstance(){

        if(newInstance == null){
            System.out.println("Creating new instance");
            newInstance = new Singleton();
            return newInstance;
        }else{
            System.out.println("Returning instance");
            return newInstance;
        }

    }

}